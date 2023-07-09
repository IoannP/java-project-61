package hexlet.code;
import java.util.Scanner;


public class Cli {
    public static Scanner scanner = new Scanner(System.in);

    public static String chooseGame() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        String gameNumber = scanner.next();

        return gameNumber;
    }

    public static String greet() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.next();

        System.out.println(String.format("Hello, %s!", name));

        return name;
    }

    // public static void printQuestion(void question) {
    //     System.out.println("Question: " + question);
    // }

    public static String getAnswer() {
        System.out.print("Your answer: ");
        String answer = scanner.next();

        return answer;
    }

    // public static void printRules(String rules) {
    //     System.out.println(rules);
    // }
}
