package Logic1;

/*Given three ints, a b c, return true if b is greater than a, and c is greater than b.
 However, with the exception that if "bOk" is true, b does not need to be greater than a.

        inOrder(1, 2, 4, false) → true
        inOrder(1, 2, 1, false) → false
        inOrder(1, 1, 2, true) → true*/

class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk)
            return b < c;

        if (b > a && c > b)
            return true;
        else
            return false;
    }
}

public class L20_inOrder {
    public static void main(String[] args) {
        InOrder inOrder = new InOrder();
        System.out.println(inOrder.inOrder(1, 1, 2, true));
    }
}
