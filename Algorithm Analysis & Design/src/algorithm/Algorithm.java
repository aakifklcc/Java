/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author akifkilic
 */
public class Algorithm {

    static int mostFrequent(int arr[], int n) {

        // Sort the array 
        Arrays.sort(arr);

        // find the max frequency using linear 
        // traversal 
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                curr_count++;
            } else {
                if (curr_count > max_count) {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent 
        if (curr_count > max_count) {
            max_count = curr_count;
            res = arr[n - 1];
        }

        return res;
    }

    // Driver program 
    public static void main(String[] args) {

        int[] arr = new int[20];
        int n = 20;

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            arr[i] = number;
            System.out.println(arr[i]);
        }
       
        System.out.println("most frequent: "+mostFrequent(arr, n));

    }

}
