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
class Personel {
    
    private static int index;
    
   
    public Personel() {

    }
    Personel(String isim, String soyisim,String birimi,int butce) {
    Personel.this.ad=isim;
    Personel.this.soyad=soyisim;
    Personel.this.birim=birimi;
    Personel.this.butce=butce;
    personelDizi[index] = Personel.this;
   
    index++;
    
    }
    String ad,soyad,birim;
    int butce;
    int ekButce;
    int alinanUrunler;    
    int toplamButce;
    static Personel[]personelDizi =new Personel [3];
   
    
    public void butceArttir(){
        for (int i = 0; i < personelDizi.length; i++) {
            if(personelDizi[i].alinanUrunler>25){
                personelDizi[i].butce+=1000;
                        
            }else {
                personelDizi[i].butce+=250;
            }
            System.out.println("Bütçe Arttırımı Gerçekleştirildi.");
        }
        
    }
    void toplamButceHesapla(){
        toplamButce=ekButce+butce;
        System.out.println(ad+"' in Satış Geliri "+toplamButce + " dir");
    }
    public void personelleriGoster(){
        for (Personel personel : personelDizi) {
            System.out.println("Adı: " +personel.ad+ " Soyadı: "+personel.soyad + "birimi" );
            
        }
    }
}
    




