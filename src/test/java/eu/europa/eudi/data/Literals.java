package eu.europa.eudi.data;

public interface Literals {

    enum Wallet{

        WELCOME_HEADER("Welcome to the EUDI Wallet"),
        SUCCESS_MESSAGE("You successfully set the quick pin"),
        AUTHENTICATION_SUCCESS("You successfully shared information with EUDI Remote Verifier"),
        AUTHENTICATION_SUCCESS_IOS("You successfully shared information with the Verifier"),
        LOGIN("Login"),
        WELCOME_PAGE("Welcome to the EUDI Wallet"),
        USER_PROFIL("National ID"),
        NATIONAL_ID("National ID"),
        MDL("Driving License"),
        DASHBOARD_PAGE("Welcome back"),
        CORRESPONDING_MESSAGE("Your selection of data to be shared may impact the service"),
        ADD_DOCUMENT("Add document"),
        AUTHENTICATION_SELECTION("Authentication Method Selection"),
        DATA_PAGE("Enter the data for your EUDI Wallet"),
        SUCCESS_MESSAGE_PID("You can now add your National ID"),
        DRIVING_LICENCE("Driving License"),
        SUCCESS_MESSAGE_DRIVING_LICENCE("You can now add your Driving License"),
        SUCCESS_MESSAGE_DRIVING_LICENCE_IOS("You can now add your Driving Licence");

        public final String label;
        Wallet(String label) {
            this.label = label;
        }
    }

    enum Verifier{

        VIEW_DATA_PAGE("Please review carefully before sharing your data.Why we need your data?"),
        VIEW_DATA_PAGE_IOS("Please review carefully before sharing your data. Why we need your data?"),

        APP_OPEN_SUCCESSFULLY("Authenticate by sharing your PID"),
        AUTHENTICATION_PAGE("Proceed to authentication");

        public final String label;
        Verifier(String label) {
            this.label = label;
        }
    }

    enum General{
        WEB_DRIVER_NOT_INSTANCE_APPIUM_MESSAGE("WebDriver is not an instance of AppiumDriver"),
        ANDROID("android"),
        IOS("ios");
        public final String label;
        General(String label) {
            this.label = label;
        }
    }
}
