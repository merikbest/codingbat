package String1.task16;

/*Given a string, return true if it ends in "ly".

        endsLy("oddly") → true
        endsLy("y") → false
        endsLy("oddy") → false*/

class EndsLy {
    public boolean endsLy(String str) {
        if (str.length() <= 1)
            return false;
        else return str.substring(str.length() - 2).equals("ly");
    }
}