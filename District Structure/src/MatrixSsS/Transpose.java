/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrixSsS;

import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class Transpose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//   iki fonksiyon tanımla bu metotlar bir kümeninn birebir ve örten olduğunu açıklasın
//   fonksiyonumuz y=x+1; (0,1), (1,2),(2,3)
//   örtenlik için codomain alınır domain ile kıyaslanır
//range ile co domain hesaplanır.. birbirine eşitse örtendir.
        int n = 10;
        int x = 0;

//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
        int[] domain;
        int[] eleman;
        for (int i = 0; i < 5; i++) {
            int f = i + 1;
            domain = new int[i];
            eleman = new int[f];
//            int y=input.nextInt();            
            if (domain.length == eleman.length) {
                System.out.println("it is onto");
            }
        }

//        int [][] matris =new int [][]{ 
//                                        {1,2,3},{3,4,5},{6,7,8},
//                                        {5,6,7},{6,7,8},{5,6,7},
//                                        {6,7,8},{5,6,7},{1,2,3}                                       
//                                                                };                               
//        System.out.println(matris);
//        int [][]satis=new int [5][3];
    }
}
