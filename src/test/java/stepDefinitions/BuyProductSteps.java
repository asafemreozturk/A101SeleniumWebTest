package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.BuyProduct;
import util.DriverFactory;

public class BuyProductSteps {

    WebDriver driver = DriverFactory.getDriver();
    BuyProduct buyProduct = new BuyProduct(driver);

    @When("Çerezleri kabul et'e tıklanır")
    public void çerezleriKabulEtETıklanır() {
        buyProduct.clickCookieBtn();
    }

    @Then("Giyim ve aksesuar kısmına tıklanır")
    public void giyimVeAksesuarKısmınaTıklanır() {
        buyProduct.clickGiyimCategory();
    }

    @Then("Kategoriler kısmında Kadın İç Giyim'e tıklanır")
    public void kategorilerKısmındaKadınİçGiyimETıklanır() {
        buyProduct.clickKadınİcGiyim();
    }

    @Then("Kadın İç Giyim kategorisinde Dizaltı Çorap'a tıklanır")
    public void kadınİçGiyimKategorisindeDizaltıÇorapATıklanır() {
        buyProduct.clickDizaltıCorap();
    }

    @When("Çıkan ürüne tıklanır")
    public void çıkanÜrüneTıklanır() {
        buyProduct.clickFirstProduct();
    }

    @Then("Tıklanan ürünün {string} kısmı kontrol edilir")
    public void tıklananÜrününRenkKısmıKontrolEdilir(String renk) {
        buyProduct.checkProductColor(renk);
    }

    @When("Sepete ekleye tiklanir")
    public void sepeteEkleyeTiklanir() {
        buyProduct.clickSepeteEkleButonu();
    }

    @Then("Sepeti görüntüleye tıklanır")
    public void sepetiGörüntüleyeTiklanir() {
        buyProduct.clickSepetiGoruntule();
    }

    @When("Sepeti Onayla butonuna tıklanır")
    public void sepetiOnaylaButonunaTıklanır() {
        buyProduct.clickSepetiOnaylaBtn();
    }

    @Then("Üye olmadan devam et butonuna tıklanır")
    public void üyeOlmadanDevamEtButonunaTıklanır() {
        buyProduct.clickUyeOlmadanDevamBtn();
    }

    @When("Email kısmına {string} Adresi yazılır")
    public void emailKısmınaEmailAdresiYazılır(String email) {
        buyProduct.typeEmail(email);
    }

    @Then("Devam et butonuna tıklanır")
    public void devamEtButonunaTıklanır() {
        buyProduct.clickDevamBtn();
    }

    @When("Yeni adres oluştur butonuna tıklanır")
    public void yeniAdresOluşturButonunaTıklanır() {
        buyProduct.clickAdresOlustur();
    }

    @Then("Adres başlığı kısmına {string} yazılır")
    public void adresBaşlığıKısmınaYazılır(String adresAdi) {
        buyProduct.typeAdresAdı(adresAdi);
    }

    @Then("Ad kısmına {string} yazılır")
    public void adKısmınaYazılır(String ad) {
        buyProduct.typeName(ad);
    }

    @Then("Soyad kısmına {string} yazılır")
    public void soyadKısmınaYazılır(String soyad) {
        buyProduct.typeSurname(soyad);
    }

    @Then("Cep Telefonu kısmına {string} yazılır")
    public void cepTelefonuKısmınaYazılır(String telefonNum) {
        buyProduct.typePhoneNumber(telefonNum);
    }

    @Then("İl seçilir")
    public void i̇lSeçilir() {
        buyProduct.selectİl();
    }

    @Then("İlçe seçilir")
    public void i̇lçeSeçilir() {
        buyProduct.selectİlce();
    }

    @Then("Mahalle seçilir")
    public void mahalleSeçilir() throws InterruptedException {
        buyProduct.selectMahalle();
    }

    @When("Adres kısmına {string} yazılır")
    public void adresKısmınaAdresYazılır(String adres) throws InterruptedException {
        buyProduct.typeAdres(adres);
    }

    @Then("Kaydet Butonuna tıklanır")
    public void kaydetButonunaTıklanır() throws InterruptedException {
        buyProduct.clickKaydetBtn();
    }

    @When("Kargo firması seçilir, Kaydet Devam Et butonuna tıklanır")
    public void kargoFirmasıSeçilirVeButonunaTıklanır() {
        buyProduct.selectKargoAndClickKaydet();
    }

    @Then("Ödeme ekranı açılır")
    public void ödemeEkranıAçılır() {
        buyProduct.checkOdemePage();
    }


}
