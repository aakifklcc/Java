/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package district;

/**
 *
 * @author akifkilic
 */
public class Lab12December {

    public static void main(String[] args) {

        /*    #LAB9:
                Q 1: 6!
                Q 2: 8.7.6
        
                Q3: a) C(10,4)
                        b) C(10,0)+C(10,2)+C(10,1)+C(10,4)+C(10,3)=386
                        c) 2^10-[C(10,0)+C(10,2)+C(10,1)+C(10,3)]=848
                        d) C(10,5) beş tane 0 beş tane 1 
                        
        
                Q4: C(17,9).3^8.2^9
        
                Q5:Tekrarlı kombinsyon n=3, r=11 || Solution: C(n+r-1,r)=78
         
         */
        
        System.out.println(per(4, 3));
        System.out.println(comb(13, 11));

    }

    static int per(int n, int r) {

        return (fac(n) )/ (fac(n - r));
    }

    static int comb(int n, int r) {

        return fac(n) / (fac(n - r) * fac(r));
    }

    static int fac(int n) {
        if (n == 1) {
            return 1;

        } else {
            return n * fac(n - 1);

        }

    }

}
