package Warmup1;

/*Given 2 int values, return true if they are both in the range 30..40 inclusive,
 or they are both in the range 40..50 inclusive.

        in3050(30, 31) → true
        in3050(30, 41) → false
        in3050(40, 50) → true*/

class In3050 {
    public boolean in3050(int a, int b) {
//        boolean s1 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
//        boolean s2 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;
        }

        if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }
}



public class G25_in3050 {
    public static void main(String[] args) {
        In3050 in3050 = new In3050();
        System.out.println(in3050.in3050(30,41));
    }
}
