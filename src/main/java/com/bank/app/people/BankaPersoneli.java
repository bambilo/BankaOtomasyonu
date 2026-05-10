package com.bank.app.people;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends Kisi {
    private String personelID;
    private ArrayList<Müsteri> musteriler;

    public BankaPersoneli(String ad, String soyad, String email, int telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
        this.musteriler = new ArrayList<>();
        
        Random rnd = new Random();
        this.personelID = "PER-" + (rnd.nextInt(9000) + 1000);
    }

    public String getPersonelID() { 
        return personelID; 
    }
    public ArrayList<Müsteri> getMusteriler() { 
        return musteriler; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Personel ID: " + personelID;
    }
}