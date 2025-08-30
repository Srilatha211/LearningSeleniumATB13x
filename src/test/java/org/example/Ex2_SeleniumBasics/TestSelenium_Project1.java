package org.example.Ex2_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_Project1 {


    @Test
    public void verify_Katalon_Page() {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //This is one way we get them if we add
        // assertion not required to print
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());


        Assert.assertEquals(driver.getTitle(),"CURA Healthcare Service");

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getPageSource());

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test Case Passed!");
            Assert.assertTrue(true);
        }else {
            System.out.println("Test Case Failed!");
            Assert.fail();
        }
        driver.quit();
    }


    }
