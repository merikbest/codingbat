package String1.task23;

/*Given two strings, append them together (known as "concatenation") and return the result.
 However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

        conCat("abc", "cat") → "abcat"
        conCat("dog", "cat") → "dogcat"
        conCat("abc", "") → "abc"*/

class ConCat {
    public String conCat(String a, String b) {

        if (a.length() <= 0) {
            return b;
        }
        if (b.length() <= 0) {
            return a;
        }

        if (a.substring(a.length()-1).equals(b.substring(0,1)))
            return a.substring(0,a.length()-1) + b;

        return a + b;
    }
}
