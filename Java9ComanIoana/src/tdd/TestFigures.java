/*
 * See all figures printed
 */
package tdd;

import java.util.LinkedList;

/**
 *
 * @author AJC
 */
public class TestFigures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cerc circle = new Cerc();
        Dreptunghi rectangle = new Dreptunghi();
        Patrat square = new Patrat();
        Triunghi triangle = new Triunghi();
        
        //Creeam o colectie de date si incarcam in ea obiectele de mai sus
        LinkedList <FiguraGeometrica> ListaFiguri = new LinkedList();
        ListaFiguri.add(circle);
        ListaFiguri.add(rectangle);
        ListaFiguri.add(square);
        ListaFiguri.add(triangle);
        
        //Parcurgem lista si listam figurile
        System.out.println ("\nList of Geometric Figures\n");
        ListaFiguri.forEach((t) -> {
            System.out.println (t.getDefinition());
        });
        System.out.println ("\n");
    }
    
}
