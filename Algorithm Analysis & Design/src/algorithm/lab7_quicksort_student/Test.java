package lab7_quicksort;

public class Test {

    public static void main(String[] args) {
        Comparable[] f = {6.4, 3.5, 7.5, 2.5, 8.9, 4.2, 9.2, 1.1};
        Comparable[] a = {'A', 'N', 'K', 'A', 'R', 'A'};
        Comparable[] i = {7, 8, 3, 4, 6, 5, 2, 4, 3, 1, 6, 1, 7, 9};

        // QuickSort:		
        Helper.show(i);
        System.out.println("Sorted:..");
        Quick_Lomuto.sort(i);
        Helper.show(i);

    }

}
