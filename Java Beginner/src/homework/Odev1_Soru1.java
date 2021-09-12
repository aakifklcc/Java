/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akifkilic
 */
public class Odev1_Soru1 {
    
    public static void main(String[] args) {
        
        String f = "fatih sultan mehmet vkif uni";
        String[] ar = new String[5]; //dizi olşturuldu

        ar = f.split(" "); //dizinnin elemanları eklendi

        for (int j = 0; j < ar.length; j++) {
            System.out.println(ar[j]); //her eleman diziye aktarıldı ve yazdırıldı.
        }
        
    }
}
