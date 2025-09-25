package org.example.Ex9_ActionClasses;

import Utilities.Common_to_all;
import org.example.Ex7_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Lab30_MakeMyTrip_AutoSuggestion_Action extends Common_to_all {


    @Test
    public void Autosuggestion() {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();
//without waiting
//        WebElement close = driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]"));
//close.click();

//with waiting time for the modal to come up by using Helper method

        // We need to for the modal and close it
//        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));

        //Or we can use this wait also

        new WaitHelpers().waitForVisibility(driver, 5, "//span[@data-cy='closeModal']");
        // This will close the modal
        WebElement model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        // close
        model.click();

        WebElement From_city = driver.findElement(By.xpath("//input[@id=\"fromCity\"]"));
        WebElement To_city = driver.findElement(By.xpath("//input[@id=\"toCity\"]"));

        new WaitHelpers().waitJVM(5000);

//        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
//        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));


        Actions actions = new Actions(driver);

        actions.moveToElement(From_city).click().sendKeys("IXC").build().perform();

        new WaitHelpers().waitJVM(5000);

        List <WebElement> autosuggestion = driver.findElements(By.cssSelector("ul[class=\"react-autosuggest__suggestions-list\"]>li"));

        try {
            for (WebElement e : autosuggestion) {
                if (e.getText().contains("Chandigarh")) {
                    e.click();
                }

            }
        } catch (Exception e) {

        }

    }


    }
