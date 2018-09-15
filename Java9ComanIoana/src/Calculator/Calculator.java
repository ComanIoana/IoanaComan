/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

/**
 *
 * @author AJC
 */
public class Calculator {
    int result = 0;

    public int add (int a, int b) {
        result = a+b;
        return result;
}

    public int decrease (int a, int b){
        result = a-b;
        return result;
}

    public int multiply (int a, int b){
        result = a*b;
        return result;
}

    public int divide (int a, int b){
        result = a/b;
        return result;
}
}

