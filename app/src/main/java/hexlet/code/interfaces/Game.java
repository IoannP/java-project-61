package hexlet.code.interfaces;

/**
 * Game interface.
 */
public interface Game {
    /**
     *
     * @return game question
     */
    String getQuestion();

    /**
     * Get question and evaluate answer.
     * @param question - question
     * @return question's answer
     */
    String getAnswer(String question);

    /**
     *
     * @return game description
     */
    String getGameDescription();
}
