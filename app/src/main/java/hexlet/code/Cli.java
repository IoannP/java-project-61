package hexlet.code;
import java.util.Scanner;

public class Cli {
  public static void greeting() {
    Scanner scannerString = new Scanner(System.in);
    System.out.print("May I have your name? ");
    String name = scannerString.next();
    System.out.println(String.format("Hello, %s!", name));
    scannerString.close();
  }
}
