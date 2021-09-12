/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama_ıo;

import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 *
 * @author akifkilic
 */
public class Random {

    public static void main(String[] args) {
        String file = "/Ad Astra/Per/Aspera/stars.txt ";

        

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) { //rw yazılabilir
            //dosyanın istenilen yerine konup byte byte okuma veya aralarda işlemler yapmaya olanak tanımaktadır
            // eski usulde ise sadece satır satır veya char char okuyorduk
            
            // konumlanılan yerden sonrasını siliyor istenmiyorsa önce alınıyor bu kısım eklendikten sonra Ttekrar gncellnyor
            
            System.out.println("position" + raf.getFilePointer());
            System.out.println("length :" + raf.length());
            
                int cb=0;
                
                while((cb=raf.read())!=-1){
                    System.out.println((char)cb);
                }
                
                byte db[]=new byte[10];
                raf.read(db);
                System.out.println("content : " + new String (db));
                // Pointer points to last byte
                
                
            
        } 
        catch (Exception e) {

        }

    }
}
