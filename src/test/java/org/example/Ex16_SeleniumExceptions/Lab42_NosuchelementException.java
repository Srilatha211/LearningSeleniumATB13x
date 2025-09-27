package org.example.Ex16_SeleniumExceptions;

import Utilities.Common_to_all;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab42_NosuchelementException  extends Common_to_all {


    @Test
    public void test_selenium_exceptions() {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.vwo.com/");


        driver.findElement(By.id("pramod"));
        //Actually we dont have this element any where in

        //we can have a fix for this by adding try catch

        try {
            driver.findElement(By.id("pramod"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#pramod"}
        //  (Session info: chrome=139.0.7258.139)

    }
}