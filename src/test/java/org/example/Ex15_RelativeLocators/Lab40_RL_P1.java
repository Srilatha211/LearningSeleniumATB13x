package org.example.Ex15_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab40_RL_P1 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement span = driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));

        driver.findElement(with(By.id("exp-0")).toRightOf(span)).click();

//driver.findElement(with(By.xpath("//input[@id=\"exp-0\"]")).toRightOf(span)).click();




    }

}
