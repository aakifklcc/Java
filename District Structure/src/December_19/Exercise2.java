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
public class Exercise2 {
    
    static int N = 4; 
static int M = 4; 
  
  
  
// Function to print the resultant matrix 
static void printIntersection(int A[][], int B[][]) 
{ 
    for (int i = 0; i < M; i++) { 
        for (int j = 0; j < N; j++) { 
  
            // print element value for equal 
            // elements else * 
            if (A[i][j] == B[i][j]) 
                System.out.print(A[i][j] +" "); 
            else
                System.out.print( "* "); 
        } 
  
        System.out.println( " "); 
    } 
} 
  

  
    public static void main (String[] args) { 
           int A[][] = { { 2, 4, 6, 8 }, 
                    { 1, 3, 5, 7 }, 
                    { 8, 6, 4, 2 }, 
                    { 7, 5, 3, 1 } }; 
    int B[][] = { { 2, 3, 6, 8 }, 
                    { 1, 3, 5, 2 }, 
                    { 8, 1, 4, 2 }, 
                    { 3, 5, 4, 1 } }; 
  
    printIntersection(A, B); 
    
    
  
    } 
}

