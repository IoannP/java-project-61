package hexlet.code;

import hexlet.code.interfaces.Game;

public class Engine {
    private static final int COUNT_OF_ROUNDS = 3;

    public static void run(Game game) {
        String gameDescription = game.getGameDescription();
        System.out.println(gameDescription);

        String playerName = Greet.greet();

        for (var i = 0; i < Engine.COUNT_OF_ROUNDS; i += 1) {
            String question = game.getQuestion();
            String answer = game.getAnswer(question);
            System.out.println("Question: " + question);

            String userAnswer = Cli.getAnswer();

            if (!answer.equals(userAnswer)) {
                String message = String.format("'%s' is wrong answer ;(. Correct answer was '%s'.", userAnswer, answer);
                System.out.println(message);
                System.out.println(String.format("Let's try again, %s!", playerName));
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println(String.format("Congratulations, %s!", playerName));
        Cli.closeScanner();
    }
}
