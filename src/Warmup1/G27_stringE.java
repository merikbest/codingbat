package Warmup1;

/*Return true if the given string contains between 1 and 3 'e' chars.

        stringE("Hello") → true
        stringE("Heelle") → true
        stringE("Heelele") → false*/

class StringE {
    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'e')
                count++;
            return count >= 1 && count <= 3;
    }
}

public class G27_stringE {
    public static void main(String[] args) {
        StringE stringE = new StringE();
        System.out.println(stringE.stringE("asdert"));
    }
}
