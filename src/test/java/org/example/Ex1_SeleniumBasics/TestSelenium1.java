package org.example.Ex1_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSelenium1 {

    @Test
    public void test_Code(){
        Assert.assertEquals("Sri","Latha");
    }

    @Test
    public void test_OpenTheTestingAcademy(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://thetestingacademy.com");



    }

}
