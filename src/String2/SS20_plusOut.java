package String2;

class PlusOut {
    public String plusOut(String str, String word) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - word.length()) {
                if (str.substring(i, i + word.length()).equals(word)) { //Если стр от и,и+ворд.длинна(в нашем случае 2) соответствует ворд
                    result = result + word; //результат будет ворд
//                    i = i + word.length()-1; //дальше ворд минус 1 индекс от и
                } else
                    result = result + "+";
            } else
                result = result + "+";
        }
        return result;
    }
}

public class SS20_plusOut {
    public static void main(String[] args) {
        PlusOut plusOut = new PlusOut();
        System.out.println(plusOut.plusOut("12xy34", "xy"));
    }
}
