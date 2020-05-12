package Warmup1;

/*Given a string, return a new string where the last 3 chars are now in upper case.
 If the string has less than 3 chars, uppercase whatever is there.
 Note that str.toUpperCase() returns the uppercase version of a string.

        endUp("Hello") → "HeLLO"
        endUp("hi there") → "hi thERE"
        endUp("hi") → "HI"*/

class EndUp {
    public String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();

        String end = str.substring(str.length() - 3).toUpperCase();
        String mid = str.substring(0, str.length() - 3);

        return mid + end;

/*        public String endUp(String str) {
            if (str.length() <= 3) return str.toUpperCase();
            int cut = str.length() - 3;
            String front = str.substring(0, cut);
            String back  = str.substring(cut);  // this takes from cut to the end

            return front + back.toUpperCase();
        }*/
    }
}

public class G29_EndUp {
    public static void main(String[] args) {
        EndUp endUp = new EndUp();
        System.out.println(endUp.endUp("ha"));
    }
}
