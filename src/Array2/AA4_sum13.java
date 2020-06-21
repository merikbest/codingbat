package Array2;


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

public class AA4_sum13 {
    public static void main(String[] args) {
        Sum13 sum13 = new Sum13();
        System.out.println(sum13.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}));
    }
}
