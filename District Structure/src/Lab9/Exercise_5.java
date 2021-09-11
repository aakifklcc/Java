/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class Exercise_5 {
    
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your line number");
        int line = input.nextInt();
        System.out.println("**** Say hi to Pascal ****");

        for (int i = 0; i < line; i++) {
            for (int k = 0; k < line - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(fact(i) / (fact(i - j) * fact(j))+" ");

            }
            System.out.println(" ");

        }

    }

    static long fact(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    
}
