/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merge_bottom_up;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author akifkilic
 */

public class Merge_Bottom_up {
    private static Comparable[] aux;
	
	public static void sort(Comparable[] a){
		int N = a.length;
		aux = new Comparable[N];

		/*
		 * Outer loop determines the size of the sub-arrays and 
		 *     doubles them with each pass. This can only happen
		 *     log(N) times.
		 * Inner loop runs from beginning to end of the array
		 *     in increments of sz.
		 * (N - sz) makes sure that lo starts at the _beginning_
		 *     of the final sub-array.
		 */

	for (int sz = 1; sz < N; sz = 2*sz)
	  for (int lo = 0; lo < N - sz; lo += 2*sz)
	   merge(a, aux, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, N - 1));
	}
        
	public static void merge(Comparable[] a, Comparable aux[], int lo, int mid, int hi){
		assert isSorted(a, lo, mid);
		assert isSorted(a, mid + 1, hi);

		for (int k = lo; k <= hi; k++)
			aux[k] = a[k];

		int i = lo;
		int j = mid + 1;

		for (int k = lo; k <= hi; k++){
			if (i > mid){
                            a[k] = aux[j++];
                        }
			else if (j > hi){
                            a[k] = aux[i++];
                        }
			else if(less(aux[j], aux[i]))	{
                            a[k] = aux[j++];
                        }
                        else {
                            a[k] = aux[i++];
                        }
		}

		assert isSorted(a, lo, hi);
	}
		
	public static void main(String[] args){
            
            final int SIZE = 4194304;
            final int SEED = 10;
            Integer[] arrayToSort = new Integer[SIZE];

            Random r = new Random();
            r.setSeed(SEED);

            for (int i = 0; i < SIZE; i++) {
            arrayToSort[i] = r.nextInt();
            }
            
           /*    System.out.print("Unsorted:");
        for (int i = 0; i < arrayToSort.length; i++) {
            System.out.print(arrayToSort[i] + " ");
        } */
           
      
            //  Arrays.sort(arrayToSort); //increasing, ascending artan
            // Arrays.sort(arrayToSort, Collections.reverseOrder());
                      
     

		/* for (Integer i : arrayToSort)
		  System.out.print( i + " ");
		  System.out.println(); */
                
                long startTime = System.currentTimeMillis();
                System.out.println("Start sorting...");
            

		Merge_Bottom_up.sort(arrayToSort);
                
                long stopTime = System.currentTimeMillis();
                long elapsedTime = stopTime - startTime;
                System.out.println("Running Time: " + elapsedTime);
                
               /*   System.out.println("After bottom up mergesort: "); 
		for (int i = 0; i < arrayToSort.length; i++) {
			System.out.print(arrayToSort[i] + " ");
                } */

               
	}
	private static boolean less(Comparable a, Comparable b) { 
            return a.compareTo(b) < 0; }

	private static boolean isSorted(Comparable[] a, int lo, int hi){
		for (int i = lo + 1; i < hi; i++)
			if (less(a[i], a[i-1])) return false;
		return true;
	}
        
}
