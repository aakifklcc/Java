/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belediyehizmetleriprojesi;

import java.util.ArrayList;

/**
 *
 * @author akifkilic
 */
public class VatandaslarSınıfı {

    private int sicilNO;
    private int tc;
    private String ad;
    private String soyad;
    private String babaadi;
    String Borcdurum;
    int Borcmiktarı;

    ArrayList<VatandaslarSınıfı> vatandaslar = new ArrayList();

    Object[][] data = {
        {"123456", "Kadir Aram", "Borç Bulunmamakta", new Integer(0)},
        {"123457", "Kazım Yıldız", "Borç Bulunmamakta", new Integer(0)},
        {"123458", "Ali Nizam", "Borç Bulunmakta", new Integer(100)},
        {"123459", "Akif Kılıç", "Borç Bulunmakta", new Integer(500)}

    };

    public VatandaslarSınıfı(String ad, String soyad, int tc, String babaadi, int sicilNO) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.babaadi = babaadi;
        this.sicilNO = sicilNO;

    }

    public int gettc() {
        return tc;
    }

    public void setId(int tc) {
        this.tc = tc;
    }

    public String getName() {
        return ad;
    }

    public void setName(String ad) {
        this.ad = ad;
    }

    public int getsicilNO() {
        return sicilNO;
    }

    public void getsicilNO(int sicilNo) {
        this.sicilNO = sicilNO;
    }

    public String getsoyad() {
        return soyad;
    }

    public void setsoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getBabaadi() {
        return babaadi;
    }

    public void setBabaadi(String babaadi) {
        this.babaadi = babaadi;
    }

}
