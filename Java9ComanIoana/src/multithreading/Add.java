/*
 * Parallel thread which increases the counter
 */
package multithreading;

/**
 *
 * @author AJC
 */
public class Add extends Thread {
    
    private Counter counter;
    
    public Add(Counter commonCounter){
        counter = commonCounter;
    }
    
    @Override
    public void run(){
        for (int i=0; i<10000; i++){
            counter.increment();
        }    
    }
}
