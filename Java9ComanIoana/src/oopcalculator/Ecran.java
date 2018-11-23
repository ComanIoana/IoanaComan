/*
 * Ecranul calculatorului
 */
package oopcalculator;

/**
 *
 * @author AJC
 */
public class Ecran {
    private String afisaj = "0";
    private Carcasa stapana;
    
    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }
    
    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String noulAfisaj) {
        
        switch (noulAfisaj) {
            case "+":
                operatiuneLocala('+');
                break;
            case "-":
                operatiuneLocala('-');
                break;
            case "*":
                operatiuneLocala('*');
                break;    
            case "/":
                operatiuneLocala('/');
                break;    
            case "=":
                afisaj = noulAfisaj;
                System.out.println(afisaj);
                stapana.getAlu().calculeaza();
                System.out.println(stapana.getAlu().getRezultat());
                break;  
            default:
                if('0' == afisaj.charAt(0) ){
                    afisaj = noulAfisaj;
                } else {
                afisaj = afisaj + noulAfisaj;
                }
                int afisajInt = Integer.parseInt(afisaj);
                int operandUnu = stapana.getAlu().getOperandUnu();
                int operandDoi = stapana.getAlu().getOperandDoi();
                
                if(0 == operandUnu || ' ' == stapana.getAlu().getOperator()){
                    stapana.getAlu().setOperandUnu(afisajInt);
                    System.out.println(afisaj);
                }
                else if (0 == operandDoi || ' ' != stapana.getAlu().getOperator()){
                    stapana.getAlu().setOperandDoi(afisajInt);
                    System.out.println(afisaj);
                }
        }
    }
    /**
     * Private method for computation
     */
    private void operatiuneLocala(char c){
        stapana.getAlu().setOperator(c);
        afisaj = Character.toString(c);
        System.out.println(afisaj);
        afisaj="0";
    }
}