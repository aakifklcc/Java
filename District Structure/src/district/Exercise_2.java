/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package district;

import static district.Lab12December.per;

/**
 *
 * @author akifkilic
 * 
 * Tekrarlı comb and per
 */
public class Exercise_2 {

    public static void main(String[] args) {

        System.out.println(Rper(4, 3));
        System.out.println(Rcomb(5, 2));

    }

    static double  Rper(double n, double r) {

        return Math.pow(n, r);
    
    }

    static int Rcomb(int n, int r) {

        return fac(n + r - 1) / (fac(n - 1));
    }

    static int fac(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n * fac(n - 1);

        }

    }

}
