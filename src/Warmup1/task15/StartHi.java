package Warmup1.task15;

/*Given a string, return true if the string starts with "hi" and false otherwise.
        startHi("hi there") → true
        startHi("hi") → true
        startHi("hello hi") → false*/

class StartHi {
    public boolean startHi(String str) {
//        return (str.substring(0,2).equals("hi"));
        if(str.length() < 2) {
            return false;
        } else if (str.substring(0,2).equals("hi")) {
            return true;
        } else return false;
    }
}
