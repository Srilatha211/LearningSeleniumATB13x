package org.example.Ex12_JavaScrip_Executor;

import Utilities.Common_to_all;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab37_JS_Code  extends Common_to_all {
//Here in JS we have 3usages
   // 1.
   // 2.Scrolling even by using pixels
    @Test
    public void test_js() {

        WebDriver driver = new FirefoxDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //without using get driver we can also open the url by using
        //JavaScript executor function
        js.executeScript("window.location = 'https://www.google.com'");

//other url
        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));

        js.executeScript("window.scrollBy(0, 500);");
        js.executeScript("window.scrollBy(0, 500);");

        // we can also print titles and url
        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);




        closing_Browers(driver);
    }}
