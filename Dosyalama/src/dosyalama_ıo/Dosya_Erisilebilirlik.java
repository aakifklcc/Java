/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosyalama_ıo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author akifkilic
 */
public class Dosya_Erisilebilirlik {

    public static void main(String[] args) throws IOException {
        // eğer buraya izafi bir yere girecek olursak bu projeyi açtığımız klasöre bakcak

        // bir dosyadaki tüm text fileları bir boxlistte sırala al sana sınav sorusu
        // önce pathe git sonra diziye at, bu diziyi de boxliste at, buton textbox, textfield eklenir vs
        //verdiğimiz directory içinde gezmek
        // ban bi butona bastım bi directory içindeki textlistleri listelesin 
        //diğer bir buton ise boş olan dosyaları veya dolu olan dosyaları  listelesin
        // ya da chechkbox eklesin bu checkbox 250 kb den yüksek olan az olanları vesair sıralasın
        // txt dosyalarını başka bir hedef yere taşıma 100 kbden büyük olanları taşı 
        //– Path Files.move(Path, Path, CopyOption...)
        //directory gidelim bulalım içine alalım comboya atalım istediğimi seçelim yandaki textarea da gözüksün
      
        File f = new File("/Users/akifkilic/NetBeansProjects/Dosyalama/quiz.txt");
        
        Path inputPath = Paths.get("/Ad Astra/Per/Aspera/stars.txt");
        
        System.out.println(Files.exists(inputPath));
       
        Files.delete(inputPath);
       
        System.out.println(Files.exists(inputPath));

        if (f.isDirectory()) {
            System.out.println(f.getAbsolutePath() + "is a directory");
        } else {

        }
        
        
       
    }

}
