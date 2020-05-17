package String1;

/*Given a string of any length, return a new string where the last 2 chars,
 if present, are swapped, so "coding" yields "codign".

        lastTwo("coding") → "codign"
        lastTwo("cat") → "cta"
        lastTwo("ab") → "ba"*/

class LastTwo {
    public String lastTwo(String str) {
        if (str.length() <= 1)
            return str;

        String strnew = str.substring(0, str.length()-2);
        String a = str.substring(str.length()-2, str.length()-1);
        String b = str.substring(str.length()-1);

        return strnew + b + a;
    }
}

public class S24_lastTwo {
    public static void main(String[] args) {
        LastTwo lastTwo = new LastTwo();
        System.out.println(lastTwo.lastTwo("ab"));
    }
}
