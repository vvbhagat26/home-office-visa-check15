package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    //Locator
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultWorkMessage;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement verifyresultMessage;



    //Method
    public String getResultMessage() {
        log.info("Clicking on get result: " + resultMessage.toString());
        return getTextFromElement(resultMessage);
    }
    public String resultWorkMessage() {
        log.info("get text from : " + resultWorkMessage.toString());
        return getTextFromElement(resultWorkMessage);
    }
    public String verifyresultMessage(){
        log.info("verify  : " + verifyresultMessage.toString());
        return getTextFromElement(verifyresultMessage);
        }
    }

