/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author akifkilic
 */
public class Test {

    public static void main(String[] args) {

        Personel Ali = new Personel("Ali", "alp", "Parttime", 330);
        Personel Ahmet = new Personel("Ahmet", "kalp", "Parttime", 330);
        Personel Ayşe = new Personel("Ayşe", "kadı", "Parttime", 330);

        Maliyet maliyet = new Maliyet();
        Stok z1 = new Stok();
        System.out.println("**");

        z1.urunEkle("Kahve", 7, 5);
        z1.urunEkle("Çay", 8, 2);
        z1.urunEkle("Su", 9, 1);
        z1.urunEkle("Kahvaltı", 3, 15);
        z1.urunEkle("Bizküvi", 3, 2);
        System.out.println(" *****");
        maliyet.urunKaldir("Kahve", 1, z1);
        maliyet.urunKaldir("çay", 1, z1);
        maliyet.urunKaldir("su", 1, z1);
        maliyet.urunkaldir("kahve", 1, z1, Ali);
        maliyet.urunkaldir("Su", 1, z1, Ayşe);
        maliyet.urunkaldir("kahvaltı", 2, z1, Ahmet);
        System.out.println("******");
        maliyet.KaldirilmaTespitEt(z1);
        maliyet.maliyetbul();
        maliyet.toplamKaldirilmaBul();
        System.out.println(Maliyet.maliyet + "TL");
        
        Ahmet.toplamButceHesapla();
        Ali.toplamButceHesapla();
        Ayşe.toplamButceHesapla();
        z1.stoktakiUrunleriGör();
        maliyet.urunMaliyetArttir(z1, 10);
        
        z1.stoktakiUrunleriGör();
        
        z1.urunSil("Su");
        z1.stoktakiUrunleriGör();
        
        System.out.println("***");
      maliyet.maliyetbul();
      

    }


}
