/*
 * Testing the incrementation and decreentation of the counter by 2 parallel threads
 */
package multithreading;

/**
 *
 * @author AJC
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Counter counter = new Counter();
        Add add = new Add(counter);
        Decrease decrease = new Decrease (counter);
         
        try{ 
            add.start();
            System.out.println(counter.getValue());
            decrease.start();         
            System.out.println(counter.getValue());
        }catch(java.lang.IllegalThreadStateException e){
            System.out.println(e.getMessage());     
        }      
    }    
}
