package Array2;

/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times,
 and no 3's are next to each other.

        haveThree([3, 1, 3, 1, 3]) → true
        haveThree([3, 1, 3, 3]) → false
        haveThree([3, 4, 3, 3, 4]) → false*/

class HaveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;
        boolean proverka = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 3)
                proverka = false;
            if (nums[i] == 3 && proverka == true)
                return false;
            if (nums[i] == 3 && proverka == false) {
                proverka = true;
                count++;
            }
        }
        if (count == 3)
            return true;
        else
            return false;
    }
}

public class AA20_haveThree {
    public static void main(String[] args) {
        HaveThree haveThree = new HaveThree();
        System.out.println(haveThree.haveThree(new int[]{3, 1, 3, 3}));
    }
}
