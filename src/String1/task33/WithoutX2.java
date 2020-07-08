package String1.task33;

/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars,
 and otherwise return the string unchanged. This is a little harder than it looks.

        withoutX2("xHi") → "Hi"
        withoutX2("Hxi") → "Hi"
        withoutX2("Hi") → "Hi"
*/

class WithoutX2 {
    public String withoutX2(String str) {
        if (str.length() <= 1)
            return "";

        if (str.substring(0, 2).equals("xx"))
            return str.substring(2);

        if (str.charAt(0) == 'x')
            return str.substring(1);

        if (str.charAt(1) == 'x')
            return str.charAt(0) + str.substring(2);

        return str;
    }
}
