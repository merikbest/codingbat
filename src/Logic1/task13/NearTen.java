package Logic1.task13;

/*Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
 Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod

        nearTen(12) → true
        nearTen(17) → false
        nearTen(19) → true*/

class NearTen {
    public boolean nearTen(int num) {

        return num % 10 <= 2 || num % 10 >= 8;

//        if (num % 10 < 3 || num % 10 >=8)
//            return true;
//        else
//            return false;
//        int sum = num % 10;
//        return sum <= 2;
//        return (num + 1) % 10 == 0 || num % 2 == 0;
    }
}