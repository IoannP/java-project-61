package hexlet.code.games;
import java.util.Random;


public class Even implements Game  {
    private static int min = 1;
    private static int max = 100;

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);
        return isEven(number) ? "yes" : "no";
    }

    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String generateQuestion() {
        int number = new Random().nextInt(Even.min, Even.max);
        return Integer.toString(number); 
    }
}
