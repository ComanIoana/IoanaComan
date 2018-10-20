/*
 * Clasa triunghi
 */
package tdd;

/**
 *
 * @author AJC
 */
public class Triunghi extends Plana {
    public static final String TRIUNGHI = "TRIANGLE:";
    public static final String TRIUNGHI_END = " with three straight sides and three angles.";      
    
    @Override
    public String getDefinition(){
        String definition = TRIUNGHI + super.getDefinition() + TRIUNGHI_END;
        return definition;
    }
    
}
