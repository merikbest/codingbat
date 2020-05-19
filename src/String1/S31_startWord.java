package String1;

/*Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
 except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
 So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

        startWord("hippo", "hi") → "hi"
        startWord("hippo", "xip") → "hip"
        startWord("hippo", "i") → "h"*/

class StartWord {
    public String startWord(String str, String word) {
        if (str.length() == 0)
            return "";

        if (str.length() >= word.length())
            return str.substring(0, 1) + word.substring(1);

        else return "";

//        if (word.length() > str.length()) return "";
//        if (str.substring(0, word.length()).equals(word)) return word;
//        if (str.substring(1, word.length()).equals(word.substring(1)))
//            return str.charAt(0) + word.substring(1);
//        return "";

    }
}

public class S31_startWord {
    public static void main(String[] args) {
        StartWord startWord = new StartWord();
        System.out.println(startWord.startWord("hippo", "i"));
    }
}
