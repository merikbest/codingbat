package String2.task12;

/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
 separated by the separator string.

        repeatSeparator("Word", "X", 3) → "WordXWordXWord"
        repeatSeparator("This", "And", 2) → "ThisAndThis"
        repeatSeparator("This", "And", 1) → "This"*/

class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += word + sep;
        }
        return result.substring(0, result.length() - sep.length());

//        String result = "";
//
//        for (int i = 0; i < count; i++) {
//            if (i < count-1)
//                result += word + sep;
//            else
//                result += word;
//        }
//        return result;
    }
}
