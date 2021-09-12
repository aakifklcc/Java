/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.util.ArrayList;

/**
 *
 * @author akifkilic
 */
class Stok {

    int toplamUrun;
    public ArrayList<Urun> urunler = new ArrayList();

    // Yeni Ürün ekleme
    void UrunEkle(String urunAdi, int adet, int fiyat) {
        Urun urun = new Urun();
        for (int i = 0; i < urunler.size(); i++) {
            if (urunler.get(i).adi == urunAdi) {
                System.out.println(" Bu ürün yeterince mevcuttur. Lütfen eksik ürünü sipariş veriniz");
                return;
            }

        }
        urun.adi = urunAdi;
        urun.fiyat = fiyat;
        urun.urunadedi += adet;
        System.out.println("yeni ürün eklendi");
    }
//     / varolan ürünun miktarını artırma

    void urunEkle(String urunAdi, int adet, int fiyat) {
        boolean varMi = false;
        for (int i = 0; i < urunler.size(); i++) {
            if (urunler.get(i).adi.equals(urunAdi)) {
                varMi = true;
                urunler.get(i).urunadedi += adet;
                toplamUrun += adet;
                System.out.println(" Stoğa " + adet + " adet " + urunler.get(i).adi + " eklenmiştir.. ");
            }
        }

        if (varMi == false) {
            System.out.println("Böyle bir ürün kaydı bulunamadı..");
        }
    }

    public Urun getUrun(String ad) {
        boolean varMi = false;
        Urun olmayanUrun = new Urun();
        for (int i = 0; i < urunler.size(); i++) {
            if (urunler.get(i).adi.equals(ad)) {
                varMi = true;
                return urunler.get(i);
            }

        }

        if (varMi = false) {
            System.out.println("Böyle Bir Urun Bulunmadi..");
        }
        return olmayanUrun;
    }

    public void Yaz(String urunAdi) {
        for (Urun d1 : urunler) {
            if (d1.adi.equals(urunAdi)) {
                System.out.println("Urunun Fiyatı :" + d1.fiyat);
                System.out.println("Urun adedi :" + d1.urunadedi);
                break;

            }

        }
    }

    public void stoktakiUrunleriGör() {
        for (Urun d1 : urunler) {
            System.out.println("Urun Adı: " + d1.adi);
            System.out.println("Fiyatı: " + d1.fiyat);
            System.out.println("Adedi: " + d1.urunadedi);

        }

    }

    public void urunSil(String silinecekUrun) {
        boolean varMi = false;
        for (int i = 0; i < urunler.size(); i++) {
            if (silinecekUrun == urunler.get(i).adi) {
                varMi = true;
                urunler.remove(i);
                System.out.println("Urun başarıyla silinmiştir.");
            }

        }

        if (varMi == false) {
            System.out.println("Böyle bir urun bulunmamaktadır..");
        }
    }

}
