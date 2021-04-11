package platformPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPlatformPageClass extends BasePage{
    public LoginPlatformPageClass(WebDriver driver) {
        super(driver);
    }
    By email = By.xpath("//input[@id='email']");
    By password = By.xpath("//input[@id='password']");
    By login = By.xpath("//button[contains(text(),'Login')]");

    public void enterEmail(){
        waitUntilElmentVisible(email);
        writeTextTo(email,"testautomation@socio.events");
    }

    public void enterPassword(){
        waitUntilElmentVisible(password);
        writeTextTo(password,"ta12345");
    }

    public void login(){
        waitUntilElmentClickable(login);
        clickElement(login);
    }
}
