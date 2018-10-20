/*
 * Testing Circle
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AJC
 */
public class CercTest {
    
    public CercTest() {
    }

    /**
     * Test of getDefinition method, of class Cerc.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Cerc instance = new Cerc();
        String expResult = "CIRCLE: a plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
