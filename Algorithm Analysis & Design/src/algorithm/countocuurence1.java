/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

/**
 *
 * @author akifkilic
 */
public class countocuurence1 {

    //here we check the number
    // Returns number of times x occurs in arr[0..n-1] 
    static int countOccurrences(int arr[], int n, int x) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                res++;
            }
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 2;
        System.out.println(countOccurrences(arr, n, x));
    }
}
