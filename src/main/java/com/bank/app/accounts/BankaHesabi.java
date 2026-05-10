package com.bank.app.accounts;

import java.util.Random;

public class BankaHesabi {
    private String iban;
    protected double bakiye;

  
    public BankaHesabi(double bakiye) {
        this.bakiye = bakiye;
        
        Random rnd = new Random();
        this.iban = "TR" + (rnd.nextInt(9000000) + 1000000);
    }

    public String getIban() { 
        return iban; 
    }
    public double getBakiye() { 
        return bakiye; 
    }
    public void setBakiye(double bakiye) { 
        this.bakiye = bakiye; }
    

    @Override
    public String toString() {
        return "IBAN: " + iban + ", Bakiye: " + bakiye;
    }
}