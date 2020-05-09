package Warmup1;

/*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 Given 2 int values, return true if one or the other is teen, but not both.

        loneTeen(13, 99) → true
        loneTeen(21, 19) → true
        loneTeen(13, 13) → false*/

class LoneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
}

public class G19_loneTeen {
    public static void main(String[] args) {
        LoneTeen loneTeen = new LoneTeen();
        System.out.println(loneTeen.loneTeen(1,2));
    }
}
