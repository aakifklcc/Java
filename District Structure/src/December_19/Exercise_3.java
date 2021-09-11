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
public class Exercise_3 {

    public static void main(String[] args) {

        // Write a program that finds the union, the 
        //intersectio and difference of two relations represented by the matrices
        // R1UR2
        //R1 intersection R2
        // R1-R2
        //Think that length of R1=R2
        int[][] R1 = new int[3][4];

        int[][] R2 = new int[3][4];
        
        int [][] union;
        int [][] intersection;
        int [][] differenceof;

        for (int i = 0; i < R1.length; i++) {
            for (int j = 0; j < R1[0].length; j++) {

                R1[i][j] = (int) (1 + Math.random() * 20);
                R2[i][j]=(int) (1 + Math.random() * 20);
                
//                System.out.print(R1[i][j] + " " );
//                System.out.print(R2[i][j] +" ");

                
//                System.out.print( + " ");

                if (R1[i][j] == R2[i][j]) {
                   
                }
            } System.out.println();
        }
    }
}
