/*
 * Parallel thread which decreases the counter value
 */
package multithreading;

/**
 *
 * @author AJC
 */
public class Decrease extends Thread{
    
    private Counter counter;
    
    public Decrease(Counter commonCounter){
        counter = commonCounter;
    }
    
    @Override
    public void run(){
        for (int i=0; i<10000; i++){  
            counter.decrement();
        }
    }
}
