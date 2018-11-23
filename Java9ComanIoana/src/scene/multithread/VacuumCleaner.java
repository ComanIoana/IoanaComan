/*
 * Vacuum cleaner thread
 */
package scene.multithread;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author AJC
 */
public class VacuumCleaner extends Thread {
    
    private AtomicBoolean power = new AtomicBoolean();
    private AtomicBoolean motor = new AtomicBoolean();
    private AtomicBoolean fan = new AtomicBoolean();
    
    public synchronized void isOn(){
        System.out.println("Vacuum cleaner is on");
        power.set(true);
        motor.set(true);
        fan.set(true);
    }
    
    public synchronized void isOff(){
        System.out.println("Vacuum cleaner is off");
        power.set(false);
        motor.set(false);
        fan.set(false);
    }
    
    @Override
    public void run (){
         isOn();
         try{
             Thread.sleep(6000);
         } catch (InterruptedException ex) {
             System.out.println("Vacuum cleaner was interrupted");
        }
        isOff();
    }
}
