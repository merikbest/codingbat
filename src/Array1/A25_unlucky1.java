package Array1;

/*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
 Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

        unlucky1([1, 3, 4, 5]) → true
        unlucky1([2, 1, 3, 4, 5]) → true
        unlucky1([1, 1, 1]) → false*/

class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return false;
        else if ((nums[0] ==1 && nums[1] ==3) ||
                (nums[1] ==1 && nums[2] ==3) ||
                (nums[nums.length -1] ==3 &&
                        nums[nums.length -2] ==1))
        return true;
        else
            return false;

//        if (nums.length > 3)
//        return ((nums[0] == 1 && nums[1] == 3) ||(nums[1] == 1 && nums[2] == 3) ||
//                ((nums[nums.length -1] == 1 || nums[nums.length -2] == 3)));
//        else
//            return false;
    }
}

public class A25_unlucky1 {
    public static void main(String[] args) {

    }
}
