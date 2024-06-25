package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    //locators
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'longer than 6 months')]")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement healthAndCare;


    //Methods
    public void selectLengthOfStay(){
        log.info("Clicking on stay: " + moreThanSixMonths.toString());
   clickOnElement(moreThanSixMonths);
    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        log.info("Clicking on continue: " + nextStepButton.toString());
    }
    public void selectHealthAndCare(){
        clickOnElement(healthAndCare);
        log.info("Clicking on health care : " + healthAndCare.toString());
    }

}
