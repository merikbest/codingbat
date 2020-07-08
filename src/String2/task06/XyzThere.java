package String2.task06;

/*Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
 So "xxyz" counts but "x.xyz" does not.

        xyzThere("abcxyz") → true
        xyzThere("abc.xyz") → false
        xyzThere("xyz.abc") → true*/

class XyzThere {
    public boolean xyzThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {

//            if (str.substring(i,i+3).equals("xyz"))
//                return true;
//
//            if (str.substring(i,i+1).equals(".") && str.substring(i+2,i+5).equals("xyz"))
//                return false;
//            }
//         return false;

            if (str.charAt(i) == '.') i++;
            else if (str.substring(i, i + 3).equals("xyz")) return true;
        }
        return false;

    }
}
