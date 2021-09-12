/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author akifkilic
 */
public class Stringwork {

    public static void main(String[] args) {

        String desen = "([0-9] + [a-z])"; // sayı ile başlayıp harfle devam eden "([0-9] + [a-z] + [0-9])" bu da sayıharfsayı
        String desen1 = "[ult]";
        String aranan = "fatih sultan 4523as 43a mfralfa 3ma";
        Pattern p = Pattern.compile(desen);
        Matcher m = p.matcher(aranan);
        while (m.find()) { //neden çalışmıypr bakmak lazım
            System.out.println("fafsf" + m.group());

        }
// örnek cepno girdi yanlışılıkla b harfi girdi hata uyarı versin regex ile digit kontrolü yaparsın.

        System.out.println(Pattern.matches("tom", "Tom")); //false
        System.out.println(Pattern.matches("[Tt]om", "Tom")); //TRue

        System.out.println(Pattern.matches(".*abc*", "deabcq")); // true, a herhangi bir nokta, 
        //* tüm karakterleri kotrol ettir ve abc bak c silsen false

        System.out.println(Pattern.matches("tom", "Tom")); //

        System.out.println(Pattern.matches("[a-zA-Z]","123abc")); // virgülden sonraki kısımda kontrol ediyor
          
        System.out.println(Pattern.matches("[\\D*]","abcde123abc"));
             
//         ^ denotes start of the line
//$ da denotes of the line
 
        System.out.println(Pattern.matches("^This$", "This"));
        
        //.* önce veya sonrasında ne gelirse gelsin demek..
        System.out.println(Pattern.matches("^This$", "This is caitanya")); //  kelime kontrolü yapıyor sadece   
        
     
             
             
             
             
             
    }

}
