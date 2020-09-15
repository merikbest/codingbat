package Array2.task28;

import java.util.Arrays;

//Given a non-empty array of ints, return a new array containing the elements from the original array
// that come after the last 4 in the original array. The original array will contain at least one 4.
// Note that it is valid in java to create an array of length 0.

//        post4([2, 4, 1, 2]) → [1, 2]
//        post4([4, 1, 4, 2]) → [2]
//        post4([4, 4, 1, 2, 3]) → [1, 2, 3]


class Post4 {
    public int[] post4(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                int[] foo;
                foo = new int[nums.length - i - 1];

                for (int j = 0; j < foo.length; j++) {
                    foo[j] = nums[i + j + 1];
                }
                return foo;
            }
        }

        int[] bar;
        bar = new int[0];
        return bar;
    }
}
