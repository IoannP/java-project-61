package hexlet.code.games;

import hexlet.code.Utils;


public class Progression implements Game {
    public String getRules() {
        return "What number is missing in the progression?";
    }

    public String getCorrectAnswer(String question) {
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

    public String generateQuestion() {
        String[] list = new String[10];
        int step = Utils.generateRandomNumber();
        int missingNumberIndex = Utils.generateRandomNumber(0, 10);
        list[0] = Integer.toString(step);

        for (var i = 1; i < 10; i += 1) {
            int number = step * (i + 1);
            list[i] = Integer.toString(number);
        }

        list[missingNumberIndex] = "..";

        return String.join(" ", list);
    }
}
