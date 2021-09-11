/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package December_19;

/**
 *
 * @author akifkilic
 */
public class Ex_2 {

    public static void main(String[] args) {

        /*Write a program to determine whether the relation represented by the Matrix Mr
     _ Reflexive (Alli mii=1)
        _ Symmetric (MR=(MR)^t)
            _Antisymmetric (if mij=1 with i notequal j, then mji=0)
        
        
         */
        int[][] mR = new int[][]{ {1, 1, 6},
                                  {9, 5, 7},
                                  {3, 4, 5}};
        
      System.out.println(reflexive(mR));

//        int[][] mRT = new int[3][3];
        
        

//        for (int i = 0; i < mR.length; i++) {
//            for (int j = 0; j < mR[0].length; j++) {
//
////                mR [i][j]= (int)(1+Math.random()*20);
//                System.out.print(mR[i][j] + " ");
//
//                if (mR[i][i] == 1) {
//                    System.out.println("it is reflexive");
//
//                }
//
//                if (mRT[i][j] == mR[j][i]) {
//                    System.out.println("it is symmetric");
//                }
//
//                if (mR[i][j] == 1 && i != j) {
//                    System.out.println("Antisymmetric");
//
//                }
//            }
//            System.out.println();
//
//        }

    }
        
    static boolean reflexive ( int matrix [][]) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                
                if(i==j && matrix [i][j]!=1){
                    return false;
                    
                }
                
            } 
            
        }return true;
    } 
}
