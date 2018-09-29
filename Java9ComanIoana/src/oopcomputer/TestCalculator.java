/*
 * Testing calculator
 */
package oopcomputer;

import java.util.Scanner;

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
        // Apasam butoane pana apare un operator
        calculator.ecran.setAfisaj(Character.toString(calculator.buton1.apasa()));             
        calculator.ecran.setAfisaj(calculator.ecran.getAfisaj() + Character.toString(calculator.buton2.apasa()));        
        calculator.ecran.setAfisaj(calculator.ecran.getAfisaj() + Character.toString(calculator.buton3.apasa()));
        calculator.alu.setOperandUnu(Integer.parseInt(calculator.ecran.getAfisaj()));
        System.out.print(calculator.alu.getOperandUnu());       
       
        calculator.alu.setOperand(calculator.butonPlus.apasa()); 
        System.out.print(calculator.alu.getOperand());         
        
        calculator.ecran.setAfisaj(Character.toString(calculator.buton3.apasa()));        
        calculator.ecran.setAfisaj(calculator.ecran.getAfisaj() + Character.toString(calculator.buton2.apasa()));        
        calculator.ecran.setAfisaj(calculator.ecran.getAfisaj() + Character.toString(calculator.buton1.apasa()));
        calculator.alu.setOperandDoi(Integer.parseInt(calculator.ecran.getAfisaj()));
        System.out.print(calculator.alu.getOperandDoi());             
     
        // Apasam butoane pana apare egal        
        calculator.alu.calculeaza();
        System.out.print(calculator.butonEgal.apasa()); 
                        
        // Afisam rezultatul
        calculator.ecran.setAfisaj(Character.toString(calculator.buton1.apasa()));
        System.out.print(calculator.alu.getRezultat());
    }
    
}
