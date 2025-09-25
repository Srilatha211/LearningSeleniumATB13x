package org.example.Ex9_ActionClasses;

import Utilities.Common_to_all;
import org.example.Ex7_WaitHelper.WaitHelpers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab31_PageUP_Down_Actions  extends Common_to_all {

    @Test
    public void PageActions(){

        WebDriver driver = new FirefoxDriver();
        String url = "https://thetestingacademy.com";
        driver.get(url);

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        new WaitHelpers().waitJVM(5000);

    closing_Browers(driver);
    }
}
