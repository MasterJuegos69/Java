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
    short timeInMinutes = (short) (hour * 60);
    timeInMinutes += minutes;
     
    switch (weekDay) {
        case "Lunes":
            timeInMinutes += 0;
            break;
        case "Martes":
            timeInMinutes += 24 * 60 * 1;
            break;
        case "Miércoles":
            timeInMinutes += 24 * 60 * 2;
            break;
        case "Jueves":
            timeInMinutes += 24 * 60 * 3;
            break;
        case "Viernes":
            timeInMinutes += 24 * 60 * 4;
            break;
        default:
            System.out.println("ERROR: The day of the week entered is out of range.");
            break;
    }

    short weekEnd = (24 * 4 + 15) * 60;
    short remainingMinutes = (short) (weekEnd - timeInMinutes);

    //Output
    System.out.println("Only " + remainingMinutes + " minutes left until the weekend.");
    }
}