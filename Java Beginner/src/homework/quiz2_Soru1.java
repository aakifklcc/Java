/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akifkilic
 */
public class quiz2_Soru1 {

    public static void main(String[] args) {

//         1
//         2 3
//         4 5 6
//         7 8 9 1
//         0 1 1 1 2

        String a = "123456789101112";
        int b = 0;
        for (int i = 0; i < a.length(); i++) { //dizinin boyutu kadar döncek

            for (int j = 0; j <= i; j++) {
                
                System.out.print(a.charAt(b++));
                if (b == a.length()) {
                    return;
                }

            }

            System.out.println();
        }

    }
}
