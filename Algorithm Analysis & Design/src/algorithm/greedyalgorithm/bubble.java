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
public class bubble {
    
     void bubbleSort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] < arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    /* Prints the array */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        bubble ob = new bubble(); 
        
        int amount=15;
        int arr[] = {2,4,8};
        int num;
        String message = "";
        
        ob.bubbleSort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
        
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] <= amount) {
                num = amount / arr[i];
                 
                message += num + " " + "times " + arr[i] + "\n";
                amount -= num * arr[i];

            }
        }
        if (amount != 0) {
            System.out.println("No solution!");
        } else {
            System.out.println(message);
        }
    } 
} 

