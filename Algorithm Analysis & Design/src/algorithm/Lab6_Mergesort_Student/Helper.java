package lab6_mergesort;

import java.util.Arrays;

public class Helper {

	  /***********************************************************************
	    *  Helper sorting functions.
	    ***************************************************************************/
	    
	    // is v < w ?
		public static boolean less(Comparable<Comparable> v, Comparable w) {
	        return v.compareTo(w) < 0;
	    }


	   /***************************************************************************
	    *  Check if array is sorted - useful for debugging.
	    ***************************************************************************/
	    public static boolean isSorted(Comparable[] a) {
	        for (int i = 1; i < a.length; i++)
	            if (less(a[i], a[i-1])) return false;
	        return true;
	    }
	    
	    public static boolean isSorted(Comparable[] a, int lo, int hi) {
	        for (int i = lo + 1; i <= hi; i++)
	            if (less(a[i], a[i-1])) return false;
	        return true;
	    }

	    // print array to standard output
	    public static void show(Comparable[] a) {
	    	System.out.println(Arrays.toString(a) );
	    }

}
