package String1;

/*Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

        nonStart("Hello", "There") → "ellohere"
        nonStart("java", "code") → "avaode"
        nonStart("shotl", "java") → "hotlava"*/

class NonStart {
    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}

public class S10_nonStart {
    public static void main(String[] args) {
        NonStart nonStart = new NonStart();
        System.out.println(nonStart.nonStart("asd", "qwe"));
    }
}
