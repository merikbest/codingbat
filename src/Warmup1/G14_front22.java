package Warmup1;

//Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back,
// so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

class Front22 {
    public String front22(String str) {
        String sss1 = str.substring(0, 2);
        if (str.length() < 3) {
        return str+str+str;
        } else return sss1 + str + sss1;
    }
}

public class G14_front22 {
    public static void main(String[] args) {
        Front22 front22 = new Front22();
        System.out.println(front22.front22("q"));
    }
}

