package org.example.Ex13_ShadowDOM;

import Utilities.Common_to_all;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.example.Ex7_WaitHelper.WaitHelpers.waitJVM;

public class Lab38_JS_Code_ShadowDOM  extends Common_to_all {

    //Java Script executor is mostly used in Shadow DOM
    @Test
    public void test_js() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();

        waitJVM(3000);

//        driver.findElement(By.id("pizza")).sendKeys("farmhouse");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement inputboxPizza = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector('div#app2').shadowRoot.querySelector('#pizza');");
        inputboxPizza.sendKeys("farmhouse");

       closing_Browers(driver);





    }
}
