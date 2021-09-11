/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Random;

/**
 *
 * @author akifkilic
 */
public class sequence {

    // print the array's values that created randomly
    public static void main(String[] args) {

        int[] dizi = new int[5];
        int boundseq=5;

        for (int i = 0; i < boundseq; i++) {
            Random random = new Random();
            int sayi = random.nextInt(100) + 1;
            dizi[i] = sayi;
            System.out.println(dizi[i]);
        }
//        for (int k = 1; k < boundseq; k++) {
//            int temp;
//            for (int j = 0; j < boundseq - k; j++) {
//                if (dizi[j] > dizi[j + 1]) {
//                    temp = dizi[j];
//                    dizi[j] = dizi[j + 1];
//                    dizi[j + 1] = temp;
//                }
//            }
//        }
//
//        for (int m = 0; m < boundseq; m++) {
//            if (m != 9) {
//                System.out.println(dizi[m] + " - ");
//            } else {
//                System.out.println  (dizi[m]);
//            }
//        }
    }
}
