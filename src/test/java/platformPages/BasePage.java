package platformPages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,20);
    }

    protected void waitUntilElmentClickable (By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected void waitUntilElmentVisible (By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void beforePageLoad() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.mpPageReloaded='notYet';");
    }
    protected static boolean isloadComplete(WebDriver driver)
    {
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("loaded")
                || ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

    protected void clickElement(By element){
        try {
            waitUntilElmentClickable(element);
            driver.findElement(element).click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            waitUntilElmentClickable(element);
            driver.findElement(element).click();
        }
    }

    protected void writeTextTo(By element, String text){
        try {
            waitUntilElmentVisible(element);
            driver.findElement(element).sendKeys(text);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    protected Boolean isSelected(By element){
        return driver.findElement(element).isSelected();
    }

    protected String getAttributeOfElement(By element,String attribute){
       return driver.findElement(element).getAttribute(attribute);
    }

    protected void clickByJavascript(By element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",element);
    }

}
