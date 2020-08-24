package AP_CS__.task14;

//Given an array of strings, return a new array without the strings that are equal to the target string.
// One approach is to count the occurrences of the target string, make a new array of the correct length,
// and then copy over the correct strings.

//        wordsWithout(["a", "b", "c", "a"], "a") → ["b", "c"]
//        wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]
//        wordsWithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]

class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target))
                count1++;
        }
        count1 = words.length - count1;

        String[] s1 = new String[count1];

        for (int j = 0; j < words.length; j++) {
            if (!words[j].equals(target)) {
                s1[count2] = words[j];
                count2++;
            }
        }
        return s1;
//        ArrayList list = new ArrayList();
//
//        for (int i = 0; i < words.length; i++) {
//            if (words[i] != target)
//                list.add(words[i]);
//        }
//        return (String[])list.toArray(new String[list.size()]);
    }
}