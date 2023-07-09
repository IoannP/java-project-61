package hexlet.code.games;


public interface Game {
    String getCorrectAnswer(String question);
    String generateQuestion();
    String getRules();
}
