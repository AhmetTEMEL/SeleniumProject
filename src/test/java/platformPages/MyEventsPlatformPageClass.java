package platformPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyEventsPlatformPageClass extends BasePage{
    public MyEventsPlatformPageClass(WebDriver driver) {
        super(driver);
    }
    By testAutomationAssesmentEvent = By.xpath("//h3[contains(text(),'Test Automation Assessment Event 2')]");

    public void clickTestAuthAssesmentEvent(){
        clickElement(testAutomationAssesmentEvent);
    }
}
