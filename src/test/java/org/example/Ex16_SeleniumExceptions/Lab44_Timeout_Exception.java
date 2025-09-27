package org.example.Ex16_SeleniumExceptions;

import Utilities.Common_to_all;
import org.openqa.selenium.WebDriver;
import Utilities.Common_to_all;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Lab44_Timeout_Exception extends Common_to_all{

    @Test
public void test_selenium_exceptions() {


    WebDriver driver = new FirefoxDriver();
    System.out.println("Start of program");
    driver.get("https://google.com");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='abc']")));
//here we have given the xpath is incorrect --for eg

    WebElement search_inputbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
    search_inputbox.sendKeys("the testing academy");

    // org.openqa.selenium.TimeoutException:
        // Expected condition failed: waiting for visibility of element located by
        // By.xpath: //textarea[@id='abc']
        // (tried for 10 second(s) with 500 milliseconds interval)
        //If the element is not found in the specifies time




}
}