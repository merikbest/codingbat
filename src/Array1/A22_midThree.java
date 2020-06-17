package Array1;

/*Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
 The array length will be at least 3.

        midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
        midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
        midThree([1, 2, 3]) → [1, 2, 3]*/

import java.util.Arrays;

class MidThree {
    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};

    }
}

public class A22_midThree {
    public static void main(String[] args) {
        MidThree midThree = new MidThree();
        System.out.println(Arrays.toString(midThree.midThree(new int[]{8, 6, 7, 5, 3, 0, 9})));
    }
}
