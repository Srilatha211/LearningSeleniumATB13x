package org.example.Ex11_WindowsHandle;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class Lab36_WindowsHandle {



    @Test
    public void test_windows() {

        WebDriver driver = new FirefoxDriver();
        String Url = "https://the-internet.herokuapp.com/windows";
        driver.get(Url);


       String parent_id=  driver.getWindowHandle();
        System.out.println(parent_id);//windows parent id
        System.out.println(driver);//session ID by Slenium
        //tab id id for windows


      WebElement link =  driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
link.click();

//here windowsHandles returns the Set of string

        Set<String> windows_hanles_ids = driver.getWindowHandles();
        //This will return the set of string bcz both the tabs ids are unique
        System.out.println(windows_hanles_ids);


        // How do I switch to the child window and
        // verify that there is a text with the name of new window?

        for(String window:  windows_hanles_ids){
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Cases passed!");
            }

        }
//Again if u want to return to parent window
        driver.switchTo().window(parent_id);
    }
}
