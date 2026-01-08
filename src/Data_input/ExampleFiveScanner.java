//Imports
import java.util.Scanner;
import java.util.Locale;

public class ExampleFiveScanner{
    public static void main(String[] args) {
        //Create an object Scanner
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US); // Setting '.' as the decimal separator
        
        //Input
        System.out.print("Enter the desired grade for the quarter: ");
        float quarterNote = scan.nextFloat();
        System.out.print("Enter the grade for the first exam: ");
        float firstExamNote = scan.nextFloat();
        scan.close(); //Release resources
        
        //Processing
        float secondExamNote = (quarterNote - firstExamNote * 0.40f) / 0.60f;

        //Output
        System.out.println("The grade for the second exam is: " + secondExamNote);
    }
}