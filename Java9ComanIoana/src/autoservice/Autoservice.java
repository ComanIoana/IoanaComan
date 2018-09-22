/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author AJC
 */
public class Autoservice {

    /**
     * @param args the command line arguments
     */
    static Car[] cars = new Car[3];
         
    public static void main(String[] args) {
        cars[0]= new Car("BMW", (short) 250, Car.Color.BLACK);
        cars[0].increaseSpeed((short)10);       
        cars[0].setRentPrice(80);
        cars[0].setSalePrice(15000);
        
        cars[1]=new Car ("Range Rover", (short)200, Car.Color.WHITE);
        cars[1].decreaseSpeed((short)10);        
        cars[1].setRentPrice(70);
        cars[1].setSalePrice(14000);
        
        cars[2]=new Car ("Volvo", (short)180, Car.Color.GREY);
        cars[2].setRentPrice(50);
        cars[2].setSalePrice(12000);
        cars[2].decreaseSalePrice(1200); 
        cars[2].increaseRentPrice(15); 
        
        displayAutoservice();
    } 
    private static void displayAutoservice(){
        System.out.println("----------Autoservice----------");
        System.out.println();
        for(Car x : cars){
        System.out.println("Car Name: " + x.getName());
        System.out.println("Car Color: " + x.getColor());
        System.out.println("Car Speed: " + x.getSpeed());
        System.out.println("Car Sale Price: " + x.getSalePrice());
        System.out.println("Car Renting Price: " + x.getDailyRentPrice());  
        System.out.println();
        }
    }
}
