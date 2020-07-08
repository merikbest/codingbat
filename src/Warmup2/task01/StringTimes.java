package Warmup2.task01;

/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.

        stringTimes("Hi", 2) → "HiHi"
        stringTimes("Hi", 3) → "HiHiHi"
        stringTimes("Hi", 1) → "Hi"*/

class StringTimes {
    public String stringTimes(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }
}