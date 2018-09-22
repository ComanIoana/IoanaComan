/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author AJC
 */
public class CalculationExecutor {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Calculator aCalculator = new Calculator();
        
        try{
        System.out.println("Plese intoduce first number:");
        Scanner sci = new Scanner(System.in);
        int i = sci.nextInt();
                
        System.out.println("Please intoduce operator");
        Scanner sco = new Scanner(System.in);
        char operator = sco.next().charAt(0);
        if (operator != '+' && operator != '-' && operator != '*' && 
                operator != '/'){
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(0);
        } 
            
        System.out.println("Please instroduce second number:");
        Scanner scj = new Scanner(System.in);
        int j = scj.nextInt();
        
        System.out.println("Please intoduce '='");
        Scanner sce = new Scanner(System.in);
        char equal = sce.next().charAt(0); 
        if (equal != '='){
            System.out.println("Sorry, you introduced wrong data. I quit :(");
            System.exit(0);
        }
        
        System.out.println("Result is");
        
        switch(operator){
            case '+': 
            {   
                int outputAdd = aCalculator.add(i, j);
                System.out.println(outputAdd);
                break;
            }
            case '-':
            {
                int outputDecrease = aCalculator.decrease(i, j);
                System.out.println(outputDecrease);
                break;
            }
            case '*':
            {
                int outputMultiply = aCalculator.multiply(i, j);
                System.out.println(outputMultiply);
                break;
            }    
            case '/':
            {
                int outputDivide = aCalculator.divide(i, j);
                System.out.println(outputDivide);
                break;
            }    
        }
    }catch(InputMismatchException e){
            System.out.println("Sorry, you introduced wrong data. I quit :)");
    }catch (ArithmeticException e){
        System.out.println("Cannot divide by 0");
    }
    }
}

