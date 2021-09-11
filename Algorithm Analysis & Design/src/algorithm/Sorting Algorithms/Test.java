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
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
		int N = 10;
		Random rand = new Random(123);
		int[] my_Array = new int[N];
		for(int i = 0; i < N; i++)
			my_Array[i] = rand.nextInt(100);
		
		// keep a copy of the original array here:
		int[] originalArray= getCopy(my_Array);
		
		System.out.println("Original Array:");
		Helper.printArray(my_Array);
		
		System.out.println("Sorted Array - Insertion Sort:");
		InsertionSort insSort= new InsertionSort();
		insSort.sort(my_Array);
		Helper.printArray(my_Array);

		my_Array= getCopy(originalArray);
		System.out.println("Sorted Array - Shell Sort:");
		ShellSort shSort= new ShellSort();
		shSort.sort(my_Array);
		Helper.printArray(my_Array);
		
		
	}

	private static int[] getCopy(int[] my_Array) {
		// create a copy of my_Array:
		int[] copyA= new int[my_Array.length];
		for (int i=0; i< my_Array.length; i++){
			copyA[i]= my_Array[i];
		} // end i for
		return copyA;
	}

}
