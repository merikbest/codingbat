package Array2;

class Sum28 {
    public boolean sum28(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                result += 2;
        }
        return result == 8;
    }
}

public class AA8_sum28 {
    public static void main(String[] args) {
        Sum28 sum28 = new Sum28();
        System.out.println(sum28.sum28(new int[]{2, 3, 2, 2, 4, 2}));
    }
}
