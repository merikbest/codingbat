package Warmup1;

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

public class G10_frontBack {
    public static void main(String[] args) {
        FrontBack frontBack = new FrontBack();
        System.out.println(frontBack.frontBack("code"));
    }
}
