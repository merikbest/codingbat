package Warmup2;

/*Given an array of ints, return the number of 9's in the array.

        arrayCount9([1, 2, 9]) → 1
        arrayCount9([1, 9, 9]) → 2
        arrayCount9([1, 9, 9, 3, 9]) → 3*/

class ArrayCount9 {
    public int arrayCount9(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] ==9)
                count++;
        return count;
    }
}

public class WW8_arrayCount9 {
    public static void main(String[] args) {
        ArrayCount9 arrayCount9 = new ArrayCount9();
        System.out.println(arrayCount9.arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }
}
