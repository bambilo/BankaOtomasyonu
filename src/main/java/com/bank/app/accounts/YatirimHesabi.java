package com.bank.app.accounts;

public class YatirimHesabi extends BankaHesabi {
    private String hesapTuru;

    public YatirimHesabi(double bakiye) {
        super(bakiye);
        this.hesapTuru = "Yatirim";
    }

    public void paraEkle(double miktar) {
        this.bakiye += miktar;
        System.out.println("Yatırım hesabına para eklendi.");
    }

    public void paraCek(double miktar) {
        if (this.bakiye >= miktar) {
            this.bakiye -= miktar;
            System.out.println("Yatırım hesabından para çekildi.");
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Tür: " + hesapTuru;
    }
}