package Warmup1;

//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

class Makes10{
    public boolean makes10(int a, int b) {
        if((a + b == 10) || (a == 10) || (b == 10)) {
            return true;
        }
        return false;
    }
}

public class G5_makes10 {
    public static void main(String[] args) {
        Makes10 makes10 = new Makes10();
        System.out.println(makes10.makes10(11,6));
    }
}
