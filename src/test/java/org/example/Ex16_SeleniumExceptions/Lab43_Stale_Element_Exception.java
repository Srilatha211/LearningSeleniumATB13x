package org.example.Ex16_SeleniumExceptions;

import Utilities.Common_to_all;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab43_Stale_Element_Exception extends Common_to_all {


    @Test
    public void test_selenium_exceptions() {


        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        System.out.println("Start of program");

        WebElement search_input_box  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        //e.g : This can be a dynamic path


        //Refresh -- Before typing in refresh then the element is not laocted
        // then Stale Element exception occurs

        //Driver cannot find the elemnt when we refresh,if any change in DOM
     driver.navigate().refresh();
        // org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
        //  (Session info: chrome=140.0.7339.133)
// This is the fix by adding try catch to search_Input
        try {
            search_input_box.sendKeys("the testing academy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException");
        }

        // After teh fix need to find the element Again and search
        WebElement search_input_box1  = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_input_box1.sendKeys("the testing academy"+ Keys.ENTER);

    }

}
