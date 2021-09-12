/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author akifkilic
 */
public class scannerileOkuma {

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/dosyalama.txt");
        Scanner scan = new Scanner(f);

        try {
        
        for (int j = 0; j < f.length(); j++) {
            int i = scan.nextInt();
            System.out.println(i);

        }

       
        }
        catch(Exception e) {
            System.out.println("bilinmeyen veri  "+ e);
            scan.close();
//            e.printStackTrace(); >>whats this mean idk
        }
    }

}
