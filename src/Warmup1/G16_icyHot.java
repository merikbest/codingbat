package Warmup1;

/*Given two temperatures, return true if one is less than 0 and the other is greater than 100.
        icyHot(120, -1) → true
        icyHot(-1, 120) → true
        icyHot(2, 120) → false*/

class IcyHot{
    public boolean icyHot(int temp1, int temp2) {
            return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }
}

public class G16_icyHot {
    public static void main(String[] args) {
        IcyHot icyHot = new IcyHot();
        System.out.println(icyHot.icyHot(-2,2));
    }
}
