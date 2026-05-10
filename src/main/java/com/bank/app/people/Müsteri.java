package com.bank.app.people;

import com.bank.app.accounts.BankaHesabi;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.cards.KrediKarti;
import java.util.ArrayList;
import java.util.Random;

public class Müsteri extends Kisi {
    private String musteriNumarasi;
    private ArrayList<BankaHesabi> hesaplar;
    private ArrayList<KrediKarti> krediKartlari;

    public Müsteri(String ad, String soyad, String email, int telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
        this.hesaplar = new ArrayList<>();
        this.krediKartlari = new ArrayList<>();
        
        Random rnd = new Random();
        this.musteriNumarasi = "MUS-" + (rnd.nextInt(90000) + 10000);
    }

    public void hesapEkle(String hesapTuru) {
        if (hesapTuru.equals("Vadesiz")) {
            hesaplar.add(new VadesizHesap(0)); // Başlangıç bakiyesi 0
            System.out.println("Vadesiz hesap açıldı.");
        } else if (hesapTuru.equals("Yatirim")) {
            hesaplar.add(new YatirimHesabi(0)); 
            System.out.println("Yatırım hesabı açıldı.");
        }
    }

    public void krediKartiEkle(double limit) {
        // Borç başta 0
        krediKartlari.add(new KrediKarti(limit, 0)); 
        System.out.println("Kredi kartı oluşturuldu. Limit: " + limit);
    }

    public void hesapSil(BankaHesabi hesap) {
        if (hesap.getBakiye() > 0) {
            System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
        } else {
            hesaplar.remove(hesap);
            System.out.println("Hesap silindi.");
        }
    }

    public void krediKartiSil(KrediKarti kart) {
        if (kart.getGuncelBorc() == 0) {
            krediKartlari.remove(kart);
            System.out.println("Kredi kartı silindi.");
        } else {
            System.out.println("Lütfen öncelikle borç ödemesi yapınız.");
        }
    }

    public String getMusteriNumarasi() { 
        return musteriNumarasi; 
    }
    public ArrayList<BankaHesabi> getHesaplar() { 
        return hesaplar; 
    }
    public ArrayList<KrediKarti> getKrediKartlari() { 
        return krediKartlari; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Müşteri No: " + musteriNumarasi;
    }
}