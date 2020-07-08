package String1.task28;

/*Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
 The string may be any length. If there are fewer than 2 chars, use whatever is there.

        extraFront("Hello") → "HeHeHe"
        extraFront("ab") → "ababab"
        extraFront("H") → "HHH"*/

class ExtraFront {
    public String extraFront(String str) {
        if (str.length() <= 1)
            return str + str + str;

        String a = str.substring(0,2);
        return a + a + a;
    }
}
