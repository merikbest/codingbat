package String1.task05;

/*Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
 The string length will be at least 2.

        extraEnd("Hello") → "lololo"
        extraEnd("ab") → "ababab"
        extraEnd("Hi") → "HiHiHi"*/

class ExtraEnd {
    public String extraEnd(String str) {
        String a1 = str.substring(str.length() - 2);
        if (str.length() <= 2)
            return str + str + str;
        else return a1 + a1 + a1;
    }
}
