package hexlet.code;


public class App {
    public static void main(String[] args) {
        String gameNumber = Cli.chooseGame();
        Engine.startGame(gameNumber);
    }
}
