package Warmup2.task14;
/*
Suppose the string "yak" is unlucky.
 Given a string, return a version where all the "yak" are removed, but the "a" can be any char.
 The "yak" strings will not overlap.

        stringYak("yakpak") → "pak"
        stringYak("pakyak") → "pak"
        stringYak("yak123ya") → "123ya"*/

class StringYak{
    public String stringYak(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int end = i + 3;
            if (end > str.length())
                end = str.length();

            if (!str.substring(i, end).equals("yak"))
                result = str.replace("yak","");
        }
        return result;

        // String result = "";

        // for (int i=0; i<str.length(); i++) {
        //   // Look for i starting a "yak" -- advance i in that case
        //   if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
        //     i =  i + 2;
        //   } else { // Otherwise do the normal append
        //     result = result + str.charAt(i);
        //   }
        // }

        // return result;
    }
}