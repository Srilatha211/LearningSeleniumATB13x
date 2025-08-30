package org.example.Ex2_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium05_WebDriver {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com");
    }
}
