/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import static java.lang.Integer.min;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author akifkilic
 */
public class countoccurence5 {

    // using sorting algorithm 
   static int findMostOccurenceElement(int arr[], int n) {

        Arrays.sort(arr);
        int max_freq = 0;
        int ans = -1;
        int i = 0;
        while (i < n) {
            int curr_freq = 1;
            while (i + 1 < n && arr[i + 1] == arr[i]) {
                curr_freq = curr_freq + 1;
                i = i + 1;
            }

            if (max_freq < curr_freq) {
                max_freq = curr_freq;
                ans = arr[i];
            } else if (max_freq == curr_freq) {
                ans = min(ans, arr[i]);
            }
            i = i + 1;
        }
        System.out.println("Occurence times:" + max_freq);
        return ans;
    }

    public static void main(String[] args) {
        int n = 100; // here we can change data size
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            arr[i] = number;
            System.out.println(arr[i]);
        }

        System.out.println("Most occurence number: " + findMostOccurenceElement(arr, n));
        System.out.println("_____________________");

         //Time Complexity: Sorting the array + Linear Traversal of array
        //= O(nlogn) + O(n) = O(n)
         
    }

}
