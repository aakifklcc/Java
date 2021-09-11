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
public class denem {
    public static void main(String[] args) {
        int amount = 16;
        int items[] = {2, 9,1, 2,4}; // 
        int num;
        int temp[] = new int[items.length];

        Arrays.sort(items);

        for (int k = items.length - 1, i = 0; k >= 0; k--, i++) {
            temp[i] = items[k];
        }

//        for (int k = items.length - 1; k >= 0; k--) {
//            System.out.println(items[k]);
//        }
        for (int j = 0; j < temp.length; j++) {

            if (temp[j] <= amount) {
                num = amount / temp[j];
                System.out.println(num + " " + "times " + temp[j]);
                amount -= num * temp[j];
            }
           
        }

    
    }
}
