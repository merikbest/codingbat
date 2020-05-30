package Array1;

//Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
// Both arrays will be length 1 or more.

//        commonEnd([1, 2, 3], [7, 3]) → true
//        commonEnd([1, 2, 3], [7, 3, 2]) → false
//        commonEnd([1, 2, 3], [1, 3]) → true

class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length -1] == b[b.length -1];
    }
}

public class A4_commonEnd {
    public static void main(String[] args) {
        CommonEnd sss = new CommonEnd();
        System.out.println(sss.commonEnd(new int[] {1,2,3}, new int[] {7,3}));
    }
}
