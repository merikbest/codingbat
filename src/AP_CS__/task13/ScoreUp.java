package AP_CS__.task13;

//The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
// the "answers" array contains a student's answers, with "?" representing a question left blank.
// The two arrays are not empty and are the same length. Return the score for this array of answers,
// giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

//        scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
//        scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
//        scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16

class ScoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int result = 0;

        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) {
                result += 0;
            } else if (key[i].charAt(0) == answers[i].charAt(0)) {
                result += 4;
            } else if (key[i].charAt(0) != answers[i].charAt(0)) {
                result -= 1;
            }
        }
        return result;
    }
}