package Array1;

/*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
 Return the changed array.

        fix23([1, 2, 3]) → [1, 2, 0]
        fix23([2, 3, 5]) → [2, 0, 5]
        fix23([1, 2, 1]) → [1, 2, 1]
*/

import java.util.Arrays;

class Fix23 {
    public int[] fix23(int[] nums) {
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == 3) {
//                nums[i] = 0;
//            } break;
//        }
//        return nums;

        if (nums[0] == 2 && nums[1] == 3)
            nums[1] = 0;
        if (nums[1] == 2 && nums[2] == 3)
            nums[2] = 0;
        return new int[]{nums[0], nums[1], nums[2]};
    }
}

public class A16_fix23 {
    public static void main(String[] args) {
        Fix23 fix23 = new Fix23();

        System.out.println(Arrays.toString(fix23.fix23(new int[]{1, 3, 3})));
    }
}
