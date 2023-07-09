package hexlet.code.games;
import hexlet.code.Utils;

public class Calc implements Game {
    private static String getSign() {
        int number = Utils.generateRandomNumber(1, 4);
        switch (number) {
            case 1:
                return "+";
            case 2:
                return "-";
            default:
                return "*";
        }
    }

    public String getCorrectAnswer(String question) {
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

    public String getRules() {
        return "What is the result of the expression?";
    }

    public String generateQuestion() {
        int firstOperand = Utils.generateRandomNumber();
        int secondOperand = Utils.generateRandomNumber();
        String operator = Calc.getSign();

        String expression = String.format("%s %s %s", firstOperand, operator, secondOperand);

        return expression;
    }
}
