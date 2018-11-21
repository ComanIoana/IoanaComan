/*
 * Object shared by threads
 */
package multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author AJC
 */
public class Counter {
    
    private AtomicInteger value = new AtomicInteger(0);
    
    /**
     * Method increments the value
     */  
    public void increment() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try{
            value.getAndIncrement();
        } finally {
            lock.unlock();
        }    
    }
    
    /**
     * Method decrements the value 
     */  
    public void decrement() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try{
            value.getAndDecrement();
        } finally {
            lock.unlock();
        }    
    }
    
    public int getValue() {
        return value.get();
    }
}
