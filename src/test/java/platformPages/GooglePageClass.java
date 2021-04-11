package platformPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePageClass {
    WebDriver driver = null;

    By text_box = By.name("q");
    By searchButoon = By.name("btnK");

   public GooglePageClass(WebDriver driver){
        this.driver=driver;
    }

    public void setTextToTextBox(String text){
        driver.findElement(text_box).sendKeys(text);
    }

    public void clickButton(){
        //driver.findElements(searchButoon).get(1).sendKeys(Keys.RETURN);
        Keys.chord(Keys.RETURN);
    }


//   private static WebElement element = null;
//    private static List<WebElement> elements = null;
//
//    public static WebElement searchBox(WebDriver driver){
//      element =  driver.findElement(By.name("q"));
//      return element;
//    }
//    public static List<WebElement> searchButton(WebDriver driver){
//        elements =  driver.findElements(By.name("btnK"));
//        return elements;
//    }

}
