/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11;

/**
 *
 * @author akifkilic
 */
public class NewClass {
    
    public static int topla(int a, int b) {
        
        int toplam=a+b;
        return toplam;
    }
    
    public static void  ikikat(int k) {
        
        int x=topla(k,k)*2;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        ikikat(3);
    }
}
