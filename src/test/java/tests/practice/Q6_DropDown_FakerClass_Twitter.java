package tests.practice;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.TwitterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Q6_DropDown_FakerClass_Twitter {
    //twitter a faker class kullanarak mail ile kayit olmaya calisiniz
//actions class kullanmayin twitteri deneyen instagram i denesin

    TwitterPage twitterPage=new TwitterPage();
    Faker faker=new Faker();
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("twitterUrl"));
        twitterPage.kaydolButonu.click();
        twitterPage.ePostaKullan.click();
        twitterPage.isimKutusu.sendKeys(faker.name().fullName());
        twitterPage.ePostaKutusu.sendKeys(faker.internet().emailAddress());
        Select select=new Select(twitterPage.ddm);


    }
}
