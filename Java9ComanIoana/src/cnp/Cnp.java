/*
 * Verify CNP
 */
package cnp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author AJC
 */
public class Cnp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*CNP format :
        * Gender 1 or 2
        * Month 01-12
        * Day 01-31
        * Year 1800-2018
        * Other 4 digits
        */
        String regex = "^[1-2](?!00|1[3-9])[0-1][0-9](?!00|3[2-9])[0-3][0-9](18|19|20?!20[2-9]9)[0-9]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        // read the source string using a new Scanner object
        Scanner scannerSourceString = new Scanner(System.in);
        System.out.println("Insert CNP: ");
        String source = scannerSourceString.nextLine();
        // create the matcher as result of applying regex on source string
        Matcher matcher = pattern.matcher(source);
        boolean found = false;
        // if the regular expression or pattern was found
        if (matcher.matches()){
           System.out.println("Valid CNP");
        }
        // if regular expression or pattern was not found in source string
        else {
            System.out.println("Invalid CNP:(");
        }
    }
    
}
