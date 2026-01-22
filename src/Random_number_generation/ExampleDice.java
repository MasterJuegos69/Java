package Random_number_generation;

public class ExampleDice {
    public static void main(String[] args) {

        //Processing
        byte dice_1 = (byte) (Math.random() * 6 + 1);
        byte dice_2 = (byte) (Math.random() * 6 + 1);
        byte dice_3 = (byte) (Math.random() * 6 + 1);
        byte sum = (byte) (dice_1 + dice_2 + dice_3);

        //Output
        System.out.println("The results of the dice rolls are:");
        System.out.println("Dice 1: " + dice_1);
        System.out.println("Dice 2: " + dice_2);
        System.out.println("Dice 3: " + dice_3);
        System.out.println("The sum of the 3 dice rolls is: " + sum);
    }
}