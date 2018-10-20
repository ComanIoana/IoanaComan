/*
 * Clasa cerc
 */
package tdd;

/**
 *
 * @author AJC
 */
public class Cerc extends Plana {
    public static final String CERC = "CIRCLE:";
    public static final String CERC_END = " whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).";

    @Override
    public String getDefinition(){
        String definition = CERC + super.getDefinition() + CERC_END;
        return definition;
    }
}
