package Warmup1;

/*Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
 or return 0 if neither is in that range.

        max1020(11, 19) → 19
        max1020(19, 11) → 19
        max1020(11, 9) → 11*/

class Max1020 {
    public int max1020(int a, int b) {
        int max;
        if (a > b) {
            max = a;
            max = b;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;

/*
        int max;
        boolean a1 = a >= 10 && a <= 20;
        boolean b1 = b >= 10 && b <= 20;

        if(a1 && b1) {
            if (a > b) {
                max = a;
            } else max = b;
            return max;
        }

        if(a1 || b1) {
            if (a > b) {
                max = a;
            } else max = b;
            return max;
        }
        return 0;*/
    }
}

public class G26_max1020 {
    public static void main(String[] args) {
        Max1020 max1020 = new Max1020();
        System.out.println(max1020.max1020(11,10));
    }
}
