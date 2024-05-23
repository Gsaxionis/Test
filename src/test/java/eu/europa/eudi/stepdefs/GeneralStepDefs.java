package eu.europa.eudi.stepdefs;

import eu.europa.eudi.data.Literals;
import eu.europa.eudi.utils.Test;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class GeneralStepDefs {
    Test test;
    @Before
    public void setup(Scenario scenario) {
        boolean noReset = scenario.getSourceTagNames().contains("@NoReset");
        boolean android = scenario.getSourceTagNames().contains("@ANDROID");
        boolean ios = scenario.getSourceTagNames().contains("@IOS");
        if (android){
            test = new Test(noReset, Literals.General.ANDROID.label, scenario);
            test.startAndroidDriverSession();
        }
        if (ios){
            test = new Test(noReset, Literals.General.IOS.label, scenario);
            test.startIosDriverSession();
        }
    }
    @After
    public void tearDown(Scenario scenario) {
        boolean android = scenario.getSourceTagNames().contains("@ANDROID");
        boolean ios = scenario.getSourceTagNames().contains("@IOS");
        if (android){
            test.stopAndroidDriverSession();
        }
        if (ios){
            test.stopIosDriverSession();
        }
    }
    @Given("user sets up wallet")
    public void userSetsUpWallet() {
        test.mobile().wallet().checkIfPageIsTrue();
        test.mobile().wallet().createAPin();
        test.mobile().wallet().clickNextButton();
        test.mobile().wallet().renterThePin();
        test.mobile().wallet().clickConfirm();
        test.mobile().wallet().successMessageOfSetUpPin();
        test.mobile().wallet().clickContinue();
        test.mobile().wallet().loadSampleDocuments();
        test.mobile().wallet().userProfilIsDisplayed();
    }

    @Given("user opens Verifier App")
    public void userOpensVerifierApp() {
        test.mobile().wallet().userOpensVerifier();
    }

    @And("user selects specific data to share")
    public void userSelectSpecificDataToShare() {
        test.mobile().verifier().appOpensSuccefully();
        test.mobile().verifier().selectShareAttributes();
        test.mobile().verifier().clickNext();
        test.mobile().verifier().chooseData();
        test.mobile().verifier().clickNext();
    }

    @And("user selects to be identified using EUDI Wallet")
    public void userSelectsToBeIdentifiedUsingEUDIWallet() {
        test.mobile().verifier().AuthenticationPageIsDisplayed();
        test.mobile().verifier().chooseWallet();
    }

    @And("user views the data and can unselect any of them")
    public void userViewsTheDataAndCanUnselectAnyOfThem() {
        test.mobile().verifier().viewDataPage();
    }

    @And("user presses the share button")
    public void userPressesTheShareButton() {
        test.mobile().wallet().clickShareButton();
    }

    @And("user authorizes the discolsure of the data")
    public void userAuthorizesTheDiscolsureOfTheData() {
        test.mobile().verifier().authorizeData();
    }

    @And("user is authenticated successfully")
    public void userIsAuthenticatedSuccessfully() {
        test.mobile().wallet().authenticationSuccessfully();
    }

    @Given("welcome to EUDI page is displayed")
    public void welcomeToEUDIPageIsDisplayed() {
        test.mobile().wallet().welcomePage();
    }
    @And("user sets up a quick pin")
    public void userSetsUpAQuickPin() {
        test.mobile().wallet().createAPin();
    }

    @And("user clicks next button")
    public void userClicksNextButton() {
        test.mobile().wallet().clickNextButton();
    }

    @And("user re-enters pin")
    public void userReEntersPin() {
        test.mobile().wallet().renterThePin();
    }

    @And("user clicks confirm button")
    public void userClicksConfirmButton() {
        test.mobile().wallet().clickConfirm();
    }

    @Then("a successfull message is appeared")
    public void aSuccsfullMessageIsAppeared() {
        test.mobile().wallet().successMessageOfSetUpPin();
    }

    @And("user clicks national id")
    public void userClicksNationalId() {
        test.mobile().wallet().clickNationalId();
    }

    @Then("national id is displayed")
    public void nationalIdIsDisplayed() {
        test.mobile().wallet().nationalIdIsDisplayed();
    }

    @And("user clicks mdl")
    public void userClicksMdl() {
        test.mobile().wallet().clickMdl();
    }

    @Then("mdl is displayed")
    public void mdlIsDisplayed() {
        test.mobile().wallet().mdlIsDisplayed();
    }

    @And("user clicks delete button")
    public void userClicksDeleteButton() {
        test.mobile().wallet().clickDeleteButton();
    }

    @And("user confirms deletion")
    public void userConfirmsDeletion() {
        test.mobile().wallet().confirmsDeletion();
    }

    @Then("the login page is displayed")
    public void theLoginPageIsDisplayed() {
        test.mobile().wallet().loginPageIsDisplayed();
    }

    @Then("the dashboard page is displayed")
    public void theDashboardPageIsDisplayed() {
        test.mobile().wallet().dashboardPageIsDisplayed();
    }

    @And("user clicks load sample data")
    public void userClicksLoadSampleData() {
        test.mobile().wallet().loadSampleDocuments();
    }

    @And("user clicks continue button")
    public void userClicksContinueButton() {
        test.mobile().wallet().clickContinue();
    }

    @And("user views the data and unselect any of them")
    public void userViewsTheDataAndUnselectAnyOfThem() {
        test.mobile().wallet().unselectData();
    }

    @And("a corresponding message is displayed")
    public void aCorrespondingMessageIsDisplayed() {
        test.mobile().wallet().correspondingMessageIsDisplayed();
    }

    @And("user clicks again the data")
    public void userClicksAgainTheData() {
        test.mobile().wallet().clickAgainData();
    }

    @And("user clicks add doc button")
    public void userClicksAddDocButton() {
        test.mobile().wallet().addDocButton();
    }

    @And("add document page is displayed")
    public void addDocumentPageIsDisplayed() {
        test.mobile().wallet().addDocumentPageIsDisplayed();
    }

    @And("user clicks national id button")
    public void userClicksNationalIdButton() {
        test.mobile().wallet().clickNationalIdButton();
    }

    @And("authentication method selection is displayed")
    public void authenticationMethodSelectionIsDisplayed() {
        test.mobile().wallet().authenticationMethodSelection();
    }

    @And("user clicks country selection")
    public void userClicksCountrySelection() {
        test.mobile().wallet().clickCountrySelection();
        test.mobile().wallet().clickSubmit();
    }

    @And("user clicks FormEU")
    public void userClicksFormEU() {
        test.mobile().wallet().clickFormEu();
        test.mobile().wallet().clickSubmit();
    }

    @And("data page is displayed")
    public void dataPageIsDisplayed() {
        test.mobile().wallet().dataPageIsDisplayed();
    }

    @And("user enters data")
    public void userEntersData() {
        test.mobile().wallet().enterGivenName();
        test.mobile().wallet().enterFamilyName();
        test.mobile().wallet().chooseBirthDate();
        test.mobile().wallet().clickSubmit();
    }

    @And("a success message is displayed")
    public void aSuccessMessageIsDisplayed() {
        test.mobile().wallet().successMessageIsDisplayed();
        test.mobile().wallet().clickNextButton();
    }

    @And("user clicks driving licence button")
    public void userClicksDrivingLicenceButton() {
        test.mobile().wallet().clickDrivingLicenceButton();
    }

    @And("user enters data for drivring licence")
    public void userEntersDataForDrivringLicence() {
        test.mobile().wallet().enterGivenName();
        test.mobile().wallet().enterFamilyName();
        test.mobile().wallet().chooseBirthDate();
        test.mobile().wallet().enterDocumentNumber();
        test.mobile().wallet().clickScreen();
        test.mobile().wallet().scrollUntilFindDate();
        test.mobile().wallet().chooseIssueDate();
        test.mobile().wallet().chooseExpiryDate();
        test.mobile().wallet().clickSubmit();
    }

    @Then("driving licence is displayed")
    public void drivingLicenceIsDisplayed() {
        test.mobile().wallet().drivingLicenceIsDisplayed();
        test.mobile().wallet().clickXButton();
    }

    @And("a success message for driving licence is displayed")
    public void aSuccessMessageForDrivingLicenceIsDisplayed() {
        test.mobile().wallet().successMessageForDrivingIsDisplayed();
        test.mobile().wallet().clickNextButton();
    }

    @Then("driving licence is displayed in the EUDI Wallet dashboard")
    public void drivingLicenceIsDisplayedInTheEUDIWalletDashboard() {
        test.mobile().wallet().drivingLicenceIsDisplayedInDashboard();

    }

    @And("user enters data for drivring licence for ios")
    public void userEntersDataForDrivringLicenceForIos() {
        test.mobile().wallet().chooseIssueDate();
        test.mobile().wallet().chooseExpiryDate();
        test.mobile().wallet().enterGivenName();
        test.mobile().wallet().enterFamilyName();
        test.mobile().wallet().chooseBirthDate();
        test.mobile().wallet().enterDocumentNumber();
        test.mobile().wallet().clickScreen();
        test.mobile().wallet().clickSubmit();
    }
}

