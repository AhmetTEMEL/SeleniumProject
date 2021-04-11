package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import platformPages.BasePage;

import static utils.Helpers.fileUpload;

public class HomeAppPageClass extends BasePage {
    public HomeAppPageClass(WebDriver driver) {
        super(driver);
    }
    By wallMenuTab = By.xpath("//span[contains(text(),'Wall')]");
    By whatsOnYourMind = By.xpath("//div[contains(text(),'What’s on your mind, Test?')]");
    By whatsOnYourMindModal = By.xpath("//body/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/textarea[3]");
    By addImageButton = By.xpath("//div[contains(text(),'Add Image')]");
    By fileUpload = By.xpath("//input[@id='fsp-fileUpload']");

    public void clickWall(){
        clickElement(wallMenuTab);
    }

    public void clickWhatsOnYourMind(){
        clickElement(whatsOnYourMind);
    }

    public void writeSomethingToModal(){
        writeTextTo(whatsOnYourMindModal,"Something");
    }

    public void uploadImage(){
        clickElement(addImageButton);
        fileUpload(driver,fileUpload,"src\\main\\resources\\sampleImage.jpg");
    }
    public void navigateBack(){
        driver.navigate().back();
    }

}
