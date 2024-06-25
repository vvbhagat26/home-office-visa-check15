package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    //Locators
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Tourism or visiting family and friends']")
    WebElement reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']" )
    WebElement nextStepButton;

    //Methods
    public void selectReasonForVisit(){
        clickOnElement(reasonForVisitList);
        log.info("Clicking on reason : " + reasonForVisitList.toString());
    }
    public void clickNextStepButton(){
        clickOnElement(nextStepButton);
        log.info("Clicking on continue: " + nextStepButton.toString());
    }









}
