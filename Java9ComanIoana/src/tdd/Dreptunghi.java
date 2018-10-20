/*
 * Clasa dreptunghi
 */
package tdd;

/**
 *
 * @author AJC
 */
public class Dreptunghi extends PatrulaterDreptunghic {
    public static final String DREPTUNGHI = "RECTANGLE:";
    public static final String DREPTUNGHI_END = ", especially one with unequal adjacent sides, in contrast to a square.";
    

    @Override
    public String getDefinition(){
        String definition = DREPTUNGHI + super.getDefinition() + DREPTUNGHI_END;
        return definition;
    }
}
