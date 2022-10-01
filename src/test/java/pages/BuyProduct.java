package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.util.Random;

public class BuyProduct {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    public BuyProduct(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 8);
        this.helper = new ElementHelper(driver);
    }
    
    By cerezBtn=By.cssSelector("#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    By giyimKategori=By.cssSelector("a[title='GİYİM & AKSESUAR']");
    By kdnicGiyimKategori=By.cssSelector(".js-filter-link[href='/giyim-aksesuar/kadin-ic-giyim/']");
    By dizaltiCorap=By.cssSelector(".js-filter-link[href='/giyim-aksesuar/dizalti-corap/']");
    By siyahCorap=By.cssSelector("a[title='Penti Kadın 50 Denye Pantolon Çorabı Siyah']");
    By colorText=By.cssSelector("div[class='selected-variant-text'] span");
    By sepeteEkleButonu=By.cssSelector(".add-to-basket.button.green.block.with-icon.js-add-basket");
    By sepetiGoruntule=By.cssSelector(".go-to-shop");
    By sepetiOnaylaBtn=By.cssSelector(".button.green.checkout-button.block.js-checkout-button");
    By uyeOlmadanDevamBtn=By.cssSelector("a[title='ÜYE OLMADAN DEVAM ET']");
    By emailPlaceholder=By.cssSelector("input[name='user_email']");
    By devamBtn=By.cssSelector("button[class='button block green']");
    By adresOlustur=By.cssSelector("body > section:nth-child(2) > section:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(3) > li:nth-child(1) > a:nth-child(1)");
    By adresAdiPlaceholder=By.cssSelector("input[placeholder='Ev adresim, iş adresim vb.']");
    By AdPlaceholder=By.cssSelector("input[name='first_name']");
    By SoyadPlaceholder=By.cssSelector("input[name='last_name']");
    By phonePlaceholder=By.cssSelector("input[name='phone_number']");
    By adresPlaceholder=By.cssSelector("textarea[name='line']");
    By kaydetBtn=By.cssSelector("button[class='button green js-set-country js-prevent-emoji']");
    By kargoFirm=By.cssSelector("div[class='radio']");
    By kaydetDevamBtn=By.xpath("/html[1]/body[1]/section[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/button[1]");
    By odemeHeader=By.cssSelector("div[class='payment-area js-payment-tab-content active'] div[class='card'] div[class='section-hero']");

    public void clickCookieBtn() {
        helper.click(cerezBtn);
    }
    
    public void clickGiyimCategory() {
        helper.click(giyimKategori);
    }

    public void clickKadınİcGiyim() {
        helper.click(kdnicGiyimKategori);
    }

    public void clickDizaltıCorap() {
        helper.click(dizaltiCorap);
    }

    public void clickFirstProduct() {
        helper.click(siyahCorap);
    }

    public void checkProductColor(String renk) {
        helper.checkElementText(colorText,renk);
    }

    public void clickSepeteEkleButonu() {
        helper.click(sepeteEkleButonu);
    }

    public void clickSepetiGoruntule() {
        helper.click(sepetiGoruntule);
    }

    public void clickSepetiOnaylaBtn() {
        helper.click(sepetiOnaylaBtn);
    }

    public void clickUyeOlmadanDevamBtn() {
        helper.click(uyeOlmadanDevamBtn);
    }

    public void typeEmail(String email) {
        helper.sendKey(emailPlaceholder,email);
    }

    public void clickDevamBtn() {
        helper.click(devamBtn);
    }

    public void clickAdresOlustur() {
        helper.click(adresOlustur);
    }
    
    public void typeAdresAdı(String adresAdi) {
        helper.sendKey(adresAdiPlaceholder,adresAdi);
    }

    public void typeName(String ad) {
        helper.sendKey(AdPlaceholder,ad);
    }

    public void typeSurname(String soyad) {
        helper.sendKey(SoyadPlaceholder,soyad);
    }

    public void typePhoneNumber(String telefonNum) {
        helper.sendKey(phonePlaceholder,telefonNum);
    }

    public void selectİl() {
        Select se = new Select(driver.findElement(By.cssSelector("select[name='city']")));
        se.selectByVisibleText("İSTANBUL");

    }

    public void selectİlce() {
        Select sel = new Select(driver.findElement(By.cssSelector("select[name='township']")));
        sel.selectByVisibleText("BAKIRKÖY");
    }

    public void selectMahalle() throws InterruptedException {
        Thread.sleep(500);
        Select selct = new Select(driver.findElement(By.cssSelector("select[name='district']")));
        selct.selectByVisibleText("KARTALTEPE MAH");


    }

    public void typeAdres(String adres) throws InterruptedException {
        //Thread.sleep(500);
        helper.sendKey(adresPlaceholder,adres);
        selectMahalle();
    }

    public void clickKaydetBtn() throws InterruptedException {

       /* JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0 , 100);"); */
        Random r = new Random();
        int low = 10;
        int high = 40;
        int result = r.nextInt(high-low) + low;
        String Adres=" No: 18";
        typeAdres(Adres);
        Thread.sleep(500);
        helper.click(kaydetBtn);
       String Adres1=" Daire:"+" "+result;
        typeAdres(Adres1);
        Thread.sleep(1000);
        helper.click(kaydetBtn);
        Thread.sleep(1000);
    }

    public void selectKargoAndClickKaydet() {
        helper.click(kargoFirm);
        helper.click(kaydetDevamBtn);
    }

    public void checkOdemePage(){
        helper.checkElementVisible(odemeHeader);
    }
}
