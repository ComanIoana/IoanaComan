/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopcomputer;

import com.oracle.nio.BufferSecrets;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AJC
 */
public class ButonTest {
    
    public ButonTest() {
    }

    /**
     * Test of apasa method, of class Buton.
     */
    @Test
    public void testApasa() {
        System.out.println("apasa");
        Carcasa stapana = new Carcasa();
        stapana.buton3.apasa();
        stapana.buton1.apasa();
        stapana.butonPlus.apasa();
        stapana.buton2.apasa();
        stapana.butonEgal.apasa();
        String expResult = "33";
        String result = stapana.getEcran().getAfisaj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
