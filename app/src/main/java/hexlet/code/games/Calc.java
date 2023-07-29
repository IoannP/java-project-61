package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;


public class Calc implements Game {
    private static final int MIN_SIGN_NUMBER = 1;

    private static final int MAX_SIGN_NUMBER = 4;

    private static String getSign() {
        int number = Utils.generateRandomNumber(MIN_SIGN_NUMBER, MAX_SIGN_NUMBER);
        switch (number) {
            case 1:
                return "+";
            case 2:
                return "-";
            default:
                return "*";
        }
    }

    /**
     *
     * @return game question
     */
    public String getGameDescription() {
        return "What is the result of the expression?";
    }

    /**
     * Get question and evaluate answer.
     * @param question - question
     * @return question's answer
     */
    public String getAnswer(String question) {
        String[] expression = question.split(" ");

        int firstOperand = Integer.parseInt(expression[0]);
        int secondOperand = Integer.parseInt(expression[2]);
        String operator = expression[1];

        int result;

        switch (operator) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            default:
                result = firstOperand * secondOperand;
        }

        return Integer.toString(result);
    }

    /**
     *
     * @return game question
     */
    public String getQuestion() {
        int firstOperand = Utils.generateRandomNumber();
        int secondOperand = Utils.generateRandomNumber();
        String operator = Calc.getSign();

        String question = String.format("%s %s %s", firstOperand, operator, secondOperand);

        return question;
    }
}
