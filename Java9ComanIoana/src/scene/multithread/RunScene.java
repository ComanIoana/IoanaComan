/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scene.multithread;

/**
 *
 * @author AJC
 */
public class RunScene {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Tv tv = new Tv();
        
        VacuumCleaner evac = new VacuumCleaner();
        Cigarette cigar = new Cigarette();
        Woman wife = new Woman(cigar); 
        Man husband = new Man(evac, wife, tv);
        
        try {
        tv.start();
        husband.start();
        wife.start();
        } catch (java.lang.IllegalThreadStateException e) {
            System.out.println(e.getMessage());
        }    
    }
}
