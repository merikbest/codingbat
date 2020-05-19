package String2;

/*Return true if the string "cat" and "dog" appear the same number of times in the given string.

        catDog("catdog") → true
        catDog("catcat") → false
        catDog("1cat1cadodog") → true*/

class CatDog {
    public boolean catDog(String str) {

        if (str.length() < 2)
            return true;

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            int end = i + 3;
            if (end > str.length()) {
                end = str.length();
            }

            if (str.substring(i, end).equals("cat"))
                count1++;
            if (str.substring(i, end).equals("dog"))
                count2++;
        }
        if (count1 == count2)
            return true;
        else
            return false;
    }
}

public class SS3_catDog {
    public static void main(String[] args) {
        CatDog catDog = new CatDog();
        System.out.println(catDog.catDog("dogogcat"));
    }
}
