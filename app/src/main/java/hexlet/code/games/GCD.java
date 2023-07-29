package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public class GCD implements Game {
    private static int getGCD(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return getGCD(b, a % b);
    }

    /**
     *
     * @return game description
     */
    public String getGameDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    /**
     * Get question and evaluate answer.
     * @param question - question
     * @return question's answer
     */
    public String getAnswer(String question) {
        String[] expression = question.split(" ");

        int firstNum = Integer.parseInt(expression[0]);
        int secondNum = Integer.parseInt(expression[1]);

        int result = GCD.getGCD(firstNum, secondNum);

        return Integer.toString(result);
    }

    /**
     *
     * @return game question
     */
    public String getQuestion() {
        int firstNum = Utils.generateRandomNumber();
        int secondNum = Utils.generateRandomNumber();

        String expression = String.format("%s %s", firstNum, secondNum);

        return expression;
    }
}
