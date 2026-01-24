package Arrays;
import java.io.Console;

public class Rotation {
    public static void main(String[] args) {
        Console cnsl = System.console();

        //Input
        final byte LENGTH = 15;
        final byte[] NUMBERS = new byte[LENGTH];
        for (byte i = 0; i < LENGTH; i++) {
            System.out.print("Enter a number in the position [" + i + "]: ");
            NUMBERS[i] = Byte.parseByte(cnsl.readLine());
        }

        //Processing
        byte aux = NUMBERS[LENGTH - 1];
        for (byte j = LENGTH - 1; j > 0; j--) {
            NUMBERS[j] = NUMBERS[j - 1];
        }
        NUMBERS[0] = aux;

        //Output
        for (byte k = 0; k < LENGTH; k++) {
            System.out.println("The element in position [" + k + "] is: " + NUMBERS[k]);
        }
    }
}