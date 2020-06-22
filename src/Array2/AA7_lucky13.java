package Array2;

/*Given an array of ints, return true if the array contains no 1's and no 3's.

        lucky13([0, 2, 4]) → true
        lucky13([1, 2, 3]) → false
        lucky13([1, 2, 4]) → false*/

class Lucky13 {
    public boolean lucky13(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3)
                return false;
        }
        return true;
    }
}

public class AA7_lucky13 {
    public static void main(String[] args) {
        Lucky13 lucky13 = new Lucky13();
        System.out.println(lucky13.lucky13(new int[]{0, 2, 4}));
    }
}
