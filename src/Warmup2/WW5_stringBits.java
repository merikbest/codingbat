package Warmup2;

/*Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"*/

class StringBits {
    public String stringBits(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i = i + 2)
            result = result + str.charAt(i);
        return result;
    }
}

public class WW5_stringBits {
    public static void main(String[] args) {
        StringBits stringBits = new StringBits();
        System.out.println(stringBits.stringBits("Hello"));
    }
}
