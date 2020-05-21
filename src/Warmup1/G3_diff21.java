package Warmup1;

//Given an int n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.

class Diff21 {
    public int diff21(int n) {
        if(n <= 21)
            return 21 - n;
        else
            return (n - 21) * 2;
    }
}

public class G3_diff21 {
    public static void main(String[] args) {
        Diff21 diff21 = new Diff21();
        System.out.println(diff21.diff21(-1));
    }
}
