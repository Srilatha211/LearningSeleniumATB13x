package org.example.Ex08_SVG_Elements;

import org.example.Ex7_WaitHelper.WaitHelpers;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Lab27_SVG {

    @Test
    public void test_Flipkart_Search_ICON() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        String URL = "https://www.flipkart.com/search";
        driver.get(URL);

        WebElement Search = driver.findElement(By.name("q"));
        Search.sendKeys("macmini");

        //Here we have list of elements when we search

        List<WebElement> svgElements = driver.findElements(By.xpath("//*[name()='svg']"));
        svgElements.get(0).click();


        //To load all the list of items need to add waits
        // we add "Explicit wiat"

        WaitHelpers waitHelpers = new WaitHelpers();
        waitHelpers.waitForVisibility(driver,5,"//div[contains(@data-id,'CPU')]/div/a[2]");

        List<WebElement> titlesResults = driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@data-id,'MP')]/div/a[2]"));

        for (WebElement title : titlesResults) {
            System.out.println(title.getText());
        }


    }
}