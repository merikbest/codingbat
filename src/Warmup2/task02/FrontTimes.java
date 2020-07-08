package Warmup2.task02;

/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
 or whatever is there if the string is less than length 3.
 Return n copies of the front;

        frontTimes("Chocolate", 2) → "ChoCho"
        frontTimes("Chocolate", 3) → "ChoChoCho"
        frontTimes("Abc", 3) → "AbcAbcAbc"*/

class FrontTimes {
    public String frontTimes(String str, int n) {

        int num;

        if(str.length() < 3)
            num = str.length();
        else
            num = 3;

        String result = "";

        for (int i = 0; i < n; i++)
                result = result + str.substring(0, num);
        return result;
    }
}