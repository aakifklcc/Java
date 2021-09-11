/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab9;

/**
 *
 * @author akifkilic
 */
public class Exercise_3 {
    public static void main(String[] args) {

        System.out.println(comb(5, 4, 3, 2));

    }

    static int comb(int n, int s, int a, int b) {

        int apow = (int) Math.pow(a, (n - s));
        int bpow = (int) Math.pow(b, s);

        return (fact(n) / (fact(n - s) * fact(s)))*(apow)*(bpow);

    }

    static int fact(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n * fact(n - 1);

        }

    }
    
}
