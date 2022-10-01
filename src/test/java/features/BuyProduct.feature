
@BuyProduct
Feature: Buy Product

  @UrunEkleme
  Scenario Outline: Sepete Urun Ekleme
    When Çerezleri kabul et'e tıklanır
    Then Giyim ve aksesuar kısmına tıklanır
    Then Kategoriler kısmında Kadın İç Giyim'e tıklanır
    Then Kadın İç Giyim kategorisinde Dizaltı Çorap'a tıklanır
    When Çıkan ürüne tıklanır
    Then Tıklanan ürünün <renk> kısmı kontrol edilir
    When Sepete ekleye tiklanir
    Then Sepeti görüntüleye tıklanır
    Examples:
      | renk   |
      | "SİYAH" |


  @UrunOdeme
  Scenario Outline: Sepeti Onaylama, Kargo Bilgilerini ekleme ve Ödeme Adımına Geçme
    When Çerezleri kabul et'e tıklanır
    Then Giyim ve aksesuar kısmına tıklanır
    Then Kategoriler kısmında Kadın İç Giyim'e tıklanır
    Then Kadın İç Giyim kategorisinde Dizaltı Çorap'a tıklanır
    When Çıkan ürüne tıklanır
    Then Tıklanan ürünün <renk> kısmı kontrol edilir
    When Sepete ekleye tiklanir
    Then Sepeti görüntüleye tıklanır
    When Sepeti Onayla butonuna tıklanır
    Then Üye olmadan devam et butonuna tıklanır
    When Email kısmına <email> Adresi yazılır
    Then Devam et butonuna tıklanır
    When Yeni adres oluştur butonuna tıklanır
    Then Adres başlığı kısmına "Ev Adres" yazılır
    Then Ad kısmına "Emre" yazılır
    Then Soyad kısmına "Öztürk" yazılır
    Then Cep Telefonu kısmına "540 685-4482" yazılır
    Then İl seçilir
    Then İlçe seçilir
    Then Mahalle seçilir
    When Adres kısmına <adres> yazılır
    Then Kaydet Butonuna tıklanır
    When Kargo firması seçilir, Kaydet Devam Et butonuna tıklanır
    Then Ödeme ekranı açılır
    Examples:
      | renk   | email  | adres |
      | "SİYAH" | "deneme123@gmail.com" | "Koşuyolu Caddesi Yalçın Sokağı"|




