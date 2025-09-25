package org.example.Ex08_SVG_Elements;

import org.example.Ex7_WaitHelper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Lab28_SVG_Maps {
    @Test
    public void SVG_Map() {


        WebDriver driver = new FirefoxDriver();
        String url = "https://www.amcharts.com/svg-maps/?map=india";
        driver.get(url);

        driver.manage().window().maximize();

        List<WebElement> states = driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));

        for (WebElement state : states) {
            System.out.println(state.getDomAttribute("aria-label"));
            if (state.getDomAttribute("aria-label").contains("Assam")) {
                state.click();
            }
        }
            WaitHelpers waitHelpers = new WaitHelpers();
            waitHelpers.waitJVM(5000);
driver.close();


    }
}
