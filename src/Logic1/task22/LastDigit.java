package Logic1.task22;

/*Given three ints, a b c, return true if two or more of them have the same rightmost digit.
 The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

        lastDigit(23, 19, 13) → true
        lastDigit(23, 19, 12) → false
        lastDigit(23, 19, 3) → true*/

class LastDigit {
    public boolean lastDigit(int a, int b, int c) {
        if (a % 10 == b % 10 || b % 10 == c % 10 || c % 10 == a % 10)
            return true;
        else
            return false;
    }
}
