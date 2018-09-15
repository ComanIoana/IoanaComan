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
public class Car implements Saleable, Rentable {

    public enum Color { WHITE, RED, YELLOW, GREEN, GREY, BLACK };
    private Color color;
    private String name;
    private int speed;
    int saleprice = 15000;
    int rentprice = 150;
    public Car(){
        name = "Default car name";
        speed = 100;
    }
    public Car(String carName,int carSpeed, Color carColor){
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
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }   
    public void increaseSpeed(int increase){
        speed = speed + increase;
    }
    public void decreaseSpeed(int decrease){
        speed = speed - decrease;
    }
    
    public void increaseSalePrice(int inc){
        saleprice = saleprice + inc;
    }
    public void decreaseSalePrice(int inc){
        saleprice = saleprice - inc;
    }
    public void increaseDailyRentPrice(int incr){
        rentprice = rentprice - incr;
    }
    public void decreaseDailyRentPrice(int incr){
        rentprice = rentprice - incr;
    }
    
    @Override
    public int getSalePrice() {
        return(saleprice);
    }
    @Override
    public int getDailyRentPrice() {
        return(rentprice);
    }
}

