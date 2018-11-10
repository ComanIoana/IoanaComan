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
public class EcranTest {
    
    public EcranTest() {
    }

    /**
     * Test of getAfisaj method, of class Ecran.
     */
    @Test
    public void testGetAfisaj() {
        System.out.println("getAfisaj");
        Ecran instance = new Ecran();
        String expResult = "0";
        String result = instance.getAfisaj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of setAfisaj method, of class Ecran.
     */
    @Test
    public void testSetAfisaj() {
        System.out.println("setAfisaj");
        String afisaj = "4";
        Ecran instance = new Ecran();
        instance.setAfisaj(afisaj);
        String expResult = "4";
        String result = instance.getAfisaj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
