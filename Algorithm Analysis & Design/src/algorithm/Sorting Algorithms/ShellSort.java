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
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ShellSort extends Sort {

    public void sort(int[] A) {
        int comparisonCounter = 0;

        List<Integer> sequence = generateSequence(A.length);

        int currentItem;
        int j; // index
        for (int gap : sequence) {

            // YOUR CODE HERE
            // Hint: Insertion Sort Algorithm
            //################
            // YOUR CODE HERE
            for (int i = gap; i < A.length; i += gap) {
                currentItem = A[i];
                j = i - gap;
                while (j >= 0 && A[j] > currentItem) {
                    comparisonCounter++;
                    A[j + gap] = A[j];
                    j -= gap;
                } // end while
                A[j + gap] = currentItem;
                comparisonCounter++;
            } // end for
            //################

        } // end for each

        System.out.println("Shell sort steps: " + comparisonCounter);
    }

    private static List<Integer> generateSequence(int n) {
        List<Integer> s = new ArrayList<Integer>();
        while (n > 1) {
            n = n / 2;
            s.add(n);
        }
        System.out.println("Sequences:");
        for (int i : s) {
            System.out.print(i + "\t");
        }
        System.out.println();
        return s;
    }
}
