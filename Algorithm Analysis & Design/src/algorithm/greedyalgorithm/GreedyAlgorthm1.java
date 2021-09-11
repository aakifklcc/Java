/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

/**
 *
 * @author akifkilic
 */
public class GreedyAlgorthm1 {

    void bubbleSort(int items[]) {
        int n = items.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (items[j] < items[j + 1]) {
                    
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

  
    void printArray(int items[]) {
        int n = items.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(items[i] + " ");
        }
        System.out.println();
    }

    
    public static void main(String args[]) {
        GreedyAlgorthm1 ob = new GreedyAlgorthm1();

        int amount = 15;
        int items[] = {12,5,10,2,1};
        int num;
        String message = "";

        ob.bubbleSort(items);
        System.out.println("Sorted array");
        ob.printArray(items);
        System.out.println("****************");

        for (int i = 0; i < items.length; i++) {
            if (items[i] <= amount) {
                num = 1;

                message += num + " " + "times " + items[i] + "\n";
                amount -= num * items[i];

            }
        }
        if (amount != 0) {
            System.out.println("No solution!");
        } else {
            System.out.println(message);
        }
    }

}
