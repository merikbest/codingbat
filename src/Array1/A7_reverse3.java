package Array1;

//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

//        reverse3([1, 2, 3]) → [3, 2, 1]
//        reverse3([5, 11, 9]) → [9, 11, 5]
//        reverse3([7, 0, 0]) → [0, 0, 7]

class Reverse3 {
    public int[] reverse3(int[] nums) {
        return new int[] {nums[2], nums[1], nums[0]};
    }
}

public class A7_reverse3 {
    public static void main(String[] args) {
        Reverse3 sss = new Reverse3();

    }
}
