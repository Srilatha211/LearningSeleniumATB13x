package org.example.Ex2_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestSelenium14_OptionsClasses {

    public static void main(String[] args) {


        FirefoxOptions firefoxoptions = new FirefoxOptions();
       // firefoxoptions.addArguments("--headless");
       // firefoxoptions.addArguments("--window-size=800,600");
        firefoxoptions.addArguments("--incognito");
        firefoxoptions.addArguments("--guest");


// FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?
        WebDriver driver = new FirefoxDriver(firefoxoptions);
        driver.get("https://app.vwo.com");

        System.out.println(driver.getTitle());

      //  driver.quit();
    }
}
