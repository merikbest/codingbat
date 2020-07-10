package AP_CS__.task06;

//Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.

//        wordsFront(["a", "b", "c", "d"], 1) → ["a"]
//        wordsFront(["a", "b", "c", "d"], 2) → ["a", "b"]
//        wordsFront(["a", "b", "c", "d"], 3) → ["a", "b", "c"]

class WordsFront {
    public String[] wordsFront(String[] words, int n) {
        String [] words2 = new String[n];

        for (int i = 0; i < words2.length; i++) {
            words2[i] = words[i];
        }
        return words2;
    }
}