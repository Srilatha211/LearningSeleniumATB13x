package org.example.Ex2_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11_NavigationCommands {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");
// Use navigation methods
        //Navigate to commands has forward,backward and refresh
        driver.navigate().to("https://youtube.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }
}
