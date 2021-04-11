package platformPages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPlatformPageClass extends BasePage {

    public RegisterationPlatformPageClass(WebDriver driver) {
        super(driver);
    }

    private By LoginButton = By.xpath("//a[contains(text(),'Log In')]");

    public void clickLogin(){
        clickElement(LoginButton);
    }
}
