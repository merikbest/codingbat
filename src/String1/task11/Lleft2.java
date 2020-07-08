package String1.task11;

/*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

        left2("Hello") → "lloHe"
        left2("java") → "vaja"
        left2("Hi") → "Hi"*/

class Lleft2 {
    public String left2(String str) {
        if (str.length() <= 2)
            return str;

        String end = str.substring(0, 2);
        String begin = str.substring(2);

        return begin + end;

//        return str.substring(2) + str.substring(0, 2);
    }
}