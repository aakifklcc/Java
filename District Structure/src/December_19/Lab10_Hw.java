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
public class Lab10_Hw {

    static int N = 4;
    static int M = 4;

// Function to print the resultant matrix 
    static void printIntersection(int A[][], int B[][]) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                // print element value for equal 
                // elements else * 
                if (A[i][j] == B[i][j]) {
                    System.out.print(A[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }

            System.out.println(" ");
        }
    }
    
    public static int[][] printunion(int[][] A, int[][] B) {
		int[][] unionMatrix = new int[A.length][A[0].length];

		for (int i = 0; i < unionMatrix.length; i++) {
			for (int j = 0; j < unionMatrix.length; j++) {
				if (A[i][j] == 1 || B[i][j] == 1) {
					unionMatrix[i][j] = 1;
				}
			}
		}

		return unionMatrix;
	}
    
    
        final static int SIZE = 4;
       static boolean isTransitive(boolean[][] function) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (function[i][j]) {
                    for (int k = 0; k < SIZE; k++) {
                        if (function[j][k] && !function[i][k]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
       
      
    
    public static void main(String[] args) {
       
        int A[][] = {{2, 4, 6, 8},
                     {1, 3, 5, 7},
                     {8, 6, 4, 2},
                     {7, 5, 3, 1}};

        int B[][] = {{2, 3, 6, 8},
                     {1, 3, 5, 2},
                     {8, 1, 4, 2},
                     {3, 5, 4, 1}};

        printIntersection(A, B);
        printunion(A,B);
        
        
        // Find Transitive matrix exercise 3
         boolean[][] function = new boolean[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            function[i] = new boolean[SIZE];
        }
        function[0][1] = true;
        function[1][2] = true;
        function[0][2] = true;
        function[0][3] = true;
        function[1][3] = true;
        System.out.println(isTransitive(function));

    }
}
