public class ExampleThreeVariables{
    public static void main (String[] args){
        //Full name
        String firstName;
        String firstSurname;
        String secondSurname;
        
        //Anthropomorphic data
        byte age;
        float height; // In meters
        float weight; // In kilograms

        //Favorite numbers
        byte firstFavoriteNumber;
        byte secondFavoriteNumber;

        //Input data
        firstName = "David";
        firstSurname = "Diaz";
        secondSurname = "Velasquez";
        age = 24;
        height = 1.72f;
        weight = 52.3f;
        firstFavoriteNumber = 2;
        secondFavoriteNumber = 3;

        //Operations
        int idealWeight = (int) (height * 100 - 100);
        byte nextAge = ++age;

        //Output data
        System.out.println("My name is " + firstName + " " + firstSurname + " " + secondSurname + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My height is " + height + " meters tall, and my weight is " + weight + " kg.");
        System.out.println("My favorite numbers are " + firstFavoriteNumber + " and " + secondFavoriteNumber);
        System.out.println("My ideal weight is " + idealWeight);
        System.out.println("I will turn " + nextAge + " in 2026.");
    }
}