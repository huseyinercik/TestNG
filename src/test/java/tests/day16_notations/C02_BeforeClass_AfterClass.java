package tests.day16_notations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_BeforeClass_AfterClass extends TestBase {
    //Junit te @BeforeClass ve @AfterClass notasyonuna sahip
    //methodlar static olmak ZORUNDAYDI
    //TestNG bu ZORUNLULUKTAN bizi kurtariyor

    /*
    TestNG bize daha fazla before ve after notasyonlari sunar
    diger before ve after notasyonlari tanimlayacagimiz grup, test ve suit den once ve sonra calisirlar
    ileride xml dosyalari ile birlikte bunu gorecegiz
     */
    @BeforeClass
    public void beforeClassMethod() {
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClassMethod() {
        System.out.println("After class");
    }

    @Test
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techProTesti() {
        driver.get("https://www.techproeducation.com");
    }
}
