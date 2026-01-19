package Loops;
import java.io.Console;

public class ExampleDoWhile{
    public static void main(String[] args) {
        Console cnsl = System.console();

        //Input
        String userCombination;

        //Processing
        final String SYSTEM_COMBINATION = "1234";
        final byte OPPORTUNITIES = 4;
        byte attempts = 1;
        boolean condition;
        
        //Messages
        final String SUCCESS = "The safe has been successfully opened.";
        final String WRONG_COMBINATION = "I'm sorry. That's not the right combination. Try again.";
        final String MAX_ATTEMPTS_REACHED = "You have reached the maximum number of attempts. Try again later.";
        String FINAL_MESSAGE = MAX_ATTEMPTS_REACHED;
        do{
            System.out.print("\n" + "Enter a 4-digit number: ");
            userCombination = cnsl.readLine();  
            condition = !userCombination.equals(SYSTEM_COMBINATION);
            if(condition){
                System.out.println(WRONG_COMBINATION);
                attempts = (byte) (attempts + 1);
            }
            else{
                FINAL_MESSAGE = SUCCESS;
            }
        }while(attempts <= OPPORTUNITIES && condition);
        
        //Output
        System.out.println(FINAL_MESSAGE);
    }
}