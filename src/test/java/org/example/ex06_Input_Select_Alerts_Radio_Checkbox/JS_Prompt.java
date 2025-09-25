package org.example.ex06_Input_Select_Alerts_Radio_Checkbox;

import Utilities.Common_to_all;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class JS_Prompt extends Common_to_all {

    @Test
    public void Prompt() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement elementPrompt= driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        elementPrompt.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
alert.sendKeys("SRILATHA");

//we can even enter the promt in this 2nd way --Dynamic

//        String name = "Latha";
//        alert.sendKeys(name);


alert.accept();
//alert.dismiss


        String result = driver.findElement(By.id("result")).getText();

        Assert.assertEquals(result,"You entered: SRILATHA");
        //2nd way
       // Assert.assertEquals(result,"You entered:" +name);

       // Assert.assertEquals(result," You entered: null");


        closing_Browers(driver);
    }
}
