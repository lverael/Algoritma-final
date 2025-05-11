package finalproje2;

import java.util.Scanner;

public class uçakbiletiuyg {
    public uçakbiletiuyg() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Uçak Bileti Rezervasyon ===");
        System.out.println("Aktif uçuş olan şehirler");
        uçakbiletiarkayüz uçakbiletiarkayüz = new uçakbiletiarkayüz();
        uçakbiletiarkayüz.aktifuçuşlar();
        System.out.print("Adınız: ");
        String ad = scanner.nextLine();
        System.out.print("Soyadınız: ");
        String soyad = scanner.nextLine();
        System.out.print("Kalkış Şehri: ");
        String kalkis = scanner.nextLine();
        System.out.print("Varış Şehri: ");
        String varis = scanner.nextLine();
        System.out.print("Uçuş Tarihi (GG/AA/YYYY): ");
        String tarih = scanner.nextLine();
        System.out.println("Sınıf Seçimi:");
        System.out.println("1 - Ekonomi");
        System.out.println("2 - Business");
        System.out.print("Seçiminiz: ");
        int secim = scanner.nextInt();
        uçakbiletiarkayüz uçakbiletiarkayüz1 = new uçakbiletiarkayüz(ad, soyad, kalkis, varis, tarih, tarih, (double)secim);
        uçakbiletiarkayüz1.fiyatHesapla(secim);
        uçakbiletiarkayüz1.biletYazdir();
    }
}
