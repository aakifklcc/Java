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
public class Exercise3 {

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
