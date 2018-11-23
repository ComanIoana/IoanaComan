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
public class Woman extends Thread{
    
    private AtomicBoolean sleep = new AtomicBoolean();
    private Cigarette cigar;

    public Woman(Cigarette cigar) {
        this.cigar = cigar;
    }
 
    public synchronized void isSleeping (){
        System.out.println("Wife is sleeping");
        sleep.set(true);
    }
    
    public synchronized void isAwake(){
        System.out.println("Wife is awake");
        sleep.set(false);
    }
    
    public synchronized void isSmoking(){
        cigar.start();
    }
    
    @Override
    public void run(){
        isSmoking();
        isSleeping();
        try{   
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            isAwake();
        }    
    }
}
