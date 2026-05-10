package com.bank.app.main;

import com.bank.app.accounts.VadesizHesap;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.Müsteri;
import com.bank.app.service.BankaService;

public class Main {
    public static void main(String[] args) {
        BankaService servis = new BankaService();

        System.out.println("1.Müşteri oluşturma");
        Müsteri m1 = servis.yeniMusteriOlustur("Ahmet", "Nural", "ahmet@mail.com", 123456);
        Müsteri m2 = servis.yeniMusteriOlustur("Arda", "Nural", "arda@mail.com", 987654);
        System.out.println(m1.toString());

        System.out.println("\n 2.Hesap açma");
        m1.hesapEkle("Vadesiz");
        m2.hesapEkle("Vadesiz");
        
        VadesizHesap ahmetHesap = (VadesizHesap) m1.getHesaplar().get(0);
        VadesizHesap ardaHesap = (VadesizHesap) m2.getHesaplar().get(0);

        System.out.println("\n 3. Hesaba para yatırma");
        ahmetHesap.setBakiye(2000); 
        System.out.println("Ahmet'in Güncel Bakiyesi: " + ahmetHesap.getBakiye());

        System.out.println("\n 4. Para transferi");
        
        ahmetHesap.paraTransferi(ardaHesap, ahmetHesap, 500);
        System.out.println("Ahmet Bakiye: " + ahmetHesap.getBakiye());
        System.out.println("Arda Bakiye: " + ardaHesap.getBakiye());

        System.out.println("\n 5.Kredi kartı tanımlama");
        m1.krediKartiEkle(5000); 
        KrediKarti ahmetKart = m1.getKrediKartlari().get(0);
        ahmetKart.setGuncelBorc(300); // 300 TL harcama
        System.out.println(ahmetKart.toString());

        System.out.println("\n 6.Kredi kartı borcu ödeme");
        ahmetHesap.krediKartiBorcOdeme(ahmetKart, 300);
        System.out.println("Ödeme sonrası Vadesiz Bakiye: " + ahmetHesap.getBakiye());
        System.out.println(ahmetKart.toString());

        System.out.println("\n 7.Hesap silme işlemi");
        m1.krediKartiSil(ahmetKart); 
        
        m1.hesapSil(ahmetHesap);
        
        ahmetHesap.setBakiye(0);
        System.out.println("(Hesaptaki para sıfırlandı)");
        m1.hesapSil(ahmetHesap); 
    }
}