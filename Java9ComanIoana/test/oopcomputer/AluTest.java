/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcomputer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AJC
 */
public class AluTest {
    
    public AluTest() {
    }

    /**
     * Test of getOperator method, of class Alu.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        Alu instance = new Alu();
        instance.setOperator('+');
        Character expResult = '+';
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class Alu.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character operator = '-';
        Alu instance = new Alu();
        instance.setOperator(operator);
        Character expResult = '-';
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandUnu method, of class Alu.
     */
    @Test
    public void testGetOperandUnu() {
        System.out.println("getOperandUnu");
        Alu instance = new Alu();
        instance.setOperandUnu(100);
        Integer expResult = 100;
        Integer result = instance.getOperandUnu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandUnu method, of class Alu.
     */
    @Test
    public void testSetOperandUnu() {
        System.out.println("setOperandUnu");
        Integer operandUnu = 120;
        Alu instance = new Alu();
        instance.setOperandUnu(operandUnu);
        Integer expResult = 120;
        Integer result = instance.getOperandUnu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOperandDoi method, of class Alu.
     */
    @Test
    public void testGetOperandDoi() {
        System.out.println("getOperandDoi");
        Alu instance = new Alu();
        instance.setOperandDoi(213);
        Integer expResult = 213;
        Integer result = instance.getOperandDoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperandDoi method, of class Alu.
     */
    @Test
    public void testSetOperandDoi() {
        System.out.println("setOperandDoi");
        Integer operandDoi = 321;
        Alu instance = new Alu();
        instance.setOperandDoi(operandDoi);
        Integer expResult = 321;
        Integer result = instance.getOperandDoi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRezultat method, of class Alu.
     */
    @Test
    public void testGetRezultat() {
        System.out.println("getRezultat");
        Alu instance = new Alu();
        instance.setRezultat(100);
        Integer expResult = 100;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRezultat method, of class Alu.
     */
    @Test
    public void testSetRezultat() {
        System.out.println("setRezultat");
        Integer rezultat = 200;
        Alu instance = new Alu();
        instance.setRezultat(rezultat);
        Integer expResult = 200;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculeaza method, of class Alu.
     */
    @Test
    public void testCalculeaza() {
        System.out.println("calculeaza");
        Alu instance = new Alu();
        instance.setOperandUnu(120);
        instance.setOperandDoi(100);
        instance.setOperator('+');
        instance.calculeaza();
        Integer expResult = 220;
        Integer result = instance.getRezultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
