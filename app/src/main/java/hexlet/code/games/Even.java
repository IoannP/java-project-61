package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;


public class Even implements Game  {
    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String getGameDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getAnswer(String question) {
        int number = Integer.parseInt(question);
        return isEven(number) ? "yes" : "no";
    }

    public String getQuestion() {
        int number = Utils.generateRandomNumber();
        return Integer.toString(number);
    }
}
