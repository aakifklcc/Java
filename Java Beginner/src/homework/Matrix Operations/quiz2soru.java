/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akifkilic
 */
public class quiz2soru {

    public static void main(String[] args) {

        // kntrl shift F : Formatlar
        // ************************************************
        // First Solution
        String f = "Fatih Sultan Mehmet Vakif uni";
        String kelime = "aranıyor";
        String[] ar = new String[5];

        ar = f.split(" ");

        for (int j = 0; j < ar.length; j++) {

            if (ar[j].equals(kelime)) {
                System.out.println("Verilen kelime bulundu");
            }
            else {
              
         System.out.println("Verilen kelime bulunumadı. " );
        }

        }
        // ****Second Solution: indexof ile
        int intIndex = f.indexOf("Fatih");

        if (intIndex == - 1) {
            System.out.println("Verilen kelime bulunamadı. ");
        } else {
            System.out.println("Verilen kelime bulundu. " + "indexno: "+ intIndex);
        }

    }

}
