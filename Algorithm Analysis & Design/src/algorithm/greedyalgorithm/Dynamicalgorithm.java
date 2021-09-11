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
public class Dynamicalgorithm {
    public static void main(String[] args) {
		int[] items = { 31,44,17,46 ,18, 12, 1, 5, 20, 43 ,42 ,31 ,39 ,35 ,7 ,49 ,13 ,5 ,13 ,31 ,32 ,10 ,12 ,46 ,37 ,25 ,18 ,7 ,46, 28 };
		int amount = 100;
		int numOfMoney = Integer.MAX_VALUE;
		String solution = "No solution!" ;
                
                
                

		while (greedyAlgorithm(items, amount) != -1) {
			if (numOfMoney > greedyAlgorithm(items, amount)) {
				numOfMoney = greedyAlgorithm(items, amount);
				solution = greedyAlgorithmNumbers(items, amount);
				
			}
			if(items.length>2)
			items = Arrays.copyOfRange(items, 0, items.length - 1);
			else 
				break;
		}
		
		System.out.println(solution);
		
	}

	public static int greedyAlgorithm(int[] items, int amount) {
		int num;
		int temp[] = new int[items.length];
		int numOfMoney = 0;

		Arrays.sort(items);

		for (int k = items.length - 1, i = 0; k >= 0; k--, i++) {
			temp[i] = items[k];
		}

		for (int j = 0; j < temp.length; j++) {

			if (temp[j] <= amount) {
				num = 1;
				amount -= num * temp[j];
				numOfMoney++;
			}

		}

		return amount == 0 ? numOfMoney : -1;

	}

	public static String greedyAlgorithmNumbers(int[] items, int amount) {
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
				amount -= num * temp[j];
				message += num + " " + "times " + temp[j] + "\n";
			}

		}

		return amount != 0 ? "" : message;

	}
}
