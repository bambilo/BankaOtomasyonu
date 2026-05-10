package com.bank.app.cards;

import java.util.Random;

public class KrediKarti {
    private String kartNumarasi;
    private double limit;
    private double guncelBorc;
    private double kullanilabilirLimit;

    
    public KrediKarti(double limit, double guncelBorc) {
        this.limit = limit;
        this.guncelBorc = guncelBorc;
        this.kullanilabilirLimit = limit - guncelBorc; //kullanabilir limitini belirliyorum.
        
        Random rnd = new Random();
        this.kartNumarasi = "KART-" + (rnd.nextInt(900000) + 100000); // kart numarası
    }

    public String getKartNumarasi() { 
        return kartNumarasi; 
    }
    public double getLimit() { 
        return limit; }
    
    public double getGuncelBorc() { 
        return guncelBorc; }
    public void setGuncelBorc(double guncelBorc) { 
        this.guncelBorc = guncelBorc; 
        this.kullanilabilirLimit = this.limit - this.guncelBorc; }

    public double getKullanilabilirLimit() { 
        return kullanilabilirLimit; }

    @Override
    public String toString() {
        return "Kart No: " + kartNumarasi + ", Limit: " + limit + ", Borç: " + guncelBorc + ", Kullanılabilir: " + kullanilabilirLimit;
    }
}