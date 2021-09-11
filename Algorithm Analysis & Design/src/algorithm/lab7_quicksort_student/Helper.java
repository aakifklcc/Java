package lab7_quicksort;

import java.util.Arrays;

public class Helper {

    /**
     * *************************************************************************
     * Helper sorting functions.
    **************************************************************************
     */
    // is v < w ?
    public static boolean less(Comparable v, Comparable w) {
        if (v == w) {
            return false;   // optimization when reference equals
        }
        return v.compareTo(w) < 0;
    }

    // exchange a[i] and a[j]
    public static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    /**
     * *************************************************************************
     * Check if array is sorted - useful for debugging.
    **************************************************************************
     */
    public static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    public static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }

    // print array to standard output
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        System.out.println("");
    }

}
