/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class hepsibiarada {

    public static void main(String[] args) {

        //Exercise 1
        System.out.println(per(4, 3));
        System.out.println(comb(13, 11));

        //Exercise 2
        System.out.println(Rper(4, 3));
        System.out.println(Rcomb(5, 2));

        //Exercise 3
        System.out.println(comb(5, 4, 3, 2));

        //Exercise 4
        String num = "11010111";
        num = add(num);
        System.out.println(num);

        //Exercise 5
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your line number");
        int line = input.nextInt();
        System.out.println("**** Say hi to Pascal ****");

        for (int i = 0; i < line; i++) {
            for (int k = 0; k < line - i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(fact(i) / (fact(i - j) * fact(j)) + " ");

            }
            System.out.println(" ");

        }

    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;

        } else {
            return n * fact(n - 1);

        }

    }

    static int per(int n, int r) {

        return (fact(n)) / (fact(n - r));
    }

    static int comb(int n, int r) {

        return fact(n) / (fact(n - r) * fact(r));
    }

    static double Rper(double n, double r) {

        return Math.pow(n, r);

    }

    static int Rcomb(int n, int r) {

        return fact(n + r - 1) / (fact(n - 1));
    }

    static int comb(int n, int s, int a, int b) {

        int apow = (int) Math.pow(a, (n - s));
        int bpow = (int) Math.pow(b, s);

        return (fact(n) / (fact(n - s) * fact(s))) * (apow) * (bpow);

    }

    public static String add(String num) {
        String zeroes = "";
        for (int i = num.length() - 1; 0 <= i; i--) {
            if (num.charAt(i) == '0') {
                num = num.substring(0, i) + "1" + zeroes;
                break;
            }
            zeroes += "0";
        }
        return num;
    }

}

