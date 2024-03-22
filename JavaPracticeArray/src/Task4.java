/*
Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any
integers.  Print out the value at the first index and the last index using length - 1 as the index.
Now try printing the value at index = length (e.g., myArray[myArray.length] ).
Notice the type of exception which is produced. Now try to assign a value to the array index 5.
You should get the same type of exception.
 */

import java.util.*;
public class Task4 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        System.out.println(intArray[0]);
        System.out.println(intArray[intArray.length -1]);
        System.out.println(intArray.length);// produces exception java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds
        System.out.println(intArray[5]); // produces same exception ^^ intArray.length = 5
    }

}
