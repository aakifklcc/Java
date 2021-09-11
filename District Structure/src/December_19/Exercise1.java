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
public class Exercise1 {

    static int MAX = 100;

// Fills transpose of mat[N][N] in tr[N][N] 
    static void transpose(int mat[][], int tr[][], int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                tr[i][j] = mat[j][i];
            }
        }
    }

// We will return true if mat[N][N] is symmetric, else false 
    static boolean isSymmetric(int mat[][], int N) {
        int tr[][] = new int[N][MAX];
        transpose(mat, tr, N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] != tr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int mat[][] = {{1, 3, 5},
                       {3, 2, 4},
                       {5, 4, 1}};

        if (isSymmetric(mat, 3)) {
            System.out.println("This matrix is Symetric ");
        } else {
            System.out.println("This matrix is not Symetric");
        }

    }
}
