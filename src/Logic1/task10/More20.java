package Logic1.task10;

/*Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod

        more20(20) → false
        more20(21) → true
        more20(22) → true*/

class More20 {
    public boolean more20(int n) {
//        int sum = n % 20;
//        if (sum >= 1 && sum <= 2)
//            return true;
//        else
//            return false;

            return n % 20 >= 1 && n % 20 <= 2;
    }
}
