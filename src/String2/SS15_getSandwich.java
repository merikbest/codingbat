package String2;

/*A sandwich is two pieces of bread with something in between.
 Return the string that is between the first and last appearance of "bread" in the given string,
 or return the empty string "" if there are not two pieces of bread.

        getSandwich("breadjambread") → "jam"
        getSandwich("xxbreadjambreadyy") → "jam"
        getSandwich("xxbreadyy") → ""*/

class GetSandwich {
    public String getSandwich(String str) {

        String finalString = "";
        int start = 0;
        int finish = 0;
        boolean found = false;

        if (str.length() <= 10)
            return "";

        for (int i = 0; i < str.length() - 4; i++) {

            if (str.substring(i, i + 5).equals("bread") && found == true)
                finish = i;

            if (str.substring(i, i + 5).equals("bread") && found == false) {
                start = i + 5;
                found = true;
            }
        }

        finalString = str.substring(start, finish);
        return finalString;
    }
}

public class SS15_getSandwich {
    public static void main(String[] args) {
        GetSandwich getSandwich = new GetSandwich();
        System.out.println(getSandwich.getSandwich("xxbreadjambreadyy"));
    }
}
