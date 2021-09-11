/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author akifkilic
 */
public class Exercise_1 {

    public static void main(String[] args) {

        System.out.println(per(4, 3));
        System.out.println(comb(13, 11));

    }

    static int per(int n, int r) {

        return (fact(n)) / (fact(n - r));
    }

    static int comb(int n, int r) {

        return fact(n) / (fact(n - r) * fact(r));
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n * fact(n - 1);

        }

    }
}

