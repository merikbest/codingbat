package Array1;

/*Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0.
 The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

        makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        makeLast([1, 2]) → [0, 0, 0, 2]
        makeLast([3]) → [0, 3]*/


import java.util.Arrays;

class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] nums1 = new int[nums.length * 2];
        nums1[nums1.length - 1] = nums[nums.length - 1];
        return nums1;

//        for (int i = 0; i < nums1.length; i++) {
//            nums1[i] = 0;
//        }
//
//        return nums1;

    }
}

public class A14_makeLast {
    public static void main(String[] args) {
        MakeLast sss = new MakeLast();

        System.out.println(Arrays.toString(sss.makeLast(new int[]{4, 5, 6})));
    }
}
