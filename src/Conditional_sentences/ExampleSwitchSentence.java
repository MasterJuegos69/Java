package Conditional_sentences;
import java.io.Console;

public class ExampleSwitchSentence{
    public static void main(String[] args) {
    Console cnsl = System.console();
    
    //Input
    System.out.print("Enter the day of the week: ");
    String weekDay = cnsl.readLine();
    System.out.print("Enter the current hour: ");
    byte hour = Byte.parseByte(cnsl.readLine());
    System.out.print("Enter the current minutes: ");
    byte minutes = Byte.parseByte(cnsl.readLine());

    //Processing
    short elapsedTime = 24 * 60;
    
    //Constants
    short weekEnd = (24 * 4 + 15) * 60; 

    //Unit conversion
    short timeInMinutes = (short) (hour * 60);
    timeInMinutes += minutes;
    
    switch (weekDay) {
        case "Lunes":
            elapsedTime *= 0;
            break;
        case "Martes":
            elapsedTime *= 1;
            break;
        case "Miércoles":
            elapsedTime *= 2;
            break;
        case "Jueves":
            elapsedTime *= 3;
            break;
        case "Viernes":
            elapsedTime *= 4;
            break;
        default:
            System.out.println("ERROR: The day of the week entered is out of range.");
            break;
    }
    elapsedTime += timeInMinutes;
    short remainingMinutes = (short) (weekEnd - elapsedTime);

    //Output
    System.out.println("Only " + remainingMinutes + " minutes left until the weekend.");
    }
}