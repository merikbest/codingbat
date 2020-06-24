package Array2;

/*        fizzArray2(4) → ["0", "1", "2", "3"]
        fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        fizzArray2(2) → ["0", "1"]*/

import java.util.Arrays;

class FizzArray2 {
    public String[] fizzArray2(int n) {

        String[] nums = new String[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = String.valueOf(i);   //"\"" + (0+i) + "\"";
        }
        return nums;
    }
}

public class AA12_fizzArray2 {
    public static void main(String[] args) {
        FizzArray2  fizzArray2 = new FizzArray2();
        System.out.println(Arrays.toString(fizzArray2.fizzArray2(4)));
    }
}
