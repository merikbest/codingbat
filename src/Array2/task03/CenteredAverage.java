package Array2.task03;

/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
 except ignoring the largest and smallest values in the array.
 If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value.
 Use int division to produce the final average. You may assume that the array is length 3 or more.

        centeredAverage([1, 2, 3, 4, 100]) → 3
        centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
        centeredAverage([-10, -4, -2, -4, -2, 0]) → -3*/

import java.util.Arrays;

class CenteredAverage {
    public int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int count = 0;

        for (int i = 1; i < nums.length-1; i++) {
            result += nums[i];
            count++;
        }
        return result/count;

        //            max = Math.max(nums[0], nums[i]);
//            min = Math.min(nums[0], nums[i]);
//
//            if (max == nums[i])
//                nums[i] = 0;
//            if (min == nums[i])
//                nums[i] = 0;
//
//            if (nums[i] != 0)
//            result = result + nums[i];
//            count++;
    }
}
