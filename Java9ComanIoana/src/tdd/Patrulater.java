/*
 * Clasa patrulater
 */
package tdd;

/**
 *
 * @author AJC
 */
public class Patrulater extends Plana{
    public static final String SIDES = " with four straight sides";
    
    @Override
    public String getDefinition(){
        String definition = super.getDefinition() + SIDES;
        return definition;
    }
}
