package Array1.task17;

/*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

        start1([1, 2, 3], [1, 3]) → 2
        start1([7, 2, 3], [1]) → 1
        start1([1, 2], []) → 1*/

class Start1 {
    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1)
            count++;
        if (b.length > 0 && b[0] == 1)
            count++;
        return count;


//        int count1 = 0;
//        int count2 = 0;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == 1)
//                count1++;
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            if (b[i] == 1)
//                count2++;
//        }
//
//        if (count1 > count2)
//            return 1;
//        if (count2 > count1)
//            return 2;
//        else
//            return 0;
    }
}
