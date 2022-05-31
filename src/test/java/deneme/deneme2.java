package deneme;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class deneme2 {
    AmazonPage amazonPage=new AmazonPage();
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        amazonPage.aramaKutusu.sendKeys("java"+ Keys.ENTER);
    }

    @Test(dependsOnMethods = "test01")
    public void test03() {
        amazonPage.aramaKutusu.sendKeys("motosiklet"+Keys.ENTER);
    }
}
