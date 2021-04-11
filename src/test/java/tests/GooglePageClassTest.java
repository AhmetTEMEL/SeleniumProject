package tests;

import com.aventstack.extentreports.ExtentTest;
import platformPages.GooglePageClass;

public class GooglePageClassTest extends BaseTest{


    public void Test1(){

        ExtentTest test = extent.createTest("Google Page test");
        driver.get("https://www.google.com");
        test.pass("Main page test");

        GooglePageClass googlePageClass = new GooglePageClass(driver);
        googlePageClass.setTextToTextBox("aturomation second try");
        test.pass("text inserted");
        googlePageClass.clickButton();
        test.pass("Button clicked");
    }
}
