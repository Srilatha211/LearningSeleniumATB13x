package org.example.Ex10_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab33_FileUpload {

    public static void main(String[] args) {



    //File has only method
    //we can make it only if it has type =file


    WebDriver driver = new FirefoxDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");

    WebElement uploadFileInput = driver.findElement(By.id("fileToUpload"));//find the ID
    String user_dir = System.getProperty("user.dir");//Get the user directory
       // C:\Users\ashok\IdeaProjects\LearningSeleniumATB13X
     String path = user_dir + "\\src\\test\\java\\org\\example\\Ex10_FileUpload\\testdata.txt";
//find the total path "user_dir + "\\src\\..."
uploadFileInput.sendKeys(path);//use sendkeys to upload
        driver.findElement(By.name("submit")).click();





}
}




