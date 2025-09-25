package org.example.Ex9_ActionClasses;

import Utilities.Common_to_all;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab29_ActionClass  extends Common_to_all {

    @Test
    public void test_Actions() {


        WebDriver driver = new FirefoxDriver();
        String url = "https://www.spicejet.com/";
        driver.get(url);

        driver.manage().window().maximize();

        WebElement from_Input = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        WebElement to_Input = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));

        Actions actions = new Actions(driver);
        // move to element
        // click
        // sendkeys -BLR

        actions.moveToElement(from_Input).click().sendKeys("BLR").build().perform();
        actions.moveToElement(to_Input).click().sendKeys("DEL").build().perform();


        closing_Browers(driver);

    }
}
