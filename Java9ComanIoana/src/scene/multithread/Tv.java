/*
 * TV threads
 */
package scene.multithread;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author AJC
 */
public class Tv extends Thread{
    
    private AtomicBoolean power = new AtomicBoolean();
    private AtomicBoolean favoriteShow = new AtomicBoolean();
    
    public synchronized void otherShow(){
        System.out.println("A show is on TV");
        favoriteShow.set(false);
    }
    
    public synchronized void favoriteShow(){
        System.out.println("Wife's favorite show is on TV");
        favoriteShow.set(true);
    }
    
    @Override
    public void run(){
        power.set(true);
        try{
            otherShow();
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.out.println("TV was turned off");
        }
        favoriteShow();
    }
}
