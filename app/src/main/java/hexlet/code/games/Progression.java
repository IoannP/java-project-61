package hexlet.code.games;

import hexlet.code.Utils;
import hexlet.code.interfaces.Game;


public class Progression implements Game {
    private static final int PROGRESSION_BEGIN_INDEX = 0;

    private static final int PROGRESSION_END_INDEX = 10;

    public String getGameDescription() {
        return "What number is missing in the progression?";
    }

    public String getAnswer(String question) {
        String[] progression = question.split(" ");
        int progressionLength = progression.length;
        int answer;

        for (var i = 0; i < progressionLength; i += 1) {
            String num = progression[i];
            boolean isMissingNumber = num.equals("..");

            if (!isMissingNumber) {
                continue;
            }

            if (i < progressionLength - 2) {
                int step = Integer.parseInt(progression[i + 2]) - Integer.parseInt(progression[i + 1]);
                answer = Integer.parseInt(progression[i + 1]) - step;
                return Integer.toString(answer);
            } else {
                int step = Integer.parseInt(progression[i - 1]) - Integer.parseInt(progression[i - 2]);
                answer = Integer.parseInt(progression[i - 1]) + step;
                return Integer.toString(answer);
            }
        }
        return "";
    }

    public String getQuestion() {
        String[] list = new String[PROGRESSION_END_INDEX];
        int step = Utils.generateRandomNumber();
        int missingNumberIndex = Utils.generateRandomNumber(PROGRESSION_BEGIN_INDEX, PROGRESSION_END_INDEX);
        list[0] = Integer.toString(step);

        for (var i = 1; i < PROGRESSION_END_INDEX; i += 1) {
            int number = step * (i + 1);
            list[i] = Integer.toString(number);
        }

        list[missingNumberIndex] = "..";

        return String.join(" ", list);
    }
}
