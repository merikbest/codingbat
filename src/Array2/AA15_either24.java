package Array2;

/*Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

        either24([1, 2, 2]) → true
        either24([4, 4, 1]) → true
        either24([4, 4, 1, 2, 2]) → false*/

class Either24 {
    public boolean either24(int[] nums) {
        int count2 = 0;
        int count4 = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2)
                count2++;
            if (nums[i] == 4 && nums[i + 1] == 4)
                count4++;
        }
               if (count2 != 0 && count4 != 0)
                   return false;
               else if (count2 != 0 || count4 != 0)
                   return true;
        return false;
//        boolean twos = false;
//        boolean fours = false;
//        for (int i=0; i<nums.length-1; i++)
//        {
//            if(nums[i]==2 && nums[i+1]==2) twos = true;
//            if(nums[i]==4 && nums[i+1]==4) fours = true;
//        }
//        return (twos ^ fours);
    }
}

public class AA15_either24 {
    public static void main(String[] args) {
        Either24 either24 = new Either24();
        System.out.println(either24.either24(new int[] {1, 2, 2}));

    }
}
