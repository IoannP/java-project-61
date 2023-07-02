package hexlet.code.games;
import java.util.Random;


public class Even  {
    public static int min = 1;
    public static int max = 100;

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getCorrectAnswer(int question) {
        return isEven(question) ? "yes" : "no";
    }

    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public int generateQuestion() {
        return new Random().nextInt(Even.min, Even.max);
    }
}
