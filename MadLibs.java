import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in); //creates a scanner object
    String madLib = "<Proper noun> is a <adjective> apple, but a cat <verb> it."; // madLib 1
    //madLib = ""; // madLib 2
    //madLib = ""; //madLib 3

    // finds the index of brackets for word descriptor
    int indexLeftBracket = madLib.indexOf("<");
    int indexRightBracket = madLib.indexOf(">");
    
    // finds and replaces word and brackets with user input
    String before = madLib.substring(0, indexLeftBracket);
    String after = madLib.substring(indexRightBracket + 1);

    System.out.println("Enter a " + madLib.substring(indexLeftBracket, indexRightBracket + 1);
    String input = scanner.nextLine();
    // this will update the madLib
    madLib = before + input + after;
    

    System.out.println(madLib);

    }
}