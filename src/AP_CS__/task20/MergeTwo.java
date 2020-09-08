package AP_CS__.task20;

//Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
// Return a new array containing the first N elements from the two arrays.
// The result array should be in alphabetical order and without duplicates.
// A and B will both have a length which is N or more.
// The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order,
// copying elements directly to the new array.

//        mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
//        mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
//        mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]

//public String[] mergeTwo(String[] a, String[] b, int n) {
//String out[] = new String[n];
//        int aindex =0, bindex=0;
//        for(int i=0; i<n; i++){
//        int cmp = a[aindex].compareTo( b[bindex] );
//        if(cmp<=0){
//        out[i] = a[aindex++];
//        if(cmp == 0) bindex++;
//        } else {
//        out[i] = b[bindex++];
//        }
//        }
//        return out;

import java.util.ArrayList;
import java.util.Arrays;

class MergeTwo {
    public String[] mergeTwo(String[] a, String[] b, int n) {
        String [] array = new String[a.length + b.length];
        System.arraycopy(a, 0, array, 0, a.length);
        System.arraycopy(b, 0, array, a.length, b.length);
        Arrays.sort(array);

        ArrayList<String> array2 = new ArrayList<>(Arrays.asList(array));

        for (int i = 0; i < array2.size(); i++) {
            if (array2.get(i).equals(array2.get(i+1)))
                array2.remove(i);
        }

        ArrayList<String> array3 = new ArrayList<>(n);

        for (int i = 0; i < array3.size(); i++) {
            array3.add(array2.get(i));
        }
        return (String[])array3.toArray(new String[array3.size()]);
    }
}