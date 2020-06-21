package Array2;

/*
Return the number of even ints in the given array.
 Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

        countEvens([2, 1, 2, 3, 4]) → 3
        countEvens([2, 2, 0]) → 3
        countEvens([1, 3, 5]) → 0
*/

class CountEvens {
    public int countEvens(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                count++;
        }
        return count;
    }
}

public class AA1_countEvens {
    public static void main(String[] args) {
        CountEvens countEvens = new CountEvens();
        System.out.println(countEvens.countEvens(new int[]{2, 1, 2, 3, 4}));
    }
}
