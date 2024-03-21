/*
Write a program that returns the middle element in an array. Give the following values to the
integer array: {13, 5, 7, 68, 2} and produce the following output: 7
 */
public class Task2 {
    public static void main(String[] args) {
        int[] integerArray = {13, 5, 7, 68, 2};
        int lengthArray = integerArray.length;
        int midpoint = lengthArray/2; //only works for this array of odd length
        System.out.println(integerArray[midpoint]);

    }
}
