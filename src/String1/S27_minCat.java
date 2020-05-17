package String1;


/*
Given two strings, append them together (known as "concatenation") and return the result.
 However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
 So "Hello" and "Hi" yield "loHi". The strings may be any length.

        minCat("Hello", "Hi") → "loHi"
        minCat("Hello", "java") → "ellojava"
        minCat("java", "Hello") → "javaello"
*/

class MinCat {
    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            int dif = a.length() - b.length();
            return a.substring(dif, a.length()) + b;
        }

        if (a.length() < b.length()) {
            int dif = b.length() - a.length();
            return a + b.substring(dif, b.length());
        }

        return a + b;
    }
}

public class S27_minCat {
    public static void main(String[] args) {
        MinCat minCat = new MinCat();
        System.out.println(minCat.minCat("java","Hello"));
    }
}
