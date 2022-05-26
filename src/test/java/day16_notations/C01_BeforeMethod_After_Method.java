package day16_notations;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_BeforeMethod_After_Method extends TestBase {

    //@BeforeMethod ve @AfterMethod notasyonlari
    // jUnit teki @Before ve @After gibidir
    //her test methodundan once ve sonra calisir
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
