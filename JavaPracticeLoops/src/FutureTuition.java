/*
Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent
every year. In how many years will the tuition be doubled?
 */
public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year=0;
        while(tuition < 20000){
                tuition = tuition * 1.07;
                year++;
        }

        System.out.printf("The tuition will double to $%.2f in %d years", tuition, year);
    }
}
