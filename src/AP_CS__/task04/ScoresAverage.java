package AP_CS__.task04;

class ScoresAverage {
    public int [] scoresAverage(int[] scores) {

        int [] start = new int [scores.length / 2];
        int [] end = new int [scores.length - start.length];
        int result1 = 0;
        int result2 = 0;

//        for (int i = 0; i < start.length; i++) {
//            start[i] = scores[i];
//            result1 += start[i];
//        }

        for (int i = scores.length / 2; i < scores.length; i++) {
            end[i] = scores[i];
        }

//        if (result1 > result2)
//            return result1;
//        else
            return end;
    }
}
