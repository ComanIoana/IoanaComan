/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autoservice;

/**
 *
 * @author AJC
 */
public class Autoservice {

    /**
     * @param args the command line arguments
     */
    static Car car1 = new Car();
    static Car car2 = new Car();
    static Car car3 = new Car();   
    
    public static void main(String[] args) {
        car1.setName("BMW");
        car1.setColor(Car.Color.BLACK);
        car1.setSpeed(250);
        car1.increaseSpeed(10);          
        
        car2.setName("Range Rover");
        car2.setColor(Car.Color.WHITE);
        car2.setSpeed(200);
        car2.decreaseSpeed(10);        
                     
        car3.setName("Volvo");        
        car3.setColor(Car.Color.GREY);
        car3.setSpeed(180);
        car3.increaseDailyRentPrice(15);
        car3.decreaseSalePrice(1200);
        
        displayAutoservice();
    } 
    private static void displayAutoservice(){
        System.out.println("Car Name: " + car1.getName());
        System.out.println("Car Color: " + car1.getColor());
        System.out.println("Car Speed: " + car1.getSpeed());
        System.out.println("Car Sale Price: " + car1.getSalePrice());
        System.out.println("Car Renting Price: " + car1.getDailyRentPrice());  
        System.out.println();
        System.out.println("Car Name: " + car2.getName());
        System.out.println("Car Color: " + car2.getColor());
        System.out.println("Car Speed: " + car2.getSpeed());
        System.out.println("Car Sale Price: " + car2.getSalePrice());
        System.out.println("Car Renting Price: " + car2.getDailyRentPrice());       
        System.out.println();
        System.out.println("Car Name: " + car3.getName());
        System.out.println("Car Color: " + car3.getColor());
        System.out.println("Car Speed: " + car3.getSpeed());
        System.out.println("Car Sale Price: " + car3.getSalePrice());
        System.out.println("Car Renting Price: " + car3.getDailyRentPrice());
    }
}

