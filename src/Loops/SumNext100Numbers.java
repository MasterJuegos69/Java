package Loops;
import java.io.Console;

public class SumNext100Numbers {
    public static void main(String[] args) {
        Console cnsl = System.console();

        //Input
        System.out.print("Enter the positive, integer number: ");
        int number = Integer.parseInt(cnsl.readLine());

        //Processing
        if(number < 0) {
            System.out.println("ERROR: the number must be positive.");
            return;
        }
        //Constants
        final byte MAX_NUMBER = 100;
        int SUM = 0;

        for(int i = number + 1; i <= number + MAX_NUMBER; i++) {
            SUM = SUM + i;
        }

        //Output
        System.out.println("The sum of the 100 numbers following " + number + " is: " + SUM);
    }
}