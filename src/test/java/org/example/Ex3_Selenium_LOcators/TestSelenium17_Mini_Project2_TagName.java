package org.example.Ex3_Selenium_LOcators;

import io.qameta.allure.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestSelenium17_Mini_Project2_TagName {


    @Owner("Srilatha")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugz.atlassian.net/browse/BUG-17")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_free_trail_error_verify(){

        WebDriver driver =  new FirefoxDriver();
        driver.get("https://app.vwo.com");

            WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
    a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement Buss_Email = driver.findElement(By.id("page-v1-step1-email"));
        Buss_Email.sendKeys("abc");

        WebElement check_Policy= driver.findElement(By.name("gdpr_consent_checkbox"));

        check_Policy.click();


        //Here in case of tag nmae find element will always give u first element

        //tag name is a bad approach u need to avoid bcz it gives multiple elements

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement Err_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(Err_msg.getText(),"The email address you entered is incorrect.");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
