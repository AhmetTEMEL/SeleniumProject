package platformPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Helpers;


public class ManageEventPlatformPageClass extends BasePage{
    public ManageEventPlatformPageClass(WebDriver driver) {
        super(driver);
    }

    By webAppLink = By.xpath("//body/div[@id='container']/div[1]/span[1]/div[1]/div[1]/aside[1]/ul[1]/li[6]/a[1]/span[1]");
    By webAppToggleYes = By.cssSelector(".sc-krvtoX.gzqJXA .bootstrap-switch-label");
    By saveButton = By.xpath("//button[contains(text(),'Save')]");
    By getSharableLinkButton = By.xpath("//button[contains(text(),'Get Shareable Link')]");
    By copyLinkButton = By.xpath("//button[contains(text(),'Copy Link')]");
    By closeCopyLinkPopupButton = By.xpath("//span[contains(text(),'×')]");
    By urlOfCoppiedPage = By.cssSelector(".input-group .form-control");
    By loginRadioButton = By.cssSelector(".radio-custom.radio-info.radio-inline .checker");
    String linkOfPage;

    public void clickWebAppTab(){
        clickElement(webAppLink);
    }

    public void checkIfEnableWebAppToggleYes(){
        if(isloadComplete(driver)){
            if(!isSelected(webAppToggleYes)){
                clickElement(webAppToggleYes);
            }
        }
    }

    public void clickSaveButton(){
        waitUntilElmentVisible(saveButton);
        clickElement(saveButton);
    }

    public void clickLoginRadioButton(){
        waitUntilElmentVisible(loginRadioButton);
        //clickElement(loginRadioButton);
        clickByJavascript(loginRadioButton);
    }

    public void clickgetSharableLinkButton(){
        clickElement(getSharableLinkButton);
    }

    public void clickCopyLinkButton(){
        clickElement(copyLinkButton);
        linkOfPage = getAttributeOfElement(urlOfCoppiedPage,"value");
    }

    public void closeCopyLinkModal(){
        clickElement(closeCopyLinkPopupButton);
    }

    public void openCopiedWindowLink(){
        //Helpers.openPageByLink(driver,linkOfPage);
        driver.get(linkOfPage);
    }

}
