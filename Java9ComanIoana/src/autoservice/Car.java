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
public class Car implements Saleable, Rentable {

    public enum Color { WHITE, RED, YELLOW, GREEN, GREY, BLACK };
    private Color color;
    private String name;
    private int speed;
    private int salePrice;
    private int rentPrice;
    
    public int getRentPrice() {
        return rentPrice;
    }

    public static boolean isRENTABLE() {
        return RENTABLE;
    }

    public static boolean isSALEABLE() {
        return SALEABLE;
    }
    
    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }
    
    public Car(){
        name = "Default car name";
        speed = 100;
    }
    public Car(String carName,short carSpeed, Color carColor){
        name = carName;
        speed = carSpeed;
        color = carColor;
    }    
    public String getName(){
        return(name);
    }
    public Color getColor(){
        return(color);
    }
    public int getSpeed(){
        return(speed);
    }
    public void setName(String newName){
        name = newName;
    }
    public void setColor(Color newColor){
        color  = newColor;
    }
    public void setSpeed(short newSpeed){
        speed = newSpeed;
    }   
    public void increaseSpeed(short increase){
        speed = speed + increase;
    }
    public void decreaseSpeed(short decrease){
        speed = speed - decrease;
    }
    
    public void increaseSalePrice(int inc){
        salePrice = salePrice + inc;
    }
    public void decreaseSalePrice(int inc){
        salePrice = salePrice - inc;
    }
    public void increaseRentPrice(int incr){
        rentPrice = rentPrice + incr;
    }
    public void decreaseRentPrice(int incr){
        rentPrice = rentPrice - incr;
    }
    
    @Override
    public int getSalePrice() {
        return(salePrice);
    }
    @Override
    public int getDailyRentPrice() {
        return(rentPrice);
    }
}

