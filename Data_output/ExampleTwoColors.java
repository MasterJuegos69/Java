public class ExampleTwoColors {
    public static void main(String[] args)
    {
        //ANSI escape sequences
        String ESC = "\033";
        char CSI = '[';
        char graphic_attribute = 'm';
        

        //Color codes
        char reset = '0';
        String red = "31";
        String green = "32";
        String orange = "33";
        String blue = "34";
        String purple = "35";
        
        //Text variables
        String text_1 = "D-A-N-G-E-R-!";
        String text_2 = "This code is for testing purposes. Therefore, it's experimental.";
        String text_3 = "Its purpose is to understand ANSI escape sequences.";
        String text_4 = "Be careful...";

        //Output
        System.out.println(ESC + CSI + red + graphic_attribute + text_1);
        System.out.println(ESC + CSI + orange + graphic_attribute + text_2 + ESC + CSI + green + graphic_attribute);
        System.out.println(text_3);
        System.out.print(ESC + CSI + purple + graphic_attribute);
        System.out.println(text_4 + " " + ESC + CSI + blue  + graphic_attribute + "and be quiet...");
        System.out.println(ESC + CSI + reset + graphic_attribute + "See you later!");
    }
}