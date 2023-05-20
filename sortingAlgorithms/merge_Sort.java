package sortingAlgorithms;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akifkilic
 */
// Sorting 2 string arrays in one array
// aynı başharfle başlayan iki kişi olunca sapıtıyo
// eşit sayıda eleman olmayınca da sapıtıyo
import java.util.*;

public class merge_Sort {

    public static void main(String[] args) {

        String[] A = {"ali", "hasan", "osman", "vedat"};
        String[] B = {"cem", "fatih", "hakan", " mert", "yakup"};
        String[] C = new String[A.length + B.length];

        int m = 0, n = 0, r = 0;

        while (m < A.length && n < B.length - 1) {
            if (A[m].compareTo(B[n]) < 0) {
                C[r] = A[m];
                m++;
            } else {
                C[r] = B[n];
                n++;
            }
            if (A[m].compareTo(B[n]) == 0) {
                C[r] = A[m];
                m++;
                n++;
            }
            r++;
        }
        //  Eğer dizilerden biri erken biterse diğer dizinin elemanları direkt C dizisine kopyalanır
        while (m < A.length) {
            C[r] = A[m];
            m++;
            r++;
        }
        while (n < B.length) {
            C[r] = B[n];
            r++;
            n++;
        }
        System.out.println(" Sorted in one array");
        for (int i = 0; i < r; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
