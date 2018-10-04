/*
 * Testing calculator
 */
package oopcomputer;

/**
 *
 * @author AJC
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creeaza un calculator
        Carcasa calculator = new Carcasa();

        //La pornire se afiseaza 0 
        System.out.println("Afisaj la pornire: " + calculator.getEcran().getAfisaj());
       
        // Introducem primmul numar        
        calculator.buton1.apasa();       
        calculator.buton2.apasa();       
        calculator.buton3.apasa();        
       
        //Introducem operator
        calculator.butonMinus.apasa();        
        
        // Introducem al doilea numar
        calculator.buton0.apasa();        
        calculator.buton0.apasa();        
        calculator.buton3.apasa();               
        
        //Aflam rezultatul
        calculator.butonEgal.apasa();
    }
    
}
