package tests.day18_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_ConfigReaderKullanimi {

    @Test
    public void test01() {
        FacebookPage facebookPage = new FacebookPage();

        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        // cikarsa cookies kabul edin

        // kullanici mail kutusuna rastgele bir isim yazdirin
        facebookPage.kullaniciMailKutusu.sendKeys(ConfigReader.getProperty("fbWrongUserName"));

        // kullanici sifre kutusuna rastgele bir password yazdirin
        facebookPage.kullaniciSifre.sendKeys(ConfigReader.getProperty("fbWrongPassword"));
        // login butonuna basin
        facebookPage.login.click();
        // giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());

        Driver.closeDriver();
    }
}
