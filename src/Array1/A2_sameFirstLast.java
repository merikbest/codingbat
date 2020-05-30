package Array1;

//Given an array of ints, return true if the array is length 1 or more,
// and the first element and the last element are equal.

//        sameFirstLast([1, 2, 3]) → false
//        sameFirstLast([1, 2, 3, 1]) → true
//        sameFirstLast([1, 2, 1]) → true

class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && (nums[0] == nums[nums.length -1]);
    }
}

public class A2_sameFirstLast {
    public static void main(String[] args) {
        SameFirstLast sss = new SameFirstLast();
        System.out.println(sss.sameFirstLast(new int[]{1,2,1}));
    }
}
