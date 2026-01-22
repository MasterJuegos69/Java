package Arrays;
public class ExampleOneDimensionalArray {
    public static void main(String[] args) {
        //Processing
        final int[] num;
        num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        final char[] simbolo = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        //Output
        System.out.println("\n" + "The array of numbers contains:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("The number in position [" + i + "] is: " + num[i]);
        }

        System.out.println("\n" + "The array of symbols contains:");
        for (int j = 0; j < simbolo.length; j++) {
            System.out.println("The symbol in position [" + j + "] is: " + simbolo[j]);
        }
    }
}