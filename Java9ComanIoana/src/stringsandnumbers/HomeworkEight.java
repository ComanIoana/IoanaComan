/*
 * Strings and Numbers Homework
 */
package stringsandnumbers;

/**
 *
 * @author AJC
 */
public class HomeworkEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hannah = "Did Hannah see bees? Hannah did.";
        //What is the value displayed by the expression hannah.length()?
        System.out.println(hannah.length());
        //What is the value returned by the method call hannah.charAt(12)?
        System.out.println(hannah.charAt(12));
        //Write an expression that refers to the letter b in the string referred to by hannah.
        System.out.println(hannah.indexOf('b'));
        System.out.println(hannah.charAt(15));
        //How long is the string returned by the following expression? What is the string?
        String a = "Was it a car or a cat I saw?";
        System.out.println(a.substring(9, 12)); 
        System.out.println(a.substring(9, 12).length());
        //Show two ways to concatenate the following two strings together to get the string "Hi, mom.".
        String hi = "Hi, ";
        String mom = "mom.";
        String hiMom = hi + mom;
        System.out.println(hiMom);
        System.out.println(hi.concat(mom));
        //Write a program that computes your initials from your full name and displays them.
        String myName = "Coman Ioana Alexandra"; 
        String initials;
        for (int i = 0; i < myName.length(); i++) {
            if (Character.isUpperCase(myName.charAt(i))) {
                initials = Character.toString(myName.charAt(i));
                System.out.print(initials);            
            }
        }
        //Alternative 
        initials = Character.toString(myName.charAt(0)) + 
                Character.toString(myName.charAt(myName.indexOf(' ')+1)) +
                Character.toString(myName.charAt(myName.lastIndexOf(' ')+1));
        System.out.println();
        System.out.println(initials);
    }
}
