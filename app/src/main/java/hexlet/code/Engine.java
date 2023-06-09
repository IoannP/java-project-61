package hexlet.code;


import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.games.Game;


public class Engine {
    private static int countOfRounds = 3;

    public static void startGame(String gameNumber) {
        switch (gameNumber) {
            case "1":
                Cli.greet();
                break;
            case "2":
                Game evenGame = new Even();
                Engine.run(evenGame);
                break;
            case "3":
                Game calcGame = new Calc();
                Engine.run(calcGame);
                break;
            case "4":
                Game gcdGame = new GCD();
                Engine.run(gcdGame);
                break;
            case "5":
                Game progressionGame = new Progression();
                Engine.run(progressionGame);
                break;
            case "6":
                Game primeGame = new Prime();
                Engine.run(primeGame);
                break;
            default:
                return;
        }
    }

    private static void run(Game game) {
        String name = Cli.greet();
        String rules = game.getRules();
        System.out.println(rules);

        for (var i = 0; i < Engine.countOfRounds; i += 1) {
            var question = game.generateQuestion();
            System.out.println("Question: " + question);

            var answer = Cli.getAnswer();
            var correctAnswer = game.getCorrectAnswer(question);

            if (!answer.equals(correctAnswer)) {
                var message = String.format("'%s' is wrong answer ;(. Correct answer was '%s'.", answer, correctAnswer);
                System.out.println(message);
                System.out.println(String.format("Let's try again, %s!", name));
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println(String.format("Congratulations, %s!", name));
        Cli.scanner.close();
    }
}
