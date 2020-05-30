package Array1;

//Given an array of ints length 3, return the sum of all the elements.

//        sum3([1, 2, 3]) → 6
//        sum3([5, 11, 2]) → 18
//        sum3([7, 0, 0]) → 7

import java.util.stream.IntStream;

class Sum3 {
    public int sum3(int[] nums) {
//        nums[0] + nums[1] + nums[2]
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}

public class A5_sum3 {
    public static void main(String[] args) {
        Sum3 sss = new Sum3();
        System.out.println(sss.sum3(new int[] {1,2,3}));
    }
}
