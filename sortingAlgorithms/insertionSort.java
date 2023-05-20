/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingAlgorithms;

/**
 *
 * @author akifkilic
 */
public class insertionSort {

    public static void main(String[] args) {
        // Insertion Sort
        int[] A = new int[5];
        int bos;
        // Scanner tara = new Scanner (System.in);

        for (int b = 0; b < 5; b++) {
            A[b] = (1 + (int) (Math.random() * 20));
        }
        System.out.println("Random Array:");
        for (int d = 0; d < 5; d++) {
            System.out.print(A[d] + "\t");
        }

        for (int i = 1; i < 5; i++) {
            bos = A[i];
            while (i > 0 && A[i - 1] > bos) {
                A[i] = A[i - 1];
                --i;
            }
            A[i] = bos;

        }
        System.out.println(" ");
        System.out.println("Sorted Array: ");

        for (int c = 0; c < 5; c++) {
            System.out.print(A[c] + "\t");
        }
    }

}
