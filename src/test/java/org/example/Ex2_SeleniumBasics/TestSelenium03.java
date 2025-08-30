package org.example.Ex2_SeleniumBasics;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium03 {

    @Test
    public void test_Selenium01() {

        // start and stop itself.
        //  If it was a Selenium 3, then we have to do this.

        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");




        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        // You need to setup the Driver(browser)

    }
}
