package String1;

class FirstHalf {
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);

    }
}

public class S7_firstHalf {
    public static void main(String[] args) {
        FirstHalf sss = new FirstHalf();
        System.out.println(sss.firstHalf("AsdQwe"));
    }
}
