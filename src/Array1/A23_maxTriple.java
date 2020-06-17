package Array1;

/*Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
 The array length will be a least 1.

        maxTriple([1, 2, 3]) → 3
        maxTriple([1, 5, 3]) → 5
        maxTriple([5, 2, 3]) → 5*/

class MaxTriple {
    public int maxTriple(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max)
                max = nums[i];

        return max;
    }
}

public class A23_maxTriple {
    public static void main(String[] args) {
        MaxTriple maxTriple = new MaxTriple();

        System.out.println(maxTriple.maxTriple(new int[]{5, 1, 3, 7, 1, 777}));
    }
}
