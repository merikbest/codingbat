package AP_CS__.task01;

//Given an array of scores, return true if each score is equal or greater than the one before.
// The array will be length 2 or more.

//        scoresIncreasing([1, 3, 4]) → true
//        scoresIncreasing([1, 3, 2]) → false
//        scoresIncreasing([1, 1, 4]) → true

class ScoresIncreasing {
    public boolean scoresIncreasing(int[] scores) {
        boolean match = false;

        for (int i = 0; i < scores.length-1; i++) {
            if (scores[i+1] >= scores[i])
                match = true;
            else
                return false;
        }
        return match;
    }
}
