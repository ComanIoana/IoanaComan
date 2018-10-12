/*
 * Finding if a string is a substring of another string
 */
package stringsandnumbers;

/**
 *
 * @author AJC
 */
public class RegionMatchesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;
        //Go through all the characters until lenght of search is smaller than lenght of find
        for (int i = 0; i <= (searchMeLength - findMeLength); i++) {
            //Parameters (start in search, string to find, start in find, lenght of find)
            if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
                foundIt = true;
                System.out.println(searchMe.substring(i, i + findMeLength));
                break;
            }
        }
        if (!foundIt)
            System.out.println("No match found.");
    }    
}
