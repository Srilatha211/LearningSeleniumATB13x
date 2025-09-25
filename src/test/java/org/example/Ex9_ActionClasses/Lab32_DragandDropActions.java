package org.example.Ex9_ActionClasses;

import org.example.Ex7_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab32_DragandDropActions {

    @Test
    public void DragandDrop(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        // Source , Destination
        //  from and to
        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(from,to).build().perform();

//        new WaitHelpers().waitJVM(3000);
//
//            actions.dragAndDrop(to,from).build().perform();
        new WaitHelpers().waitJVM(3000);

       driver.close();

    }
}
