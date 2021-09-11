/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author akifkilic
 */
public class GreedyAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int amount = 15;
        int items[] = {12,5,10,2,1};
        int num;
        int temp[] = new int[items.length];
        String message = "";

        Arrays.sort(items);

        for (int k = items.length - 1, i = 0; k >= 0; k--, i++) {
            temp[i] = items[k];
        }

        for (int j = 0; j < temp.length; j++) {

            if (temp[j] <= amount) {
                num = 1;
                message += num + " " + "times " + temp[j] + "\n";
                amount -= num * temp[j];

            }

        }
        if (amount != 0) {
            System.out.println("No solution!");
        } else {
            System.out.println(message);
        }
    }

}
