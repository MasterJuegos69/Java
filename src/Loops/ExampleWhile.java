package Loops;
import java.io.Console;

public class ExampleWhile {
    public static void main(String[] args) {
        Console cnsl = System.console();

        //Input
        System.out.print("Enter a whole number: ");
        final int WHOLE_NUMBER = Integer.parseInt(cnsl.readLine());

        //Processing
        int dividend = WHOLE_NUMBER;
        final byte DIVIDER = 10;
        int quotient;
        short digitCount = 1;
        
        while(dividend / DIVIDER != 0){
            quotient = dividend / DIVIDER;
            dividend = quotient;
            digitCount++;
        }
        
        //Output
        System.out.println("The number " + WHOLE_NUMBER + " has " + digitCount + " digits.");
    }   
}