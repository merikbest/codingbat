package Array1.task26;

/*        make2([4, 5], [1, 2, 3]) → [4, 5]
        make2([4], [1, 2, 3]) → [4, 1]
        make2([], [1, 2]) → [1, 2]*/

class Make2 {
    public int[] make2(int[] a, int[] b) {
        if (a.length == 1) return new int[]{ a[0], b[0] };
        if (a.length == 0) return new int[]{ b[0], b[1] };

        return new int[]{ a[0], a[1] };
    }
}