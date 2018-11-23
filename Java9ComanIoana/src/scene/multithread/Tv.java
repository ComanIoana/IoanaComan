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
        notify();
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
