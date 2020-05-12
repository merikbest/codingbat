package Warmup1;

/*Given a string, return a string made of the first 2 chars (if present),
 however include first char only if it is 'o' and include the second
 only if it is 'z', so "ozymandias" yields "oz".

        startOz("ozymandias") → "oz"
        startOz("bzoo") → "z"
        startOz("oxx") → "o"*/

class StartOz {
    public String startOz(String str) {
       String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }
}

public class G22_startOz {
    public static void main(String[] args) {
        StartOz startOz = new StartOz();
        System.out.println(startOz.startOz("ozymandias"));
    }
}
