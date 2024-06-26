package eu.europa.eudi.elements.android;

import org.openqa.selenium.By;

public class WalletElements {
    public static final By welcomeScreen = By.xpath("//android.widget.TextView[@text=\"Welcome to the EUDI Wallet\"]");
    public static By pinTexfield1 = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    public static By pinTexfield2 = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    public static By pinTexfield3 = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    public static By pinTexfield4 = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[4]");
    public static By pinTexfield5 = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[5]");
    public static By pinTexfield6 = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.EditText[6]");
    public static By nextButton = By.xpath("//android.widget.TextView[@text=\"NEXT\"]");
    public static By clickConfirm = By.xpath("//android.widget.TextView[@text=\"CONFIRM\"]");
    public static By successMessage = By.xpath("//android.widget.TextView[@text=\"You successfully set the quick pin\"]");
    public static By searchBar = By.id("com.android.chrome:id/search_box");
    public static By clickShareData = By.xpath("//android.widget.RadioGroup/android.view.View[1]");
    public static By clickNext = By.xpath("//android.widget.Button[@text=\"NEXT\"]");
    public static By chooseData = By.xpath("//android.webkit.WebView[@text=\"VerifierUi\"]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.widget.TextView[3]");
    public static By chooseWallet = By.xpath("//android.widget.TextView[@text=\"AUTHENTICATE WITH WALLET\"]");
    public static By chooseSampleData = By.xpath("//android.widget.TextView[@text=\"Load Sample Documents\"]");
    public static By viewDataPage = By.xpath("//android.widget.TextView[@text=\"Please review carefully before sharing your data.Why we need your data?\"]");
    public static By clickShare = By.xpath("//android.widget.TextView[@text=\"SHARE\"]");
    public static By authenticationSuccess = By.xpath("//android.widget.TextView[@text=\"You successfully shared information with EUDI Remote Verifier\"]");
    public static By clickContinue = By.xpath("//android.widget.TextView[@text=\"CONTINUE\"]");
    public static By appOpensSuccessfully = By.xpath("//android.widget.TextView[@text=\"Authenticate by sharing your PID\"]");
    public static By loginPageIsDisplayed = By.xpath("//android.widget.TextView[@text=\"Login\"]");
    public static By authenticationPageIsDisplayed = By.xpath("//android.widget.TextView[@text=\"Proceed to authentication\"]");
    public static By welcomePage = By.xpath("//android.widget.TextView[@text=\"Welcome to the EUDI Wallet\"]");
    public static By userProfil = By.xpath("//android.widget.TextView[@text=\"National ID\"]");
    public static By clickNationalId = By.xpath("//android.widget.TextView[@text=\"National ID\"]");
    public static By nationalIdIsDisplayed = By.xpath("//android.widget.TextView[@text=\"National ID\"]");
    public static By clickMdl = By.xpath("//android.widget.TextView[@text=\"Driving License\"]");
    public static By mdlIsDisplayed = By.xpath("//android.widget.TextView[@text=\"Driving License\"]");
    public static By clickDeleteButton = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button");
    public static By confirmsDeletion = By.xpath("//android.view.ViewGroup[@resource-id=\"android:id/content\"]/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button");
    public static By dashboardPageIsDisplayed = By.xpath("//android.widget.TextView[@text=\"Welcome back\"]");
    public static By unselectData = By.xpath("//android.widget.CheckBox");
    public static By correspondingMessageIsDisplayed = By.xpath("//android.widget.TextView[@text=\"Your selection of data to be shared may impact the service\"]");
    public static By clickaAgainData = By.xpath("//android.widget.CheckBox");
    public static By addDoc = By.xpath("//android.view.View[@content-desc=\"Add\"]");
    public static By addDocumentPageIsDisplayed = By.xpath("//android.widget.TextView[@text=\"Add document\"]");
    public static By clickNationalIdButton = By.xpath("//android.widget.TextView[@text=\"National ID\"]");
    public static By authenticationMethodSelection = By.xpath("//android.widget.TextView[@text=\"Authentication Method Selection\"]");
    public static By countrySelection = By.xpath("//android.widget.RadioButton[@text=\"Country Selection\"]");
    public static By clickSubmit = By.xpath("//android.widget.Button[@text=\"Submit\"]");
    public static By clickFormEu = By.xpath("//android.widget.RadioButton[@text=\"FormEU\"]");
    public static By dataPageIsDisplayed = By.xpath("//android.widget.TextView[@text=\"Enter the data for your EUDI Wallet\"]");
    public static By clickGivenName = By.xpath("//android.webkit.WebView[@text=\"Form for your EUDI Wallet\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    public static By givenNameField = By.xpath("//android.webkit.WebView[@text=\"Form for your EUDI Wallet\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    public static By clickFamilyName = By.xpath("//android.webkit.WebView[@text=\"Form for your EUDI Wallet\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    public static By givenFamilyField = By.xpath("//android.webkit.WebView[@text=\"Form for your EUDI Wallet\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    public static By clickBirthDate = By.xpath("//android.widget.Spinner");
    public static By chooseSet = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
    public static By successMessageIsDisplayed = By.xpath("//android.widget.TextView[@text=\"You can now add your National ID\"]");
    public static By clickDrivingLicenceButton = By.xpath("//android.widget.TextView[@text=\"Driving License\"]");
    public static By enterDocumentNumber = By.xpath("//android.webkit.WebView[@text=\"Form for your EUDI Wallet\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    public static By documentNumberField = By.xpath("//android.webkit.WebView[@text=\"Form for your EUDI Wallet\"]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");
    public static By clickIssueDate = By.xpath("//android.webkit.WebView[@text=\"Form for your EUDI Wallet\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.Spinner[1]");
    public static By clickExpiryDate = By.xpath("//android.webkit.WebView[@text=\"Form for your EUDI Wallet\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.widget.Spinner[2]");
    public static By drivingLicenceIsDisplayed = By.xpath("//android.widget.TextView[@text=\"Driving License\"]");
    public static By successMessageForDrivingIsDisplayed = By.xpath("//android.widget.TextView[@text=\"You can now add your Driving License\"]");
    public static By drivingLicenceIsDisplayedInDashboard = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]");
    public static By expiryDate = By.xpath("//android.widget.TextView[@text=\"Expiry Date:\"]");
    public static By clickScreen = By.xpath("//android.widget.TextView[@text=\"Test Provider Form\"]");
    public static By clickXButton = By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button");
}
