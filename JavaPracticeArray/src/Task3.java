/*
Write a program that creates an array of String type and initializes it with the strings “red,”
“green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method.
Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
 */
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors.length);
        String[] colorsClone= colors.clone(); /// I am not done with this assignment
        System.out.println(Arrays.toString(colorsClone));

    }
}
