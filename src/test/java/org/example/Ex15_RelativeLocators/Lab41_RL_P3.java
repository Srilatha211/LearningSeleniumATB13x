package org.example.Ex15_RelativeLocators;

import Utilities.Common_to_all;
import org.example.Ex7_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab41_RL_P3 extends Common_to_all {

    @Test
    public void test_AQI(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        WebElement Search = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        Search.sendKeys("India" + Keys.ENTER);
new WaitHelpers().waitJVM(2000);

        //div[contains(@class,"location-name")]/p
        // List of elements
        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));

        for (WebElement location : locations){

            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(location)).getText();
            String aqi = driver.findElement(with(By.tagName("p")).toRightOf(location)).getText();


            System.out.println("| +" + rank + " | " + location.getText() + " | " + aqi + " | ");





        }





    }

}