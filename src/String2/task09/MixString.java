package String2.task09;

/*Given two strings, a and b, create a bigger string made of the first char of a,
 the first char of b, the second char of a, the second char of b, and so on.
 Any leftover chars go at the end of the result.

        mixString("abc", "xyz") → "axbycz"
        mixString("Hi", "There") → "HTihere"
        mixString("xxxx", "There") → "xTxhxexre"*/

class MixString {
    public String mixString(String a, String b) {

        String result = "";
        int max = Math.min(a.length(), b.length());
        int blen = b.length();
        int alen = a.length();

        for (int i = 0; i < max; i++) {
                result = result + a.substring(i,i + 1) + b.substring(i,i + 1);
        }
        if (alen < blen) {
            String temp1 = b.substring(blen-(blen - alen));
            return result + temp1;
        }
        else {
            String temp2 = a.substring(alen-(alen - blen));
            return result + temp2;
        }
//        int aLen = a.length();
//        int bLen = b.length();
//        int max = Math.max(aLen, bLen);
//        String word = "";
//
//        for (int i = 0; i < max; i++) {
//            if (i <= aLen-1)
//                word += a.substring(i,i+1);
//            if (i <= bLen-1)
//                word += b.substring(i,i+1);
//
//        }
//        return word;
    }
}
