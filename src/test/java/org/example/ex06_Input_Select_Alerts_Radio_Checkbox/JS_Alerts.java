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

public class JS_Alerts extends Common_to_all {
@Test

    public void alerts(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement JS_Alert = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        JS_Alert.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        alert.accept();


    String result = driver.findElement(By.id("result")).getText();


    }
}
