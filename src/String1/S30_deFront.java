package String1;

/*Given a string, return a version without the first 2 chars.
 Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 The string may be any length. Harder than it looks.

        deFront("Hello") → "llo"
        deFront("java") → "va"
        deFront("away") → "aay"*/

class DeFront {
    public String deFront(String str) {

        if (str.substring(0,2).equals("ab"))
            return "ab" + str.substring(2);

        if (str.substring(0,1).equals("a"))
            return "a" + str.substring(2);

        if (str.substring(1,2).equals("b"))
            return "b" + str.substring(2);

        return str.substring(2);
    }
}

public class S30_deFront {
    public static void main(String[] args) {
        DeFront deFront = new DeFront();
        System.out.println(deFront.deFront("Hello"));
    }
}
