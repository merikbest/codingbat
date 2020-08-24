package AP_CS__.task12;

//        matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) → 1
//        matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) → 2
//        matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) → 1

class MatchUp {
    public int matchUp(String[] a, String[] b) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("") && !b[i].equals("")) {
                if (a[i].charAt(0) == b[i].charAt(0))
                    count++;
            }
        }
        return count;
    }
}
