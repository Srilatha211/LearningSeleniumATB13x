package org.example.Ex3_Selenium_LOcators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium16_LinkText_Partial_Text_TagName_Locators {

@Description("verify VWOLogin")
    @Test
    public void verify_LinkText(){

    WebDriver driver =  new FirefoxDriver();
    driver.get("https://app.vwo.com");
    // <a
    // href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
    // class="text-link"
    // data-qa="bericafeqo">
    // Start a free trial
    //
    //</a>

    // className yES -> But here every time need to check if they are understandable
    //  and you can say, most unique.

    //      // Link Text - Full Text Match
            WebElement full_match = driver.findElement(By.linkText("Start a free trial"));
    full_match.click();

    ////        // If the element locator is invalid - no such element: Unable to locate element: {"method":"link text","selector":"Start a free tria"}

    // Start a free trial
    // Start a free
    // Start a
    // Start , Trail, free, a, Star...


//    WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
//    a_tag_partial_match.click();



    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    driver.quit();




}


}
