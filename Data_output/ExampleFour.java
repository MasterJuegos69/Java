//Imports
import java.io.Console;

public class ExampleFour{
    public static void main(String[] args){
        Console console = System.console(); //Create a console object
        
        //Input
        System.out.print("Enter a number: "); //Specify which data to read
        String input = console.readLine(); //Read input data

        //Processing
        float number = Float.parseFloat(input); //Parse input data

        //Output
        System.out.println("The number is " + number); //Print output data
    }
}