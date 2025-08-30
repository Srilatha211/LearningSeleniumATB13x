package org.example.Ex2_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium08_Maximize_Minimize {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

      //  driver.manage().window().maximize();
       driver.manage().window().minimize();


        driver.quit();
    }
}
