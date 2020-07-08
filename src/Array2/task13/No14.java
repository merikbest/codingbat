package Array2.task13;

/*Given an array of ints, return true if it contains no 1's or it contains no 4's.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true*/

class No14 {
    public boolean no14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                count1++;
            if (nums[i] == 4)
                count4++;
        }
        if (count1 > 0 && count4 > 0)
            return false;
        else
            return true;
    }
}