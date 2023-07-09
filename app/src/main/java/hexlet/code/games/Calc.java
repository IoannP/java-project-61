package hexlet.code.games;
import java.util.Random;


public class Calc implements Game {
    private static int min = 1;
    private static int max = 100;

    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);   
    }
  
    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(Calc.min, Calc.max);   
    }

    private static String getSign() {
      int number = Calc.generateRandomNumber(1, 4);
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
        int firstOperand = Calc.generateRandomNumber();
        int secondOperand = Calc.generateRandomNumber();
        String operator = Calc.getSign();

        String expression = String.format("%s %s %s", firstOperand, operator, secondOperand);

        return expression;
    }
}
