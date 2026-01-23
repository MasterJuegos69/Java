/*
Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array.
*/
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