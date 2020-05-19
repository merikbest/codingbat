package String2;

/*Given two strings, return true if either of the strings appears at the very end of the other string,
 ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
 Note: str.toLowerCase() returns the lowercase version of a string.

        endOther("Hiabc", "abc") → true
        endOther("AbC", "HiaBc") → true
        endOther("abc", "abXabc") → true*/

class EndOther {
    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        int aLen = a.length();

        b = b.toLowerCase();
        int bLen = b.length();

        if (aLen < bLen) {
            String temp = b.substring(bLen - aLen, bLen);
            if (temp.compareTo(a) == 0)
                return true;
            else
                return false;

        } else {
            String temp = a.substring(aLen - bLen, aLen);
            if (temp.compareTo(b) == 0)
                return true;
            else
                return false;
        }
    }
}

public class SS5_endOther {
    public static void main(String[] args) {
        EndOther endOther = new EndOther();
        System.out.println(endOther.endOther("ab1", "223"));
    }
}
