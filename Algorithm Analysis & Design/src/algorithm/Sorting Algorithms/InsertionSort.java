/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author akifkilic
 */
public class InsertionSort extends Sort{

	public void sort(int[] A){
		int comparisonCounter=0; 
		
		int currentItem;
		int j; // index
		for (int i=1; i< A.length ;i++){
			currentItem= A[i];
			j= i-1;
                        comparisonCounter++;
			while( j>= 0 && A[j]> currentItem){
				A[j+1]= A[j];
				j--;
                                comparisonCounter++;
			} // end while
			A[j+1]= currentItem;
		} // end for
		
		System.out.println("Insertion sort steps: "+ comparisonCounter);
	}
}