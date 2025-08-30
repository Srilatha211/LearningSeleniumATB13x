package org.example.Ex2_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testselenium13_Close_quit {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");


        //Here if we add close then will be closed in few sec
        //So, to wait for some times need to add wait time using threads

        try {
            Thread.sleep(5000);//Here we know the time so, its a checked excepetion
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();
        // Close - will close the current tab, not the session (not the all tabs)
//        // session id != null



//        driver.quit();
        // It will close all the tabs. - session id == null


    }
}
