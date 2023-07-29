package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public class Prime implements Game {
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (var i = 2; i < number / 2; i += 1) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return game question
     */
    public String getGameDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    /**
     * Get question and evaluate answer.
     * @param question - question
     * @return question's answer
     */
    public String getAnswer(String question) {
        boolean isPrimeNumber = Prime.isPrime(Integer.parseInt(question));
        return isPrimeNumber ? "yes" : "no";
    }

    /**
     *
     * @return game description
     */
    public String getQuestion() {
        int number = Utils.generateRandomNumber();
        return Integer.toString(number);
    }
}
