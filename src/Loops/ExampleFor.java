package Loops;
import java.io.Console;

public class ExampleFor {
    public static void main(String[] args) {
        Console cnsl = System.console();
        
        //Input
        System.out.print("Enter the number whose multiples will be calculated: ");
        byte number = Byte.parseByte(cnsl.readLine());

        //Processing
        for(byte i = 0; i <= 100; i = (byte) (i + number)){
            //Output
            System.out.println("\n" + i);
        }
    }
}