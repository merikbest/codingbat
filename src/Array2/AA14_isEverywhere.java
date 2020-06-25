package Array2;

/*We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
 at least one of the pair is that value. Return true if the given value is everywhere in the array.

        isEverywhere([1, 2, 1, 3], 1) → true
        isEverywhere([1, 2, 1, 3], 2) → false
        isEverywhere([1, 2, 1, 3, 4], 1) → false*/

class IsEverywhere {
    public boolean isEverywhere(int[] nums, int val) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == val && nums[i + 2] == val)
                return true;
        }
        return false;
    }
}

public class AA14_isEverywhere {
    public static void main(String[] args) {
        IsEverywhere isEverywhere = new IsEverywhere();
        System.out.println(isEverywhere.isEverywhere(new int[]{1, 2, 1, 2, 3, 2, 5}, 2));
    }
}