package district;

import static district.District.getCharacteristicVector;
public class NewClass {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author akifkilic
 */

    
    public static void main(String[] args) {
        // Discrete Structures: CASE STUDY_LAB Question_1:
        //given U={'a', b,c,d,e,f,g,h,} :: A=(0,1,0,1,0,0,1,1) :: B=11000010
        //write method to find the characteristic vector of the given set
        //public void getCharacteristicVector(char[] uni, char[] arr)
        char[] U = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] A = {'b', 'd', 'g', 'h'};
        char[] B = {'a', 'b', 'g'};

        int[] chA = getCharacteristicVector(U, A);
        int[] chB = getCharacteristicVector(U, B);

        System.out.print("A:");
        for (int i = 0; i < chA.length; i++) {
            System.out.print(chA[i]);
        }
        System.out.println("");
        
        System.out.print("B:");
        for (int i = 0; i < chB.length; i++) {
            System.out.print(chB[i]);
    }System.out.println("");
    
    //Question_1a:
    // Write two methods to find the characteristic vector of AUB and AπB
    
    System.out.print("Intersection:");

        int[] intersection = intersection(chA, chB);

        for (int i = 0; i < intersection.length; i++) {
            System.out.print(intersection[i]);
        }
        System.out.println("");
        System.out.print("Union:");
        int[] union = Union(chA, chB);

        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i]);
        }
        System.out.println("");

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

    
    
    
}
  
    



