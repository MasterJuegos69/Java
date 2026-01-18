package Loops;
import java.io.Console;

public class ExampleDoWhile{
    public static void main(String[] args) {
        Console cnsl = System.console();

        //Input
        final short SYSTEM_COMBINATION = 1234;
        final byte OPPORTUNITIES = 4;
        short userCombination;
        byte attempts = 1;
        boolean conditional;

        do{
            System.out.print("Enter a 4-digit number: ");
            userCombination = Short.parseShort(cnsl.readLine());

            //Processing
            conditional = userCombination != SYSTEM_COMBINATION;
            if(conditional){
                System.out.println("I'm sorry. That's not the right combination.");
                attempts = (byte) (attempts + 1);
            }
        }while(attempts <= OPPORTUNITIES && conditional);
        //Output
        System.out.println("The safe has been successfully opened.");
    }
}