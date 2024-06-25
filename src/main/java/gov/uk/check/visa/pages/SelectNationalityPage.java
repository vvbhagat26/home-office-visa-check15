package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    //Locators
    @CacheLookup
     @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityChileDropDownList;




    //Methods
    public void selectNationality(){
    selectByVisibleTextFromDropDown(nationalityDropDownList,"Australia");
        log.info("Click on natoinality : " + nationalityDropDownList.toString());
    }

    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        log.info("Clicking on continue : " + nextStepButton.toString());
    }
    public void selectNationalityChile(){
        selectByVisibleTextFromDropDown(nationalityChileDropDownList,"Chile");
        log.info("Click on natoinality : " + nationalityChileDropDownList.toString());
    }
    public void selectNationalityColumbia(){
        selectByVisibleTextFromDropDown(nationalityDropDownList,"Colombia");
        log.info("Click on natoinality : " + nationalityDropDownList.toString());
    }


}
