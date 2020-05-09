package Warmup1;

/*
Given a string, take the last char and return a new string with the last char added at the front and back,
 so "cat" yields "tcatt". The original string will be length 1 or more.
        backAround("cat") → "tcatt"
        backAround("Hello") → "oHelloo"
        backAround("a") → "aaa"
*/

class BackAround {
    public String backAround(String str) {
        String sas = str.substring(str.length()-1);
        return sas + str + sas;
    }
}

public class G12_backAround {
    public static void main(String[] args) {
        BackAround backAround = new BackAround();
        System.out.println(backAround.backAround("qwerty"));
    }
}
