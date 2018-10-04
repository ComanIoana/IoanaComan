/*
 * Buton din care vom creea butoanele
 */
package oopcomputer;

/**
 *
 * @author AJC
 */
public class Buton {
    private Character simbol;
    
    public Buton(Character noulSimbol){
        simbol = noulSimbol;       
    }
    
    public Character apasa (){
        return simbol;
    }
   
}
