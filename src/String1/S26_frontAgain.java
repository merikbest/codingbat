package String1;

/*Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

        frontAgain("edited") → true
        frontAgain("edit") → false
        frontAgain("ed") → true*/

class FrontAgain {
    public boolean frontAgain(String str) {
        if (str.length() <= 1)
            return false;

        String a = str.substring(0,2);
        String b = str.substring(str.length()-2);

        return a.equals(b);
    }
}

public class S26_frontAgain {
    public static void main(String[] args) {
        FrontAgain frontAgain = new FrontAgain();
        System.out.println(frontAgain.frontAgain("edited"));
    }
}
