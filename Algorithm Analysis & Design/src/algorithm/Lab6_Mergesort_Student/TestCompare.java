package lab6_mergesort;

public class TestCompare {

	public static void main(String[] args) {
//        In in = new In(args[0]);
        In in = new In("../Labs/src/input_files/1Mints.txt");
        Comparable[] a = in.readAllIntegers();

        // Classical mergesort:
        Stopwatch timer = new Stopwatch();
        MergeSort.sort(a);
        StdOut.println("Classical mergesort elapsed time (ms) = " + timer.elapsedTime());
        
        
        // Bottom up mergesort:
        in = new In("../Labs/src/input_files/1Mints.txt");
        Comparable[] b = in.readAllIntegers();
        timer = new Stopwatch();
        BottomUpMergeSort.sort(b);
        StdOut.println("Bottom-up mergesort elapsed time (ms) = " + timer.elapsedTime());
       
       
        
        
	}

}
