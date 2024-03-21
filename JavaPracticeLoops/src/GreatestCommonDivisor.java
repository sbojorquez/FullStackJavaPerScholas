/*
Write a program that prompts the user to enter two positive integers, and find their greatest
common divisor (GCD).
 */
import java.util.*;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two positive integers:");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int commonDivisor= 0;

        for (int k = 1; k<= n1 && k<=n2; k++){
            if (n1%k ==0 && n2%k ==0){
                commonDivisor = k;
            }
        }
        System.out.println("The greatest common divisor is " + commonDivisor);
    }
}
