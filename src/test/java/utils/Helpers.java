package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import platformPages.BasePage;
import platformPages.GooglePageClass;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;


public class Helpers  {

    public static void openPageByLink(WebDriver driver,String linkOfPage){
        ((JavascriptExecutor) driver).executeScript("window.open(\""+linkOfPage+"\")");
        ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.manage().window().fullscreen();

    }

    public static void fileUpload(WebDriver driver,By element ,String filePath){
          driver.findElement(element).sendKeys(filePath);
//        JavascriptExecutor jsx = (JavascriptExecutor) driver;
//        //jsx.executeScript("document.getElementById('fsp-fileUpload').value='" + filePath + "';");
//        jsx.executeScript("document.getElementById('fsp-fileUpload').style.display = 'block';");
//        driver.findElement(element).sendKeys(filePath);
//        jsx.executeScript("document.getElementById('fsp-fileUpload').style.display = 'none';");
//        System.out.println(driver.getWindowHandles());
//        driver.findElement(element).click();
//        driver.switchTo()
//                .activeElement()
//                .sendKeys(filePath);
    }

//
//    By text_box = By.name("q");
//    public void openCopiedLinkInNewWinow(WebDriver driver){
//        ((JavascriptExecutor) driver).executeScript("window.open('');");
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//
//
//        Actions actions = new Actions(driver);
//
//        driver.get("https://www.google.com");
//
//        actions.keyDown(Keys.CONTROL);
//        actions.sendKeys("v");
//        actions.sendKeys(Keys.ENTER);
//        actions.build().perform();
//
//
//
//        //actions.sendKeys(Keys.chord(Keys.CONTROL, Keys.chord("v"))).sendKeys(Keys.ENTER).build().perform();
//       // actions.sendKeys(Keys.chord(Keys.LEFT_CONTROL, "v")).build().perform();
//
//     }

}
