package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;

public class Prime implements Game {
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (var i = 2; i < Math.sqrt(number); i += 1) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public String getGameDescription() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    /**
     *
     * @param question - question
     */
    public String getAnswer(String question) {
        boolean isPrimeNumber = Prime.isPrime(Integer.parseInt(question));
        return isPrimeNumber ? "yes" : "no";
    }

    public String getQuestion() {
        int number = Utils.generateRandomNumber();
        return Integer.toString(number);
    }
}
