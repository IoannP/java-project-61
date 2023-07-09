package hexlet.code;

import java.util.Random;

public class Utils {
    private static int minRandom = 1;
    private static int maxRandom = 100;

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(Utils.minRandom, Utils.maxRandom);
    }
}
