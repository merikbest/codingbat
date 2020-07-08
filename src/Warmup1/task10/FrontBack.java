package Warmup1.task10;

/*

Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

*/

class FrontBack{
    public String frontBack(String str) {
        //return str = new StringBuffer(str).reverse().toString();
        //return str = new StringBuffer(str).replace(0, str.lastIndexOf(str), str).toString();
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);

    }
}