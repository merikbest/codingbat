package Array2.task21;

/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

        twoTwo([4, 2, 2, 3]) → true
        twoTwo([2, 2, 4]) → true
        twoTwo([2, 2, 4, 2]) → false
*/

class TwoTwo {
    public boolean twoTwo(int[] nums) {
        int count = 0;
        boolean proverka = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 2)
                proverka = false;
            if (nums[i] == 2 && proverka == false)
                proverka = true;
            if (nums[i] == 2 && proverka == true) {
                proverka = false;
                count++;
            }
        }
        if (count > 2)
            return false;
        else
            return true;

//        public boolean twoTwo(int[] nums) {
//            int index =0;
//            for (int i=0; i<(nums.length); i++)
//            {
//                if(nums[i]==2)
//                {
//                    i++;
//                    if(!(i<(nums.length)) || nums[i] !=2) return false;
//                    while(i<nums.length && nums[i] ==2) i++;
//                }
//            }
//            return true;
//        }
    }
}