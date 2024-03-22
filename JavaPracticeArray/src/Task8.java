/*
Write a program that creates a String array of 5 elements and swaps the first element with
the middle element without creating a new array.
 */

import java.util.*;
public class Task8 {
    public static void main(String[] args) {
        String[] stringArray = {"first element", "second element", "middle element", "fourth element", "last element"};
        System.out.println(Arrays.toString(stringArray));
        String firstElement = stringArray [0]; //creates a record of original first element to assign after first element is swapped to new value
        stringArray [0]= stringArray[2];
        stringArray [2] = firstElement;
        System.out.println(Arrays.toString(stringArray));



    }
}
