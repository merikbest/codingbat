package String2.task08;

/*We'll say that a String is xy-balanced if for all the 'x' chars in the string,
 there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
 but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

        xyBalance("aaxbby") → true
        xyBalance("aaxbb") → false
        xyBalance("yaaxbb") → false*/

class XyBalance {
    public boolean xyBalance(String str) {

//        for (int i = 0; i < str.length(); i++) {
//            if (str.indexOf('x') < str.indexOf('y'))
//                return true;
//        }
//        return false;
        return str.indexOf('x') < str.indexOf('y') || str.indexOf('x') == str.indexOf('y');

    }
}
