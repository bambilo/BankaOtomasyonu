package com.bank.app.service;

import com.bank.app.people.Müsteri;

public class BankaService {
    
    public Müsteri yeniMusteriOlustur(String ad, String soyad, String email, int telefonNumarasi) {
        return new Müsteri(ad, soyad, email, telefonNumarasi);
    }
}