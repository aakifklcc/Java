/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Question_1 {

 
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        System.out.print("Please write a word:  ");
        String input = s.next();

        int len = input.length();
        int a = 0, b = 0;

        for (int i = 0; i <= len; i++) {
           System.out.println(input.substring(a, b));
            b++;

        }
         
    }

}
