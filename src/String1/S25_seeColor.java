package String1;

/*Given a string, if the string begins with "red" or "blue"
 return that color string, otherwise return the empty string.

        seeColor("redxx") → "red"
        seeColor("xxred") → ""
        seeColor("blueTimes") → "blue"*/

class SeeColor {
    public String seeColor(String str) {

        if (str.startsWith("red"))
            return "red";
        if (str.startsWith("blue"))
            return "blue";

        return "";
    }
}

public class S25_seeColor {
    public static void main(String[] args) {
        SeeColor seeColor = new SeeColor();
        System.out.println(seeColor.seeColor("edxx"));
    }
}
