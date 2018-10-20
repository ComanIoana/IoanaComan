/*
 * Clasa patrat
 */
package tdd;

/**
 *
 * @author AJC
 */
public class Patrat extends PatrulaterDreptunghic{
    public static final String DREPT = " equal";
    public static final String PATRAT = "SQUARE:";
    
    @Override
    public String getDefinition(){
        String definition = PATRAT + super.getDefinition().substring(0,25)+ DREPT + super.getDefinition().substring(25) + ".";
        return definition;
    }
}
