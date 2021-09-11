package lab6_mergesort;

public class Test {

	public static void main(String[] args) {
		Comparable[] f =  {6.4, 3.5, 7.5, 2.5, 8.9, 4.2, 9.2, 1.1} ;
		Comparable[] a =  {'A', 'N', 'K', 'A', 'R', 'A'} ;
		Comparable[] i =  {7, 8, 3, 4, 6, 5, 2, 4, 3, 1, 6, 1, 7, 9}; 
		Comparable[] s =  {7, 1, 3, 2, 6, 5}; 
		
// 		Mergesort:		
		Helper.show(s);
		System.out.println("Sorted:..");
		MergeSort.sort(s);
		Helper.show(s);
		
//// 		BottomUpMergesort:			
//		Helper.show(a);
//		System.out.println("Sorted:..");
//		BottomUpMergeSort.sort(a);
//		Helper.show(a);

		
		
		
	}

}
