/*
 * Clasa patrulater dreptunghic
 */
package tdd;


/**
 *
 * @author AJC
 */
public class PatrulaterDreptunghic extends Patrulater {
    public static final String ANGLE = " and four right angles";
    
    @Override
    public String getDefinition(){
       String definition = super.getDefinition() + ANGLE;
       return definition;
    }
}
