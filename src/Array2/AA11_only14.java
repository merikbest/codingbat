package Array2;

/*Given an array of ints, return true if every element is a 1 or a 4.

        only14([1, 4, 1, 4]) → true
        only14([1, 4, 2, 4]) → false
        only14([1, 1]) → true*/

class Only14 {
    public boolean only14(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4)
                return false;
        }
        return true;
    }
}

public class AA11_only14 {
    public static void main(String[] args) {
        Only14 only14 = new Only14();
        System.out.println(only14.only14(new int[] {1, 4, 2, 4}));
    }
}
