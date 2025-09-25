package org.example.Ex05_Selenium_Waits;

import Utilities.Common_to_all;
import io.qameta.allure.Description;
import org.example.Ex7_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium22_MiniProject4 extends Common_to_all {

    @Description("Verify  makemytrip opens with modal")
    @Test
    public void testCloseModal() {

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        System.out.println(driver.getTitle());

        new WaitHelpers().waitForVisibility(driver,5,"//span[@data-cy=\"closeModal\"]");

        WebElement closeModel = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closeModel.click();


        closing_Browers(driver);




    }
}