package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import platformPages.BasePage;
import utils.PropertiesFile;

public class WellcomeAppPageClass extends BasePage {
    public WellcomeAppPageClass(WebDriver driver) {
        super(driver);
    }
    By emailField = By.xpath("//input[@id='email']");
    By continueButton = By.xpath("//button[@id='continue-button']");

    public void enterEmailForApp(){
        writeTextTo(emailField, PropertiesFile.getValue("email"));
    }
    public void Continue(){
        clickElement(continueButton);
    }
}
