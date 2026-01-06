//Package
package Conditional_sentences;

//Imports
import java.io.Console;

public class ExampleIfSentence{
    public static void main(String[] args) {
        Console console = System.console();

        //Input
        System.out.print("Enter the first grade: ");
        float firstGrade = Float.parseFloat(console.readLine());
        System.out.print("Enter the second grade: ");
        float secondGrade = Float.parseFloat(console.readLine());

        //Processing
        float average = (firstGrade + secondGrade) / 2;

        //Output
        if(average >= 5.00f){
            System.out.println("You have passed the course with an average grade of " + average + ". Congratulations!");
        }
        else{
            System.out.println("Your average grade is less than 5.00");
            System.out.print("What was the result of the recovery? (pass/fail): ");
            String result = console.readLine();
            switch(result){
                case "pass":
                    System.out.println("Your average grade for this course is 5.00");
                    System.out.println("You passed. Congratulations!");
                    break;
                case "fail":
                    System.out.println("Your average grade for this course is " + average + ".");
                    System.out.println("Sorry, you didn't pass...");
                    break;
                default:
                    System.out.println("ERROR. The recovery note entered is invalid!");
            }
                
        }
    }
}