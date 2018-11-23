/*
 * Man thread
 */
package scene.multithread;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author AJC
 */
public class Man extends Thread {
    
    AtomicBoolean vacuum = new AtomicBoolean();
    private VacuumCleaner evac;
    private Woman wife;
    private Tv tv;

    public Man(VacuumCleaner evac, Woman wife, Tv tv) {
        this.evac = evac;
        this.wife = wife;
        this.tv = tv;
    }
    
    public synchronized void vacuuming(){
        System.out.println("Husband is vacuuming");
        evac.start();
        vacuum.set(true);
    }
    public synchronized void wakeWife(){
        System.out.println("Husband wakes wife");
        notify();
        wife.interrupt();
    }
    
    @Override
    public void run(){
        vacuuming();
        try {
            tv.join();
        } catch (InterruptedException ex) {
            System.out.println("Man was intertupted");
        }
        wakeWife();
    }
}
