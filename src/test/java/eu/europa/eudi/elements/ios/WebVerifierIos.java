package eu.europa.eudi.elements.ios;

import org.openqa.selenium.By;

public class WebVerifierIos {
    public static final By welcomeScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Welcome on board!\"]");

    public static By welcomePage = By.xpath("//XCUIElementTypeStaticText[@name=\"Welcome to the EUDI Wallet\"]");

    public static By pinTexfield1 = By.xpath("//XCUIElementTypeApplication[@name=\"EUDI Wallet Dev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[1]");
    public static By pinTexfield2 = By.xpath("//XCUIElementTypeApplication[@name=\"EUDI Wallet Dev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[2]");
    public static By pinTexfield3 = By.xpath("//XCUIElementTypeApplication[@name=\"EUDI Wallet Dev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[3]");
    public static By pinTexfield4 = By.xpath("//XCUIElementTypeApplication[@name=\"EUDI Wallet Dev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[4]");
    public static By pinTexfield5 = By.xpath("//XCUIElementTypeApplication[@name=\"EUDI Wallet Dev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[5]");
    public static By pinTexfield6 = By.xpath("//XCUIElementTypeApplication[@name=\"EUDI Wallet Dev\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeImage[5]");
    public static By nextButton = By.xpath("//XCUIElementTypeButton[@name=\"NEXT\"]");
    public static By clickConfirm = By.xpath("//XCUIElementTypeButton[@name=\"CONFIRM\"]");
    public static By successMessage = By.xpath("//XCUIElementTypeStaticText[@name=\"You successfully set the quick pin\"]");
    public static By clickContinue = By.xpath("//XCUIElementTypeButton[@name=\"CONTINUE\"]");
    public static By chooseSampleData = By.xpath("//XCUIElementTypeStaticText[@name=\"Load Sample Data\"]");
    public static By dashboardPageIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"Welcome back\"]");
    public static By appOpensSuccessfully = By.xpath("//XCUIElementTypeStaticText[@name=\"Authenticate by sharing your PID\"]");
    public static By clickShareData = By.xpath("//XCUIElementTypeStaticText[@label=\"Request to share specific attributes from PID\"]");
    public static By clickNext = By.xpath("//XCUIElementTypeButton[@name=\"NEXT\"]");
    public static By chooseData = By.xpath("//XCUIElementTypeSwitch[@name=\"Family Name\"]");
    public static By authenticationPageIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"Proceed to authentication\"]");
    public static By chooseWallet = By.xpath("//XCUIElementTypeStaticText[@name=\"AUTHENTICATE WITH WALLET\"]");
    public static By clickOpenWallet = By.xpath("//XCUIElementTypeStaticText[@name=\"Open\"]");
    public static By viewDataPage = By.xpath("//XCUIElementTypeStaticText[@name=\"Please review carefully before sharing your data. Why we need your data?\"]");
    public static By clickShare = By.xpath("//XCUIElementTypeButton[@name=\"SHARE\"]");
    public static By authenticationSuccess = By.xpath("//XCUIElementTypeStaticText[@name=\"You successfully shared information with the Verifier\"]");
    public static By clickNationalId = By.xpath("//XCUIElementTypeStaticText[@name=\"National ID\"]");
    public static By nationalIdIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"National ID\"]");
    public static By clickMdl = By.xpath("//XCUIElementTypeStaticText[@name=\"Driving License\"]");
    public static By mdlIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"Driving License\"]");
    public static By addDoc = By.xpath("//XCUIElementTypeStaticText[@name=\"ADD DOC\"]");
    public static By addDocumentPageIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"Add document\"]");
    public static By clickNationalIdButton = By.xpath("//XCUIElementTypeStaticText[@name=\"National ID\"]");
    public static By authenticationMethodSelection = By.xpath("//XCUIElementTypeStaticText[@name=\"Authentication Method Selection\"]");
    public static By countrySelection = By.xpath("//XCUIElementTypeStaticText[@name=\"Country Selection\"]");
    public static By clickSubmit = By.xpath("//XCUIElementTypeButton[@name=\"Submit\"]");
    public static By clickFormEu = By.xpath("//XCUIElementTypeStaticText[@name=\"FormEU\"]");
    public static By dataPageIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"Enter the data for your EUDI Wallet\"]");
    public static By clickGivenName = By.xpath("//XCUIElementTypeTextField[@name=\"given_name\"]");
    public static By givenNameField = By.xpath("//XCUIElementTypeTextField[@name=\"given_name\"]");
    public static By clickFamilyName = By.xpath("//XCUIElementTypeTextField[@name=\"family_name\"]");
    public static By givenFamilyField = By.xpath("//XCUIElementTypeTextField[@name=\"family_name\"]");
    public static By clickBirthDate = By.xpath("//XCUIElementTypeOther[@name=\"birth_date\"]");
    public static By chooseSet = By.xpath("//XCUIElementTypeButton[@name=\"Done\"]");
    public static By successMessageIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"You can now add your National ID\"]");
    public static By clickDeleteButton = By.xpath("//XCUIElementTypeButton[@name=\"Bin\"]");
    public static By confirmsDeletion = By.xpath("//XCUIElementTypeButton[@name=\"yes\"]");
    public static By loginPageIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"Login\"]");
    public static By enterDocumentNumber = By.xpath("//XCUIElementTypeTextField[@name=\"document_number\"]");
    public static By documentNumberField = By.xpath("//XCUIElementTypeTextField[@name=\"document_number\"]");
    public static By clickScreen = By.xpath("//XCUIElementTypeStaticText[@name=\"Portrait:\"]");
    public static By expiryDate = By.xpath("//XCUIElementTypeStaticText[@name=\"Expiry Date:\"]");
    public static By clickIssueDate = By.xpath("//XCUIElementTypeOther[@name=\"Issue Date\"]");
    public static By clickExpiryDate = By.xpath("//XCUIElementTypeOther[@name=\"Expiry Date\"]");
    public static By successMessageForDrivingIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"You can now add your Driving Licence\"]");
    public static By drivingLicenceIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"Driving License\"]");
    public static By clickXButton = By.xpath("//XCUIElementTypeButton[@name=\"Close\"]");
    public static By drivingLicenceIsDisplayedInDashboard = By.xpath("(//XCUIElementTypeStaticText[@name=\"Driving License\"])[2]");
    public static By clickDrivingLicenceButton = By.xpath("//XCUIElementTypeStaticText[@name=\"Driving Licence\"]");
    public static By unselectData = By.xpath("//XCUIElementTypeStaticText[@name=\"Family Name\"]");
    public static By correspondingMessageIsDisplayed = By.xpath("//XCUIElementTypeStaticText[@name=\"Your selection of data to be shared may impact the service\"]");
    public static By clickaAgainData = By.xpath("//XCUIElementTypeStaticText[@name=\"Family Name\"]");
}
