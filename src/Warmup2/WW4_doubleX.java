package Warmup2;

/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

        doubleX("axxbb") → true
        doubleX("axaxax") → false
        doubleX("xxxxx") → true*/

class DoubleX{
    boolean doubleX(String str) {


        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");


//            if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x')
//                break;
////            if (str.substring(i,i+1).equals("x") && str.substring(i,i+2).equals("x"))
////                break;
////            if (str.indexOf("x",i) == str.indexOf("x",i+1))



    }
}

public class WW4_doubleX {
    public static void main(String[] args) {
        DoubleX doubleX = new DoubleX();
        System.out.println(doubleX.doubleX("axaxax"));
    }
}
