package tests.day19_smoke_Test;

import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegatifLoginTest {
    BrcPage brcPage=new BrcPage();
    @Test
    public void yanlisSifre() {
        //Bir test method olustur positiveLoginTest()
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        //login butonuna bas

        //test data user email: customer@bluerentalcars.com ,
        //test data password : 54321
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et


    }
    //bu class da iki test methodu daha olusturun
    //biri yanlis kullanici
    //digeri de yanlis kullanici ve sifre
}
