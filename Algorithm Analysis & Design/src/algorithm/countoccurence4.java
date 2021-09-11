/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

/**
 *
 * @author akifkilic
 */
public class countoccurence4 {

    static int mostFrequent(int arr[], int n) {

        int freq = 0;
        // Insert all elements in hash 
        Map<Integer, Integer> hp = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hp.containsKey(key)) {
                freq = hp.get(key);
                freq++;

                hp.put(key, freq);
            } else {
                hp.put(key, 1);
            }

        }
        System.out.println("how many times repeated: " + freq);

        // find max frequency. 
        int max_count = 0, res = -1, a = 0;

        for (Entry<Integer, Integer> val : hp.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();

            }
        }

        return res;
    }

    // Driver code 
    public static void main(String[] args) {
        
        int n = 100000;
        int[] arr = new int[n];
        

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            arr[i] = number;
//            System.out.println(arr[i]);
        }
       
        System.out.println("which number: " + mostFrequent(arr, n));
    }
}
