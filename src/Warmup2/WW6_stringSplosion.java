package Warmup2;

/*Given a non-empty string like "Code" return a string like "CCoCodCode".

        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"*/

class StringSplosion {
    public String stringSplosion(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++)
            result = result + str.substring(0,i+1);
        return result;
    }
}

public class WW6_stringSplosion {
    public static void main(String[] args) {
        StringSplosion stringSplosion = new StringSplosion();
        System.out.println(stringSplosion.stringSplosion("Code"));
    }
}
