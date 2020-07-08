package Array2.task04;


class Sum13 {
    public int sum13(int[] nums) {
        int result = 0;

        if (nums.length == 0)
            return 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 13) {
                result = result + nums[i];
            } else if (nums[i] == 13 && i < nums.length - 1) {
                nums[i] = 0;
                nums[i + 1] = 0;
            }
        }
        return result;
    }
}
