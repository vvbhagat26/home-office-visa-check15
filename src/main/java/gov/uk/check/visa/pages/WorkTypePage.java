package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    //locator
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Work, academic visit or business']")
    WebElement selectJobtypeList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;



    //Methods
    public void selectJobType() {
    clickOnElement(selectJobtypeList);
        log.info("Click on job type : " + selectJobtypeList.toString());
    }

    public void clickNextStepButton() {
    clickOnElement(nextStepButton);
        log.info("Click on continue: " + nextStepButton.toString());
    }

}
