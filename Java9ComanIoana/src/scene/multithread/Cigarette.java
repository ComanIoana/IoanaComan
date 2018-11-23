/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scene.multithread;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author AJC
 */
public class Cigarette extends Thread{
    
    private AtomicBoolean burning = new AtomicBoolean();
    
    public synchronized void burn(){
        System.out.println("Cigarette is burning");
        burning.set(true);
    }
    
    @Override
    public void run(){   
        burn();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println("Cigar was put out");
        }    
        System.out.println("Cigarette is finished");  
    }   
}
