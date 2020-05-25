package Logic1;

/*Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
 So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod

        less20(18) → true
        less20(19) → true
        less20(20) → false*/

class Less20 {
    public boolean less20(int n) {
        return n % 20 <= 2;

    }
}

public class L12_less20 {
    public static void main(String[] args) {
        Less20 less20 = new Less20();
        System.out.println(less20.less20(40));
    }
}
