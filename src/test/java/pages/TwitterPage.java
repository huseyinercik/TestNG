package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TwitterPage {

    public TwitterPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[text()='Telefon numarası veya e-posta adresiyle kaydol']")
    public WebElement kaydolButonu;

    @FindBy(xpath = "//*[text()='E-posta kullan']")
    public WebElement ePostaKullan;

    @FindBy(xpath = "//input[@autocomplete=\"name\"]")
    public WebElement isimKutusu;

    @FindBy(xpath = "//input[@autocomplete=\"email\"]")
    public WebElement ePostaKutusu;

    @FindBy(xpath = "//select[@id=\"SELECTOR_1\"]")
    public WebElement ddm;


}
