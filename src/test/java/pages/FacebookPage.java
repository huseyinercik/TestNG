package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@name=\"email\"]")
    public WebElement kullaniciMailKutusu;

    @FindBy(xpath = "//input[@name=\"pass\"]")
    public WebElement kullaniciSifre;

    @FindBy(xpath = "//button[@name=\"login\"]")
    public WebElement login;

    @FindBy(className = "_9ay7")
    public WebElement girilemediYaziElementi;
}
