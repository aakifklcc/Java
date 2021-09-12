/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author akifkilic
 */
public class izafi {
    public static void main(String[] args) {
        Path p1=Paths.get("/Users/akifkilic/NetBeansProjects/Dosyalama/dosya.txt"); //rastgele kendimiz bir yol oluşturmuşuz da gitmeye çalışıyoruz.
        // relative de ise direkt kesin yol  ile gitmek istenen yere gidiyoruz.
        System.out.println(p1); //uzantıyı yazdırır
        System.out.println(p1.getRoot());
        System.out.println(p1.getNameCount());
       
        System.out.println(p1.getFileName()); // en son
//        for (int i = 0; i < p1.getNameCount(); i++) {
//            System.out.println(p1.getName(i));
//        }
                
    }
}
