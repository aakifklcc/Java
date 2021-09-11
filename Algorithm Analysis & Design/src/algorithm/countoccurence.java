/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author akifkilic
 */
public class countoccurence {
    
        //using hashmap for occurence

    static void getMostFrequentElement(int inputArray[]) {
        
        //Creating HashMap object with elements as keys and their occurrences as values
        HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();

        //Inserting all the elements of inputArray into elementCountMap
        for (int i : inputArray) {
            if (elementCountMap.containsKey(i)) {
                //If an element is present, incrementing its count by 1
                elementCountMap.put(i, elementCountMap.get(i) + 1);
                
            } else {
              elementCountMap.put(i, 1);
                //If an element is not present, put that element with 1 as its value
               
            }
        }

        int element = 0;
        int frequency = 1;

        //Iterating through elementCountMap to get the most frequent element and its frequency
      
        Set<Entry<Integer, Integer>> entrySet = elementCountMap.entrySet();

        for (Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > frequency) {
                 element = entry.getKey();
                 frequency = entry.getValue();
            }
        }

        //Printing the most frequent element in array and its frequency
        if (frequency > 1) {
            System.out.println("Input Array : " + Arrays.toString(inputArray));

            System.out.println("Maximum number of occurences : " + element);

            System.out.println("Its frequency : " + frequency);

            System.out.println("____________________________");
        } else {
            System.out.println("Input Array : " + Arrays.toString(inputArray));

            System.out.println("No frequent element. All elements are unique.");

            System.out.println("____________________________");
        }
    }

    public static void main(String[] args) {
        
        int n = 10; // here we can change data size
        int[] arr = new int[n];
       

        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int number = random.nextInt(100) + 1;
            arr[i] = number;
//            System.out.println(arr[i]);
        }

        getMostFrequentElement(arr);
        
         //Time Complexity : O(n)
      

    }

}
