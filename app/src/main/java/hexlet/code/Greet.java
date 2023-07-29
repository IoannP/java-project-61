package hexlet.code;

public class Greet {
    public static String greet() {
        System.out.println("Welcome to the Brain Games!");
        String playerName = Cli.getPlayerName();
        System.out.println(String.format("Hello, %s!", playerName));

        return playerName;
    }
}
