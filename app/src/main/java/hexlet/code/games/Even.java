package hexlet.code.games;
import hexlet.code.Utils;

public class Even implements Game  {
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
        int number = Utils.generateRandomNumber();
        return Integer.toString(number); 
    }
}
