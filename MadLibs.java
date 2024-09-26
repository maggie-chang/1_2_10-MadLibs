import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    //String madLib = "Eli is very <adjective>.";

    System.out.println("Enter an adjective: ");
    String input = scanner.nextLine();
    System.out.println("you said: "  + input);

    }
}