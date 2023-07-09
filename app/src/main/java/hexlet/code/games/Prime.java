package hexlet.code.games;

import hexlet.code.Utils;

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

    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getCorrectAnswer(String question) {
        boolean isPrimeNumber = Prime.isPrime(Integer.parseInt(question));
        return isPrimeNumber ? "yes" : "no";
    }

    public String generateQuestion() {
        int number = Utils.generateRandomNumber();
        return Integer.toString(number);
    }
}
