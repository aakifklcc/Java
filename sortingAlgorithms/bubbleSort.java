/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortingAlgorithms;

/**
 *
 * @author akifkilic
 */
public class bubbleSort {

    public static void main(String[] args) {
        int n = 6;
        int bos = 0;
        int[] A = new int[n];
        System.out.println(" Random Dizimiz: ");
        for (int a = 0; a < n; a++) {

            A[a] = 1 + (int) (Math.random() * 20);
            System.out.print(A[a] + " ");
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    bos = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = bos;
                }
            }

        }
        System.out.println(" ");
        System.out.println(" Sıralanmış Dizimiz: ");
        for (int b = 0; b < n; b++) {
            System.out.print(A[b] + " ");
        }
    }
}
