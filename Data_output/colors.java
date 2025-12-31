public class colors {
    public static void main(String[] args)
    {
        //ANSI Escape codes
        //Colors
        String red = "\033[31m";
        String green = "\033[32m";
        String orange = "\033[33m";
        String blue = "\033[34m";
        String purple = "\033[35m";
        String white = "\033[37m";
        //Reset
        String reset = "\033[0m";
        
        //Texts
        String text_1 = "D-A-N-G-E-R-!";
        String text_2 = "This code is experimental.";
        String text_3 = "Be careful";
        System.out.println(red + text_1 + reset);
        System.out.print(orange + text_2);
        System.out.println(" " + text_3 + " " + blue + "and be quiet...");
    }
}