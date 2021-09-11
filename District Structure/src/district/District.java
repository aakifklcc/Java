/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package district;

import java.util.Vector;

/**
 *
 * @author akifkilic
 */
public class District {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*  Vector<String> vec_tor=new Vector<String> ();
        vec_tor.add("gag");
        vec_tor.add("dag");
        vec_tor.add("20");
        vec_tor.add("30");
        
        System.out.println("VEctor: " + vec_tor);
        System.out.println("The element is: "+ vec_tor.elementAt(3)); */
       
        
        char[] U = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] A = {'b', 'd', 'g', 'h'};
        char[] B = {'a', 'b', 'g'};

        int[] chA = getCharacteristicVector(U, A);
        int[] chB = getCharacteristicVector(U, B);

        for (int i = 0; i < chA.length; i++) {
            System.out.print(chA[i]);
        }
        
        
        System.out.println("\n");
        for (int i = 0; i < chB.length; i++) {
            System.out.print(chB[i]);
            
        }
        System.out.println("\n");

        int[] intersection = intersection(chA, chB);

        for (int i = 0; i < intersection.length; i++) {
            System.out.print(intersection[i]);
        }
        System.out.println("\n");

        int[] union = Union(chA, chB);

        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i]);
        }
        System.out.println("\n");

    }

    public static int[] getCharacteristicVector(char[] U, char[] arr) {
        int[] characteristicVector = new int[U.length];

        for (int f = 0; f < characteristicVector.length; f++) {

            characteristicVector[f] = 0;
        }

        for (int i = 0; i < U.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (U[i] == arr[j]) {
                    characteristicVector[i] = 1;
                    break;

                }
            }

        }

        return characteristicVector;

    }

    public static int[] intersection(int[] chA, int[] chB) {
        int[] intersection = new int[chA.length];

        for (int i = 0; i < chA.length; i++) {
            intersection[i] = chA[i] & chB[i];
        }

        return intersection;

    }

    public static int[] Union(int[] chA, int[] chB) {
        int[] union = new int[chA.length];

        for (int i = 0; i < chA.length; i++) {
            union[i] = chA[i] | chB[i];
        }
        return union;

    }

   
    //http://www.phpkodlari.com/kolay-web-sayfasi/iki-dizideki-elemanlari-tek-tek-karsilastirmak/
}
