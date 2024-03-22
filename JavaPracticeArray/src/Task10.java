/*
Create an array that includes an integer, 3 strings, and 1 double. Print the array.
 */
import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        //An array can only contain one type we can create an object array and include the arrays???
        int[] anInteger = {1};
        String[] threeStrings = {"one string", "two string", "three string"};
        Double[] doubleArr = {2.22};
        Object[] objArray = new Object[]{anInteger, threeStrings, doubleArr};
        for (int i = 0; i < objArray.length; i++) {
            System.out.println(objArray[i]);

        }

    }
}
