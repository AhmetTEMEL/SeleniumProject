package utils;

import org.openqa.selenium.*;

import java.util.ArrayList;


public class Helpers  {

    public static void openPageByLink(WebDriver driver,String linkOfPage){
        ((JavascriptExecutor) driver).executeScript("window.open(\""+linkOfPage+"\")");
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.manage().window().fullscreen();
    }

    public static void fileUpload(WebDriver driver,By element ,String filePath){
          driver.findElement(element).sendKeys(filePath);
    }
}
