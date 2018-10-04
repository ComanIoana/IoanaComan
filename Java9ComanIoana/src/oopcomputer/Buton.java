/*
 * Buton din care vom creea butoanele
 */
package oopcomputer;

/**
 *
 * @author AJC
 */
public class Buton {
    private Character simbol;
    private Carcasa stapana;    
    
    public Buton(Character noulSimbol, Carcasa nouaCarcasa){
        simbol = noulSimbol; 
        stapana = nouaCarcasa;
    }
    
    public void apasa (){  
        System.out.print("Afisaj dupa apasarea butonului " + simbol + " : ");
        /*Daca nici o cifra nu a fost introdusa sau prima cifra este 0
        * nu se va realiza concatenarea intre cifre
        */
        if (stapana.getEcran().getAfisaj().charAt(0) == ' ' || 
            stapana.getEcran().getAfisaj().charAt(0) == '0' ){
                stapana.getEcran().setAfisaj(simbol.toString());
        }
        //Cand se apasa un operator se inregistreaza OperandUnu si se sterge afisajul
        else if (simbol == '+' || simbol == '-' || simbol == '*' || simbol == '/'){
            stapana.getAlu().setOperandUnu(Integer.parseInt(stapana.getEcran().getAfisaj()));
            stapana.getAlu().setOperator(simbol);
            stapana.getEcran().setAfisaj(" ");
        }
        //Cand se apasa egal se inregistreaza OperandDoi si se afiseaza rezultatul
        else if (simbol == '='){
            stapana.getAlu().setOperandDoi(Integer.parseInt(stapana.getEcran().getAfisaj()));
            stapana.getAlu().calculeaza();
            stapana.getEcran().setAfisaj(stapana.getAlu().getRezultat().toString());
        }
        //Cand se apasa butoane cu valori numerice se afiseaza cifrele ce vor forma un nr.
        else {         
        stapana.getEcran().setAfisaj(stapana.getEcran().getAfisaj() + simbol.toString());        
        }
    }  
}