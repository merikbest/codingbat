package String2.task18;

/*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
 Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

        zipZap("zipXzap") → "zpXzp"
        zipZap("zopzop") → "zpzp"
        zipZap("zzzopzop") → "zzzpzp"*/

class ZipZap {
    public String zipZap(String str) {

        for (int i = 0; i < str.length()-2; i++) {

//            result = result + str.substring(i,i+1);
//
//            if (i > 0 && i < str.length()-1) {
//                if (str.charAt(i-1) == 'z' && str.charAt(i+1) == 'p')
//            result = result.substring(0,result.length()-1);
//            }
//            return result;


            if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
                str = str.substring(0, i+1) + str.substring(i+2);
            }
        }
        return str;
    }
}
