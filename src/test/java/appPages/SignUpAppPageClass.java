package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import platformPages.BasePage;
import utils.PropertiesFile;

public class SignUpAppPageClass extends BasePage {
    public SignUpAppPageClass(WebDriver driver) {
        super(driver);
    }
    By passwordField = By.xpath("//input[@id='password-input']");
    By loginButton = By.xpath("//button[@id='login-button']");

    public void enterPasswordForApp(){
        writeTextTo(passwordField, PropertiesFile.getValue("password"));
    }
    public void login(){clickElement(loginButton);}
}
