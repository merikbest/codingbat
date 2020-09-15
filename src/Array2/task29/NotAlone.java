package Array2.task29;

class NotAlone {
    public int[] notAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val)
                if (nums[i - 1] != nums[i] && nums[i + 1] != nums[i])
                    if (nums[i + 1] > nums[i - 1]) nums[i] = nums[i + 1];
                    else if (nums[i + 1] < nums[i - 1]) nums[i] = nums[i - 1];
        }
        return nums;


//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == val && nums[i+1] > val)
//                nums[i] = nums[i + 1];
//        }
    }
}
