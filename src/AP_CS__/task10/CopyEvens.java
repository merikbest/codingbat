package AP_CS__.task10;

//Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
// The original array will contain at least "count" even numbers.

//        copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
//        copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
//        copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]

class CopyEvens{
    public int[] copyEvens(int[] nums, int count) {
        int [] s1 = new int[count];
        int ctr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                s1[ctr] = nums[i];
                ctr++;
            }
            if (ctr == count)
                return s1;
        }
        return nums;
    }
}
