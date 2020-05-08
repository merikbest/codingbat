package Warmup1;
/*

Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 The value of n will be a valid index of a char in the original string
 (i.e. n will be in the range 0..str.length()-1 inclusive).
        missingChar("kitten", 1) → "ktten"
        missingChar("kitten", 0) → "itten"
        missingChar("kitten", 4) → "kittn"

*/

class MissingChar{
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}

public class G9_missingChar {
    public static void main(String[] args) {
        MissingChar missingChar = new MissingChar();
        System.out.println(missingChar.missingChar("Kitten", 0));
    }
}
