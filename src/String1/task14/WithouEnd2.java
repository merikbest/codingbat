package String1.task14;

/*Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

        withouEnd2("Hello") → "ell"
        withouEnd2("abc") → "b"
        withouEnd2("ab") → ""*/

class WithouEnd2 {
    public String withouEnd2(String str) {
        if (str.length() > 2)
            return str.substring(1, str.length() - 1);
        else return str;
    }
}