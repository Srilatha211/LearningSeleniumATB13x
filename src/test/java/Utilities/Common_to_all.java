package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common_to_all {


    public WebDriver driver;
    public void Open_Browers(WebDriver driver, String url){

        driver.get(url);
        driver.manage().window().maximize();


    }

    public void closing_Browers(WebDriver driver) {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }

        public WebElement findElementByPartialText(WebDriver driver,String text){
            return driver.findElement(By.partialLinkText(text));
        }




}
