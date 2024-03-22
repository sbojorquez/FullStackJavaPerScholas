/*
Write a program where you create an array of 5 elements.
Loop through the array and print the value of each element, except for the middle (index 2) element.
 */
import java.util.*;
public class Task7 {
    public static void main(String[] args) {
        int[] intArray = {0,1,2,3,4};
        for (int i = 0; i < intArray.length; i++) {
            if (i != 2){
                System.out.println(intArray[i]);
            }

        }

    }
}
