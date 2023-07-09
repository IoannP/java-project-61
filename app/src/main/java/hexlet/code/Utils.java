package hexlet.code;

import java.util.Random;

public class Utils {
    private static int min = 1;
    private static int max = 100;

    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);   
    }
  
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(Utils.min, Utils.max);   
    }
}
