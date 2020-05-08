package Warmup1;

//Given 2 int values, return true if one is negative and one is positive.
// Except if the parameter "negative" is true, then return true only if both are negative.

class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }
}
        //        if((a < 0 | b < 0)) {
//            return true;
//        }else if (negative == true & (a < 0 & b <0)) {
//            return true;
//        } else return false;
//    }


public class G7_posNeg {
    public static void main(String[] args) {
        PosNeg posNeg = new PosNeg();
        System.out.println(posNeg.posNeg(12,12,true));
    }
}
