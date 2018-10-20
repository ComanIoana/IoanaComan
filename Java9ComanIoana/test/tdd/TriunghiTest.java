/*
 * Testing Triunghi
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AJC
 */
public class TriunghiTest {
    
    public TriunghiTest() {
    }

    /**
     * Test of getDefinition method, of class Triunghi.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Triunghi instance = new Triunghi();
        String expResult = "TRIANGLE: a plane figure with three straight sides and three angles.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
