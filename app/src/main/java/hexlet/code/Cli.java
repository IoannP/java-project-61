package hexlet.code;
import java.util.Scanner;


public class Cli {
    private static Scanner scanner = new Scanner(System.in);

    public static void closeScanner() {
        Cli.scanner.close();
    }

    public static String getGameNumber() {
        System.out.print("Your choice: ");
        String gameNumber = Cli.scanner.next();

        return gameNumber;
    }

    public static String getAnswer() {
        System.out.print("Your answer: ");
        String answer = scanner.next();

        return answer;
    }

    public static String getPlayerName() {
        System.out.print("May I have your name? ");
        String name = Cli.scanner.next();

        return name;
    }
}
