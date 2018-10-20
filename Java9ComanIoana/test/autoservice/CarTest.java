/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoservice;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AJC
 */
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of isRENTABLE method, of class Car.
     */
    @Test
    public void testIsRENTABLE() {
        System.out.println("isRENTABLE");
        boolean expResult = true;
        boolean result = Car.isRENTABLE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isSALEABLE method, of class Car.
     */
    @Test
    public void testIsSALEABLE() {
        System.out.println("isSALEABLE");
        boolean expResult = true;
        boolean result = Car.isSALEABLE();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSalePrice method, of class Car.
     */
    @Test
    public void testSetSalePrice() {
        System.out.println("setSalePrice");
        int salePrice = 15000;
        Car instance = new Car();
        instance.setSalePrice(salePrice);
        int expResult = 15000;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setRentPrice method, of class Car.
     */
    @Test
    public void testSetRentPrice() {
        System.out.println("setRentPrice");
        int rentPrice = 250;
        Car instance = new Car();
        instance.setRentPrice(rentPrice);
        int expResult = 250;
        int result = instance.getRentPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car();
        String expResult = "Default car name";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Car instance = new Car();
        instance.setColor(Car.Color.GREY);
        Car.Color expResult = Car.Color.GREY;
        Car.Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car();
        int expResult = 100;
        int result = instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "Volvo";
        Car instance = new Car();
        instance.setName(newName);
        String expResult = "Volvo";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Car.Color newColor = Car.Color.BLACK;
        Car instance = new Car();
        instance.setColor(newColor);
        Car.Color expResult = Car.Color.BLACK;
        Car.Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        short newSpeed = 120;
        Car instance = new Car();
        instance.setSpeed(newSpeed);
        short expResult = 120;
        short result = (short) instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        short increase = 10;
        Car instance = new Car();
        instance.setSpeed((short)120);
        instance.increaseSpeed(increase);
        short expResult = 130;
        short result = (short) instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        short decrease = 20;
        Car instance = new Car();
        instance.setSpeed((short)130);
        instance.decreaseSpeed(decrease);
        short expResult = 110;
        short result = (short) instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of increaseSalePrice method, of class Car.
     */
    @Test
    public void testIncreaseSalePrice() {
        System.out.println("increaseSalePrice");
        int inc = 1000;
        Car instance = new Car();
        instance.setSalePrice(15000);
        instance.increaseSalePrice(inc);
        int expResult = 16000;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseSalePrice method, of class Car.
     */
    @Test
    public void testDecreaseSalePrice() {
        System.out.println("decreaseSalePrice");
        int inc = 500;
        Car instance = new Car();
        instance.setSalePrice(12000);
        instance.decreaseSalePrice(inc);
        int expResult = 11500;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of increaseRentPrice method, of class Car.
     */
    @Test
    public void testIncreaseRentPrice() {
        System.out.println("increaseRentPrice");
        int incr = 20;
        Car instance = new Car();
        instance.setRentPrice(250);
        instance.increaseRentPrice(incr);
        int expResult = 270;
        int result = instance.getRentPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseRentPrice method, of class Car.
     */
    @Test
    public void testDecreaseRentPrice() {
        System.out.println("decreaseRentPrice");
        int incr = 15;
        Car instance = new Car();
        instance.setRentPrice(280);
        instance.decreaseRentPrice(incr);
        int expResult = 265;
        int result = instance.getRentPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSalePrice method, of class Car.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Car instance = new Car();
        instance.setSalePrice(2800);
        int expResult = 2800;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRentPrice method, of class Car.
     */
    @Test
    public void testGetRentPrice() {
        System.out.println("getRentPrice");
        Car instance = new Car();
        instance.setRentPrice(150);
        int expResult = 150;
        int result = instance.getRentPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
