package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    //locator
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement joinPartner;

    //method
    public void clickJoinPartner(){
        clickOnElement(joinPartner);
        log.info("Clicking on joinPartner : " + joinPartner.toString());
    }
}
