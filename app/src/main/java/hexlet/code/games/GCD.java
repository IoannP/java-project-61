package hexlet.code.games;

import hexlet.code.Utils;

public class GCD implements Game {
    private static int getGCD(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return getGCD(b, a % b);
    }


    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getCorrectAnswer(String question) {
        String[] expression = question.split(" ");

        int firstNum = Integer.parseInt(expression[0]);
        int secondNum = Integer.parseInt(expression[1]);

        int result = GCD.getGCD(firstNum, secondNum);

        return Integer.toString(result);
    }

    public String generateQuestion() {
        int firstNum = Utils.generateRandomNumber();
        int secondNum = Utils.generateRandomNumber();

        String expression = String.format("%s %s", firstNum, secondNum);

        return expression;
    }
}
