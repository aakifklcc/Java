**Evrak Takip Programı**

- **Nasıl çalıştırırım:**
Projenin ana dizinindeki .jar kısayoluna tıklayarak veya dilerseniz projeyi tekrar derleyerek çalıştırabilirsiniz.

- **Programın ana amacı:**

Program evrak takip ve kontrolünü kolaylaştırmaya yöneliktir. Program hastane temasında tasarlanmıştır. Bunu doktor ve hasta ilişkilendirmelerini kullanmak vasıtasıyla, kullanıcıya göstererek yapar. Program sayesinde hastalar, belirli alanlarda ki istediği doktora rahatsızlığını belirten bir rapor gönderir. Karşılığında doktor tarafından hastaya gerekli tedavi içeriğinden oluşan bir reçete gönderilir. Hastalar gönderdikleri ve henüz cevap alamadıkları raporları görebilir, gelen reçeteleri okuyabilir. Doktorlar ise gelen cevapsız reçeteleri ve cevapladıkları reçeteleri görebilir.

- **Bazı ekran görüntüleri:**<br>

![Giriş Ekranı](/img/EvrakSS1.jpg)<br> 
![Kayıt Ekranı](/img/EvrakSS2.jpg)<br> 
![Hasta Ekranı](/img/EvrakSS3.jpg)<br>
![Doktor Ekranı](/img/EvrakSS4.jpg)<br>
![Doktor Ekranı Arama Sekmesi](/img/EvrakSS5.jpg)<br>


- **Program nesneleri ve ilişkileri**

-
  1. **Doktor Nesnesi:**

Gelen hasta raporlarını reçete yazarak cevaplayan. Adı, soyadı, alanı özellikleri yanında kendine has 4 haneli id numarası tutan bir nesnedir. Her doktor nesnesinde rapor ve reçete cinsi tutan bir arraylist vardır. Bunlar olmadan doktor nesnesi amacına ulaşamaz.

-
  1. **Hasta Nesnesi:**

Kendi istediği doktorlara rapor göndererek, cevabı reçete olarak okuyabilen nesnedir. Doktor nesnesi gibi id numarası ve diğer özelliklere sahiptir. Arraylist cinsleri de aynıdır lakin kullanım amaçları farklıdır.

-
  1. **Evrak Nesnesi:**

Evrak nesnesi Rapor ve Reçete nesneleri tarafından kalıtılır. Gerekli alanlarda çok biçimliliği sağlar.

-
  1. **Rapor Nesnesi:**

Açıklama, başlık ve kaçıncı rapor olduğunu sayan bir id sayacı bulundurur. Cevaplanıp cevaplanmadığını kontrol eden boolean da vardır. Bu nesne raporun gönderildiği doktor ve gönderen hasta nesnesi ile ilişkilidir. Ve evrak nesnesi olmadan oluşamaz.

-
  1. **Reçete Nesnesi:**

Reçete nesnesini doktor tarafından hasta nesnesine gönderilir. Başlık ilaç vb. Değişkenlere sahiptir. Evrak nesnesi olmadan oluşturulamaz.

- **Ekranlar ve Temel Bileşenler**
  - **FrameLogin:**
    - Doktor ve hasta kayıtları şifre id ve her defasından tekrardan üretilen random iki sayıyı toplama işlemi kontrol ederek, doktoru veya hastayı kendi sayfalarına yönlendirir. Yeni üyelik açmak içinde bir buton vardır. Bu buton da kayıt sayfasına yönlendirir.
  - **FrameRegister:**
    - Bu sayfada yeni hasta ve doktor nesneleri oluşturulur.
    - Bu sayfada doktor seçeneği için ekstra bir seçenek sunulur.
    - Oluşan Hasta ve Doktor nesnelerinin tutulduğu arraylistler ile ilişkilidir.
  - **FrameDok** :
    - Login ekranından bir doktor nesnesi alır.
    - Seçili gönderilmiş reçeteyi düzenler.
    - Gönderilen reçeteler arasından isme dayalı sorgulama yapar.
    - Girilen doktor hesabına gelen raporları ve bu doktorun gönderdiği reçeteleri gösteren bir jtable vardır.
    - Login ekranına geri gönderen bir buton vardır.
    - Seçili rapora reçete yazmak için yeni bir frame açan bir buton da vardır.
  - **FrameSendRecete:**
    - FrameDok sayfasından doktor nesnesi alır.
    - Raporu gönderen hastayı FrameDok sayfasından alır.
    - Gelen raporun içeriğini ekrana yazar. Bunlar değiştirilemez.
    - Raporun gelenReçeler listesine girilen değerlerden oluşan bir reçete gönderir.
    - İlaç kısmı boş kalabilir lakin tedavi kısmı mutlaka doldurulmalıdır.
  - **FrameHasta:**
    - Login ekranından girilen hasta nesnesini alır.
    - Bu hastanın gelen reçetelerini ve gönderdiği raporları listeleyen bir jtable vardır.
    - Yeni reçete oluşturmak için yeni bir frame açan buton vardır.
    - Sadece gelen reçetelri okumak için yeni frame açan bir buton vardır.
    - Login ekranına dönen bir buton vardır.
  - **FrameSendRapor:**
    - FrameHasta sayfasından hastayı alır.
    - Sayfada sistemde bulunan doktorları alanlarına göre sıralayan bir table vardır.
    - Gerekli yerler girildiğinde belirlenen doktora rapor gönderir.
    - Hasta sayfasına dönen bir buton vardır.
  - **FrameReadRecete:**
    - Bu ekran seçili reçeteyi okumak içindir.
    - Ekrana ilgili raporun özelliklerini yazar.
    - Doktor tarafından gönderilen reçeteyi yazar.
    - Hasta ekranına dönen bir buton vardır.
  - **FrameReceteEdit:**
    - Bu sayfada seçili reçetenin içeriği değiştirilir.
- **Çapraz İşlemler:**
  - Login ekranında, toplama işlemi doğru yapılmadan devam edilemez.
  - Login ekranında, şifre ve id uyuşmalıdır.
  - Kaydol ekranında, aynı tür nesnenin aynı id si olamaz.
  - Kaydol ekranında, şifre 2 kez girilmeli ve uyuşmalıdır.
  - Doktor ekranında, cevap yazılan rapora artık tekrar cevap yazılamaz.
  - Doktor ekranında, gönderilen reçeteler değiştirilirken doktorun gönderilenReceteler listesinden o reçete silinir, düzenlendikten sonra tekrar eklenir. Aynı listeleme işlemleri hastaya uygun şekilde de yapılır.
  - Reçetesi gönderilen rapor doktorun gelenRaporlar listesinden silinir.
  - Hasta gönderdiği rapor cevaplanınca gönderilen listesinden silinir. Gelen listesine eklenir.
