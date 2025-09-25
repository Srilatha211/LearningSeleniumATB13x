package org.example.Ex9_ActionClasses;

import Utilities.Common_to_all;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab29_KeyActions  extends Common_to_all {


    @Test
    public void KeyActions() {

        WebDriver driver = new FirefoxDriver();
        String Url = "https://awesomeqa.com/practice.html";
        driver.get(Url);

        driver.manage().window().maximize();

        //WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        WebElement firstname = driver.findElement(By.name("firstname"));

        Actions actions = new Actions(driver);

        actions.keyDown(Keys.SHIFT).sendKeys(firstname, "testing")
                .keyUp(Keys.SHIFT).build().perform();


        closing_Browers(driver);
    }


    }

