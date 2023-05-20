package sortingAlgorithms;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akifkilic
 */
import java.util.*;

public class linear_Search {

    public static void main(String[] args) {
        int[] A = {6, 3, 8, 9, 3, 2, 8, 0, 3};
        int aranan = 7;
        boolean durum = false;

        for (int i = 0; i < A.length; i++) {
            if ( A[i] == aranan) {
                durum = true;
                break;

            }
        }
         if (durum) {
                System.out.println("aranan bulundu");
            } 
         else {
                System.out.println("bulunamadı basaramdık ustaa");
            }

    }
}
