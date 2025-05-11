package finalproje2;

public class uçakbiletiarkayüz {
    public String Ad;
    public String soyad;
    public String kalkis;
    public String varis;
    public String tarih;
    public String sinif;
    public double fiyat;

    public uçakbiletiarkayüz() {
    }

    public uçakbiletiarkayüz(String ad, String soyad, String kalkis, String varis, String tarih, String sinif, double fiyat) {
        this.Ad = ad;
        this.soyad = soyad;
        this.kalkis = kalkis;
        this.varis = varis;
        this.tarih = tarih;
        this.sinif = sinif;
        this.fiyat = fiyat;
    }

    public void fiyatHesapla(int sinifSecimi) {
        if (this.kalkis.equalsIgnoreCase(this.varis)) {
            System.out.println("Kalkış ve varış şehirleri aynı olamaz!");
            this.fiyat = (double)0.0F;
        } else {
            int mesafe = this.getMesafe(this.kalkis, this.varis);
            if (mesafe == -1) {
                System.out.println("Mesafe hesaplanamadı. Şehir bilgileri eksik.");
                this.fiyat = (double)0.0F;
            } else {
                switch (sinifSecimi) {
                    case 1:
                        this.sinif = "Ekonomi";
                        this.fiyat = (double)mesafe * (double)1.0F;
                        break;
                    case 2:
                        this.sinif = "Business";
                        this.fiyat = (double)mesafe * 1.8;
                        break;
                    default:
                        this.sinif = "Bilinmiyor";
                        this.fiyat = (double)0.0F;
                        System.out.println("Geçersiz sınıf seçimi.");
                }

            }
        }
    }

    public void biletYazdir() {
        if (this.fiyat == (double)0.0F) {
            System.out.println("Bilet oluşturulamadı.");
        } else {
            System.out.println("\n--- Bilet Bilgileri ---");
            System.out.println("Yolcu: " + this.Ad + " " + this.soyad);
            System.out.println("Kalkış: " + this.kalkis);
            System.out.println("Varış: " + this.varis);
            System.out.println("Tarih: " + this.tarih);
            System.out.println("Sınıf: " + this.sinif);
            System.out.println("Fiyat: " + this.fiyat + " TL");
        }
    }

    public int getMesafe(String kalkis, String varis) {
        kalkis = kalkis.toLowerCase();
        varis = varis.toLowerCase();
        if ((!kalkis.equals("nevşehir") || !varis.equals("muş")) && (!kalkis.equals("muş") || !varis.equals("nevşehir"))) {
            if ((!kalkis.equals("hatay") || !varis.equals("muş")) && (!kalkis.equals("muş") || !varis.equals("hatay"))) {
                if ((!kalkis.equals("istanbul") || !varis.equals("van")) && (!kalkis.equals("van") || !varis.equals("istanbul"))) {
                    return (!kalkis.equals("izmir") || !varis.equals("antalya")) && (!kalkis.equals("antalya") || !varis.equals("izmir")) ? -1 : 460;
                } else {
                    return 700;
                }
            } else {
                return 580;
            }
        } else {
            return 450;
        }
    }

    public void aktifuçuşlar() {
        System.out.println("Muş      --> Hatay    , Hatay    --> Muş");
        System.out.println("Muş      --> Nevşehir , Nevşehir --> Muş");
        System.out.println("İstanbul --> Van      , Van      --> İstanbul");
        System.out.println("İzmir    --> Antalya  , Antalya  --> İzmir");
    }
}
