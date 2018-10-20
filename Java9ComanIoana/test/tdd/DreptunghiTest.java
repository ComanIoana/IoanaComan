/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AJC
 */
public class DreptunghiTest {
    
    public DreptunghiTest() {
    }

    /**
     * Test of getDefinition method, of class Dreptunghi.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Dreptunghi instance = new Dreptunghi();
        String expResult = "RECTANGLE: a plane figure with four straight sides and four right angles, especially one with unequal adjacent sides, in contrast to a square.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
