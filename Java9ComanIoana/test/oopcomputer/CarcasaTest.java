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
public class CarcasaTest {
    
    public CarcasaTest() {
    }

    /**
     * Test of getEcran method, of class Carcasa.
     */
    @Test
    public void testGetEcran() {
        System.out.println("getEcran");
        Carcasa instance = new Carcasa();
        String expResult = "0";
        String result = instance.getEcran().getAfisaj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAlu method, of class Carcasa.
     */
    @Test
    public void testGetAlu() {
        System.out.println("getAlu");
        Carcasa instance = new Carcasa();
        instance.getAlu().setRezultat(321);
        Integer expResult = 321;
        Integer result = instance.getAlu().getRezultat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
