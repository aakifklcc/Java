/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Arrays;

/**
 *
 * @author akifkilic
 */
public class increasing {
    
    public static void main(String[] args) {
            int[] array = new int[]{8,5,3,7,9,12,4,1};
    Arrays.sort(array);
    for (int i =array.length -1; i>=0;i--){
      System.out.println(array[i]);
    }
    }
    
    //        Arrays.sort(items);
//     Collections.reverse(Arrays.asList(items));
    
}
