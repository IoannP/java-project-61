package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;


public class Even implements Game  {
    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     *
     * @return game description
     */
    public String getGameDescription() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    /**
     * Get question and evaluate answer.
     * @param question - question
     * @return question's answer
     */
    public String getAnswer(String question) {
        int number = Integer.parseInt(question);
        return isEven(number) ? "yes" : "no";
    }

    /**
     *
     * @return game question
     */
    public String getQuestion() {
        int number = Utils.generateRandomNumber();
        return Integer.toString(number);
    }
}
