package sortingAlgorithms;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author akifkilic
 */
import java.util.Scanner;
public class binary_Search {
    
    static int ara (int dizi [], int aranan) {
        
        int alt=0;
        int ust =0;
        
        while (alt<= ust ) {
            int orta = (alt + ust) /2;
            if (dizi [orta] == aranan) {
                return orta;
            }
            else if (dizi [orta] < aranan) {
                alt = orta +1;
            }
            else {
                ust = orta-1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        // 0-30 arasında olan çift sayıların tutulduğu a dizisinde
        //aranan elemanın kaçıncı sırada olduğunu bulma
        
          int[] A = {6, 3, 8, 9, 3, 2, 8, 0, 3};
          Scanner tara= new Scanner (System.in);
          
          int i,x;
          System.out.println(" aradığınız sayıyı giriniz");
          
          x= tara.nextInt();
          
          i= ara(A,x);
          
          if (i==-1) {
              System.out.println("basaramdık usta bulamadık");
          } 
          else {
              System.out.println(x + "dizinin" + i + ".elemenıdır");
    }
          
        
    }
}
