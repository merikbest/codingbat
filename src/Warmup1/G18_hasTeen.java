package Warmup1;

/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 Given 3 int values, return true if 1 or more of them are teen.

        hasTeen(13, 20, 10) → true
        hasTeen(20, 19, 10) → true
        hasTeen(20, 10, 13) → true*/

class HasTeen {
    public boolean hasTeen(int a, int b, int c) {
//        return ((a >= 10 || b >= 10 || c > 10) && (a < 20 || b < 20 || c < 20));
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }
}

public class G18_hasTeen {
    public static void main(String[] args) {
        HasTeen hasTeen = new HasTeen();
        System.out.println(hasTeen.hasTeen(1,2,3));
    }
}
