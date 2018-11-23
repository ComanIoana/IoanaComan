/*
 * Cigarette thread
 */
package scene.multithread;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author AJC
 */
public class Cigarette extends Thread{
    
    private AtomicBoolean burning = new AtomicBoolean();
    private AtomicInteger lenght = new AtomicInteger();
    
    public synchronized void burn(){
        System.out.println("Cigar is burning");
        burning.set(true);
        lenght.set(5);
    }
    
    @Override
    public void run(){   
        burn();
        try{
            for(int min=0;min<5;min++){
               lenght.decrementAndGet();
               Thread.sleep(1000);
            }       
        } catch (InterruptedException ex) {
            System.out.println("Cigar was put out");
        }
        burning.set(false);
        System.out.println("Cigar is finished");  
    }   
}
