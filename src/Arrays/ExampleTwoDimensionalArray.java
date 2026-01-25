package Arrays;
import java.io.Console;
public class ExampleTwoDimensionalArray {
    public static void main(String[] args) {
        Console cnsl = System.console();

        //Input
        final byte ROWS = 4;
        final byte COLUMNS = 5;
        final int[][] SPREADSHEET = new int[ROWS][COLUMNS];

        for (byte i = 0; i < ROWS; i++) {
            for (byte j = 0; j < COLUMNS; j++) {
                System.out.print("Enter a whole number in the position [" + i + "][" + j + "]: ");
                SPREADSHEET[i][j] = Integer.parseInt(cnsl.readLine());
            }
        }
        
        //Processing
        final String SPACE = "  ";
        final int[] ROW_SUBTOTAL = new int[ROWS];
        final int[] COLUMN_SUBTOTAL = new int[COLUMNS];
        long total = 0;

        for (byte i = 0; i < ROWS; i++) {
            for (byte j = 0; j < COLUMNS; j++) {
                ROW_SUBTOTAL[i] += SPREADSHEET[i][j];
                COLUMN_SUBTOTAL[j] += SPREADSHEET[i][j];
            }
            total += ROW_SUBTOTAL[i];
        }

        //Output
        System.out.println("The result");
        for (byte i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(SPREADSHEET[i][j] + SPACE);
            }
            System.out.println(ROW_SUBTOTAL[i]);
        }

        for (byte i = 0; i < COLUMNS; i++) {
            System.out.print(COLUMN_SUBTOTAL[i] + SPACE);
        }
        System.out.println(total);
        
    }
}