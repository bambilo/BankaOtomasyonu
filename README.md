# Java Banka Otomasyon Sistemi

Bu proje, Java dilinde Nesne Yönelimli Programlamaprensipleri kullanılarak geliştirilmiş kapsamlı bir banka otomasyon simülasyonudur. Kalıtım (Inheritance), Kapsülleme (Encapsulation) ve Çok Biçimlilik (Polymorphism) gibi temel OOP kavramları gerçek hayat senaryolarına uyarlanarak kodlanmıştır.

# Özellikler

- **Kullanıcı Yönetimi:** Müşteri ve Banka Personeli oluşturma, kimlik atama.
- **Hesap İşlemleri:** Vadesiz ve Yatırım hesabı açma, hesaba para yatırma ve çekme.
- **Para Transferi:** Vadesiz hesaplar arasında anlık bakiye kontrollü para transferi.
- **Kredi Kartı Yönetimi:** Kredi kartı tanımlama, harcama simülasyonu ve hesaptan otomatik borç ödeme.
- **Akıllı Limit Hesaplama:** Kredi kartı borcu değiştikçe kullanılabilir limitin dinamik güncellenmesi.
- **Güvenlik ve İş Kuralları:** İçerisinde bakiye bulunan hesapların veya borcu bulunan kredi kartlarının yanlışlıkla silinmesini engelleyen kontrol mekanizmaları.

# Proje Yapısı (Paketler)
- `com.bank.app.people`: Kişi, Müşteri ve Banka Personeli sınıfları (Kalıtım hiyerarşisi).
- `com.bank.app.accounts`: Banka Hesabı (Ata Sınıf), Vadesiz ve Yatırım hesabı sınıfları.
- `com.bank.app.cards`: Kredi Kartı veri ve limit yönetimi.
- `com.bank.app.service`: Nesne oluşturma işlemlerini yöneten servis katmanı.
- `com.bank.app.main`: Test senaryolarının çalıştırıldığı giriş noktası.

# Nasıl Çalıştırılır?

1. Projeyi bilgisayarınıza indirin veya klonlayın.
2. NetBeans, Eclipse veya IntelliJ IDEA gibi bir Java IDE'si ile projeyi açın.
3. `src/com/bank/app/main/Main.java` dizinindeki ana sınıfı bulun.
4. Dosyaya sağ tıklayıp **Run File** (veya IDE'nize göre Run) seçeneğine tıklayın.
5. Senaryo çıktılarını konsol üzerinden takip edebilirsiniz.

---
*Bu proje, Nesne Yönelimli Programlama dersi kapsamında geliştirilmiştir.*
