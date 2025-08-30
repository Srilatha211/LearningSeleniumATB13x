package org.example.Ex2_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium07_SeleniumCommands {

public static void main(String args[]){

    WebDriver driver = new FirefoxDriver();
    driver.get("https://www.google.com");

    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
    System.out.println(driver.getPageSource());

    //When we are done with the Browser
    //and want to close all the tabs and the browser
    driver.quit();


    }

}
