/*
 * Testing patrat
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AJC
 */
public class PatratTest {
    
    public PatratTest() {
    }

    /**
     * Test of getDefinition method, of class Patrat.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Patrat instance = new Patrat();
        String expResult = "SQUARE: a plane figure with four equal straight sides and four right angles.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
