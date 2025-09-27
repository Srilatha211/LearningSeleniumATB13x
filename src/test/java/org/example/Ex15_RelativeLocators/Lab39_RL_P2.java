package org.example.Ex15_RelativeLocators;

import Utilities.Common_to_all;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Lab39_RL_P2 extends Common_to_all {
    @Test
    public void test_relative_locator_codepen(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");

        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();
        // //button[text()="Submit"]

        WebElement username_element = driver.findElement(By.xpath("//input[@id='username']"));


        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));


        String errorText = error_element.getText();
        Assert.assertEquals(errorText,"Username must be at least 3 characters");




        closing_Browers(driver);

    }
}
