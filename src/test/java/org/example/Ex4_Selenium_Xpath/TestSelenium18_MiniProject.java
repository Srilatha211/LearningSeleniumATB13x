package org.example.Ex4_Selenium_Xpath;

import Utilities.Common_to_all;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TestSelenium18_MiniProject extends Common_to_all {


    @Test
    public void test_OHRM_login() {

        //```
        ////input[@name="username"]
        ////input[@placeholder="Username"]
        //```
        //```
        ////input[@placeholder="Password"]
        //```
        //
        //
        //```
        ////button[normalize-space()="Login"]
        //``




        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));


        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement h6 = driver.findElement(By.xpath("//h6[text()=\"PIM\"]"));
        Assert.assertEquals(h6.getText(),"PIM");

closing_Browers(driver);



    }





}
