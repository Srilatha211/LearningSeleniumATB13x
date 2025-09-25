package org.example.Ex05_Selenium_Waits;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestSelenium20_Waits {

    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://app.vwo.com");
        /// e1,e2,2

        driver.close();


    }
}
