package com.bank.app.accounts;

import com.bank.app.cards.KrediKarti;

public class VadesizHesap extends BankaHesabi {
    private String hesapTuru;

    public VadesizHesap(double bakiye) {
        super(bakiye);
        this.hesapTuru = "Vadesiz";
    }

    
    public void paraTransferi(BankaHesabi aliciHesap, BankaHesabi gonderenHesap, double miktar) {
        if (gonderenHesap.getBakiye() >= miktar) {
            gonderenHesap.setBakiye(gonderenHesap.getBakiye() - miktar);
            aliciHesap.setBakiye(aliciHesap.getBakiye() + miktar);
            System.out.println("Transfer başarılı.");
        } else {
            System.out.println("Yetersiz bakiye.");
        }
    }

    public void krediKartiBorcOdeme(KrediKarti kart, double miktar) {
        if (this.bakiye >= miktar) {
            this.bakiye -= miktar;
            kart.setGuncelBorc(kart.getGuncelBorc() - miktar);
            System.out.println("Kredi kartı borcu ödendi.");
        } else {
            System.out.println("Hesapta yeterli para yok!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Tür: " + hesapTuru;
    }
}