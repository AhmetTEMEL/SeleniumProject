package tests;

import appPages.HomeAppPageClass;
import appPages.SignUpAppPageClass;
import appPages.WellcomeAppPageClass;
import org.testng.annotations.Test;
import platformPages.*;
import utils.Helpers;

public class SocioTest extends BaseTest{

    RegisterationPlatformPageClass registerationPlatformPageClass;
    LoginPlatformPageClass loginPlatformPageClass;
    MyEventsPlatformPageClass myEventsPlatformPageClass;
    ManageEventPlatformPageClass manageEventPlatformPageClass;
    SignUpAppPageClass signUpAppPageClass;
    WellcomeAppPageClass wellcomeAppPageClass;
    HomeAppPageClass homeAppPageClass;

    @Test
    public void testCases()  {
        registerationPlatformPageClass = new RegisterationPlatformPageClass(driver);
        loginPlatformPageClass = new LoginPlatformPageClass(driver);
        myEventsPlatformPageClass = new MyEventsPlatformPageClass(driver);
        manageEventPlatformPageClass = new ManageEventPlatformPageClass(driver);
        signUpAppPageClass = new SignUpAppPageClass(driver);
        wellcomeAppPageClass = new WellcomeAppPageClass(driver);
        homeAppPageClass = new HomeAppPageClass(driver);


        registerationPlatformPageClass.clickLogin();

        loginPlatformPageClass.enterEmail();
        loginPlatformPageClass.enterPassword();
        loginPlatformPageClass.login();

        myEventsPlatformPageClass.clickTestAuthAssesmentEvent();

        manageEventPlatformPageClass.clickWebAppTab();
        //manageEventPlatformPageClass.checkIfEnableWebAppToggleYes();
        manageEventPlatformPageClass.clickSaveButton();
        manageEventPlatformPageClass.clickgetSharableLinkButton();
        manageEventPlatformPageClass.clickCopyLinkButton();
        manageEventPlatformPageClass.closeCopyLinkModal();
        manageEventPlatformPageClass.openCopiedWindowLink();

        wellcomeAppPageClass.enterEmailForApp();
        wellcomeAppPageClass.Continue();

        signUpAppPageClass.enterPasswordForApp();
        signUpAppPageClass.login();

        homeAppPageClass.clickWall();
        homeAppPageClass.clickWhatsOnYourMind();
        //homeAppPageClass.writeSomethingToModal();
        //homeAppPageClass.uploadImage();
        homeAppPageClass.navigateBack();
    }
}
