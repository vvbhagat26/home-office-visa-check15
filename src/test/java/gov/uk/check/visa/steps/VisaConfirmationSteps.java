package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @And("I select a Nationality Australia")
    public void iSelectANationalityAustralia() {
        new SelectNationalityPage().selectNationality();
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select reason Tourism")
    public void iSelectReasonTourism() {
        new ReasonForTravelPage().selectReasonForVisit();
    }

    @Then("I should verify result You will not need a visa to come to the UK")
    public void iShouldVerifyResultYouWillNotNeedAVisaToComeToTheUK() {
        Assert.assertEquals(new ResultPage().getResultMessage(),"You will not need a visa to come to the UK","Text not displayed");
    }



    @And("Click on Continue button")
    public void clickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }



    @And("Select a Nationality Chile")
    public void selectANationalityChile() {
        new SelectNationalityPage().selectNationalityChile();
    }

    @And("Select reason Work, academic visit or business")
    public void selectReasonWorkAcademicVisitOrBusiness() {
        new WorkTypePage().selectJobType();
    }


    @And("Select have planning to work for Health and care professional")
    public void selectHavePlanningToWorkForHealthAndCareProfessional() {
        new DurationOfStayPage().selectHealthAndCare();
    }

    @Then("I should verify result 'You need a visa to work in health and care")
    public void iShouldVerifyResultYouNeedAVisaToWorkInHealthAndCare() {
        Assert.assertEquals(new ResultPage().resultWorkMessage(),"You need a visa to work in health and care","Text not displayed");
    }

    @And("Select intendent to stay for longer than six months")
    public void selectIntendentToStayForLongerThanSixMonths() {
        new DurationOfStayPage().selectLengthOfStay();
    }

    @And("Select a Nationality Columbia")
    public void selectANationalityColumbia() {
        new SelectNationalityPage().selectNationalityColumbia();
    }

    @And("I Select reason Join partner or family for a long stay")
    public void iSelectReasonJoinPartnerOrFamilyForALongStay() {
        new FamilyImmigrationStatusPage().clickJoinPartner();
    }


    @And("I Select state My partner of family member have uk immigration status yes")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
    }

    @And("I verify result You’ll need a visa to join your family or partner in the UK")
    public void iVerifyResultYouLlNeedAVisaToJoinYourFamilyOrPartnerInTheUK() {
        Assert.assertEquals(new ResultPage().verifyresultMessage(),"You may need a visa","Text not displayed");
    }
}
