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
public class StringREgex {

    public static void main(String[] args) {
        
        

        String desen = "([0-9] + [a-z])"; // sayı ile başlayıp harfle devam eden "([0-9] + [a-z] + [0-9])" bu da sayıharfsayı
        String desen1 = "[ult]";
        String regex = "^dog$";
        String aranacakıfade = "dog";
        String aranan = "fatih sultan 4523as 43a mfralfa 3ma";
        Pattern p = Pattern.compile(desen);
        Matcher m = p.matcher(aranan);
        while (m.find()) { //neden çalışmıypr bakmak lazım
            System.out.println("fafsf" + m.group());

        }

//        regex:a{3};  aaaaaaaaa burda üç tan ayzdırır
//regex:a{3,} virgülden sonra bulduğu yeri belirtiyor daha iyi
        System.out.println(Pattern.matches("^dog$", "dog")); //TRue
        System.out.println(Pattern.matches("^dog$", "dog ")); // false
        System.out.println(Pattern.matches("^dog$", "dog  dog"));  //false
        System.out.println(Pattern.matches("^dog$", "doggie"));    //false

        Character ch='a';
//        Double dble=232,45;
    }

}
