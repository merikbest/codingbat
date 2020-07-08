package Warmup1.task28;

/*Given two non-negative int values, return true if they have the same last digit,
such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

        lastDigit(7, 17) → true
        lastDigit(6, 17) → false
        lastDigit(3, 113) → true*/

class LastDigit {
    public boolean lastDigit(int a, int b) {
        int a1 = a % 10;
        int b1 = b % 10;

        return a1 == b1;

        //return(a % 10 == b % 10);
    }
}
