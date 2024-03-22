/*
Write some Java code that asks the user how many favorite things they have.
Based on their answer, you should create a String array of the correct size.
Then ask the user to enter the things and store them in the array you created.
Finally, print out the contents of the array.
 */
import java.util.*;
public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int favoriteNumber = scan.nextInt();
        scan.nextLine(); //nextInt makes next line blank!!! scan to allow user input instead of assigning blank to first fav thing
        String[] favoriteThings = new String[favoriteNumber];
        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println("Enter your thing: ");
            favoriteThings[i] = scan.nextLine();

        }
        String formattedThings = " "; // creating string to print out all favorite things in a nice sentence
        for (int i = 0; i < favoriteThings.length; i++) { //looping through array and adding to string with commas and "and" before last element
            if (i != favoriteThings.length -1) {
                formattedThings += favoriteThings[i] + ", ";
            }
            else {
                formattedThings += "and " + favoriteThings[i]+ ".";
            }
        }
        System.out.println("Your favorite things are:" + formattedThings);

    }
}
