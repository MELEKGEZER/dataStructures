# EditorPage - Java Swing Metin Editörü

## Proje Açıklaması
Bu proje, Java Swing kullanılarak geliştirilen basit bir metin editörüdür. Kullanıcılar, metin girebilir, geri alma (undo) ve yineleme (redo) işlemlerini gerçekleştirebilir, yazı tipini değiştirebilir ve metin biçimlendirme seçeneklerini (bold ve italik) kullanabilir.

## Özellikler
- **Metin Girişi:** Kullanıcılar JTextPane bileşeni içinde metin yazabilir.
- **Undo & Redo:** Kullanıcılar yazdıkları metni geri alabilir ve tekrar getirebilir.
- **Yazı Tipi Seçimi:** Kullanıcılar farklı yazı tipleri arasından seçim yapabilir.
- **Yazı Boyutu Ayarı:** Kullanıcılar yazı boyutunu değiştirebilir.
- **Biçimlendirme:** Kullanıcılar metni kalın (bold) veya italik yapabilir.

## Kullanılan Teknolojiler
- **Java Swing** (Grafik arayüz için)
- **Java Collections Framework (Stack)** (Undo & Redo işlemleri için)
- **GraphicsEnvironment** (Yazı tiplerini listelemek için)

## Kurulum ve Çalıştırma
1. Java yüklü olduğundan emin olun.
2. Proje dizininde bir terminal açın.
3. Aşağıdaki komut ile projeyi çalıştırın:
   ```sh
   javac EditorPage.java
   java EditorPage
   ```
4. Uygulama açıldıktan sonra metin girebilir, butonları kullanarak düzenlemeler yapabilirsiniz.

## Kullanım Kılavuzu
- **Metin Girişi:** JTextPane'e doğrudan metin yazabilirsiniz.
- **Kaydet Butonu:** Henüz işlevsellik eklenmemiştir.
- **Undo (Geri Al) Butonu:** Son eklenen kelimeyi geri alır.
- **Redo (Yinele) Butonu:** Geri alınan kelimeyi tekrar ekler.
- **Yazı Tipi Seçme:** "Font" açılır menüsünden bir font seçin.
- **Yazı Boyutu Seçme:** "Size" açılır menüsünden bir boyut seçin.
- **Kalın & İtalik Butonları:** Metni kalın veya italik yapar.

## Geliştirme Notları
- `Stack` veri yapısı undo/redo işlemleri için kullanılmıştır.
- `setFont()` metodu, yazı tipini ve stilini günceller.
- `GraphicsEnvironment` sınıfı kullanılarak mevcut yazı tipleri listeye eklenir.
- `JToggleButton` kullanılarak kalın ve italik seçenekleri uygulanır.


## Katkıda Bulunma
Her türlü geri bildirim ve katkıya açığız! Fork'layıp kendi geliştirmelerinizi yapabilirsiniz.

