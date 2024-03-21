/*
Write a program that uses nested for loops to print a multiplication table.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for( int i = 1; i <=12; i++){
            for (int j = 1; j<=12; j++){
                System.out.printf(i*j +" ");
            }
            System.out.println("\n");
        }
    }
}
