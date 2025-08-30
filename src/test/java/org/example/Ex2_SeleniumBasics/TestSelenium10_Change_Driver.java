package org.example.Ex2_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium10_Change_Driver {
    public static void main(String[] args) {

        WebDriver driver= new FirefoxDriver();
        driver = new EdgeDriver();


        //here we change the browsers when we use WebDriver
        //If we use fireFox,chrome then its not possible to chnage the browsers

//FirefoxDriver driver1 = new FirefoxDriver();

//driver1= new EdgeDriver();


//driver.quit();
    }
}
