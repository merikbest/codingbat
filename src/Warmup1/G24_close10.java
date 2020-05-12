package Warmup1;

/*
Given 2 int values, return whichever value is nearest to the value 10,
 or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

        close10(8, 13) → 8
        close10(13, 8) → 8
        close10(13, 7) → 0
*/

class Close10 {
    public int close10(int a, int b) {
        int aaa = Math.abs(a - 10);
        int bbb = Math.abs(b - 10);

        if (aaa > bbb)
            return b;

        if (bbb > aaa)
            return a;

        return 0;
    }
}

public class G24_close10 {
    public static void main(String[] args) {
        Close10 close10 = new Close10();
        System.out.println(close10.close10(13,8));
    }
}
