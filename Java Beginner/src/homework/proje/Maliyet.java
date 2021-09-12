/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.util.Iterator;

/**
 *
 * @author akifkilic
 */
public class Maliyet {

    static int alinanToplamurun;
    static int maliyet;
    private Object urun;

    // Bozuk, bozulmuş iptal edilen veya fazla gelen ürünlerin devre dışı bırakılması
    public void urunKaldir(String urunadi, int adet, Stok s1) {
        Urun alinanUrun = new Urun();
        alinanUrun = s1.getUrun(urunadi);

        if (alinanUrun.urunadedi >= adet) {
            alinanUrun.urunadedi -= adet;
            alinanToplamurun += adet;
            alinanUrun.urunadedi += adet;
            maliyet += (alinanUrun.fiyat) * (adet);
            System.out.println("Ürün alımı başarıyla gerçekleşti.");

        } else {
            System.out.println("Bu ürün için " + alinanUrun.urunadedi + "tane talep oluşturuldu");

        }

    }

    //Test sınıfında oluşan ürünü rafa alma
    public void urunkaldir(Urun d1, int adet) {

        if (d1.urunadedi >= adet) {
            d1.urunadedi++;
            d1.urunadedi -= adet;
            maliyet += (d1.fiyat * adet);
            System.out.println("Ürün rafa kaldırılmıştır.");

        } else {
            System.out.println("üründen max" + d1.urunadedi + "tane kalmiştir.");

        }

    }

    public void urunkaldir(String urunadi, int adet, Stok z1, Personel p1) {

        Urun alinanUrun = new Urun();
        alinanUrun = z1.getUrun(urunadi);
        if (alinanUrun.urunadedi >= adet) {
            alinanUrun.urunadedi -= adet;
            alinanToplamurun += adet;
            alinanUrun.urunadedi += adet;
            maliyet += (alinanUrun.fiyat) * (adet);
            p1.alinanUrunler += adet;
            p1.butce += (alinanUrun.fiyat * adet) * ((double) 3 / 100);
            System.out.println("Ürün rafa tamamiyle kaldirilmiştir.");

        } else {
            System.out.println("Bu üründen " + alinanUrun.urunadedi + "tane kalmiştir.");

        }

    }

    void KaldirilmaTespitEt(Stok z1) {
        for (Iterator<Urun> it = z1.urunler.iterator(); it.hasNext();) {
            Urun urun = it.next();
            System.out.println(urun.urunadedi + "adet" + urun.adi + "rafa kaldirildi.");
        }

    }

    void urunMaliyetArttir(Stok z1, double yuzdezam) {
        for (int i = 0; i < z1.urunler.size(); i++) {
            z1.urunler.get(i).fiyat *= (yuzdezam + 100) / 100;

        }

    }

    public void toplamKaldirilmaBul() {

        System.out.println("toplamda " + alinanToplamurun + "adet ürün rafa alınmıştır");

    }

    public void maliyetbul() {

        System.out.println("toplamda " + maliyet + "tutarında maliyet oluşmuştur.");
        
    }
    
    public class fiyat extends Maliyet{
    
        public void maliyetbul() {
            int çekirdek=3;
            int ayran=2;
            double poğaça=1.2;
            
      fiyat f=new fiyat();
    f.maliyetbul();
        
    }
}

}
