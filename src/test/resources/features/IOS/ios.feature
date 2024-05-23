@UI @IOS
Feature: Ios Scenarios

  @SCENARIO_01 @IOS
  Scenario: Online Identification & Authentication (cross-device)
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    And a successfull message is appeared
    And user clicks continue button
    And user clicks load sample data
    And the dashboard page is displayed
    And user opens Verifier App
    And user selects specific data to share
    And user selects to be identified using EUDI Wallet
    And user views the data and can unselect any of them
    And user presses the share button
    And user authorizes the discolsure of the data
    Then user is authenticated successfully

  @SCENARIO_02 @IOS
  Scenario: Quick Pin
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    Then a successfull message is appeared

  @SCENARIO_03 @IOS
  Scenario: View PID
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    And a successfull message is appeared
    And user clicks continue button
    And user clicks load sample data
    And the dashboard page is displayed
    And user clicks national id
    Then national id is displayed

  @SCENARIO_04 @IOS
  Scenario: View mDL
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    And a successfull message is appeared
    And user clicks continue button
    And user clicks load sample data
    And the dashboard page is displayed
    And user clicks mdl
    Then mdl is displayed

  @SCENARIO_05 @IOS
  Scenario: Request/Issue PID
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    And a successfull message is appeared
    And user clicks continue button
    And user clicks load sample data
    And the dashboard page is displayed
    And user clicks add doc button
    And add document page is displayed
    And user clicks national id button
    And authentication method selection is displayed
    And user clicks country selection
    And user clicks FormEU
    And data page is displayed
    And user enters data
    And a success message is displayed
    Then national id is displayed

  @SCENARIO_06 @IOS
  Scenario: Request/Issue MDL
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    And a successfull message is appeared
    And user clicks continue button
    And user clicks load sample data
    And the dashboard page is displayed
    And user clicks add doc button
    And add document page is displayed
    And user clicks driving licence button
    And authentication method selection is displayed
    And user clicks country selection
    And user clicks FormEU
    And data page is displayed
    And user enters data for drivring licence for ios
    And a success message for driving licence is displayed
    And driving licence is displayed
    Then driving licence is displayed in the EUDI Wallet dashboard

  @SCENARIO_07 @IOS
  Scenario: Remove PID
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    And a successfull message is appeared
    And user clicks continue button
    And user clicks load sample data
    And the dashboard page is displayed
    And user clicks national id
    And national id is displayed
    And user clicks delete button
    And user confirms deletion
    Then the login page is displayed

  @SCENARIO_08 @IOS
  Scenario: Remove mDL
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    And a successfull message is appeared
    And user clicks continue button
    And user clicks load sample data
    And the dashboard page is displayed
    And user clicks mdl
    And mdl is displayed
    And user clicks delete button
    And user confirms deletion
    Then the dashboard page is displayed

  @SCENARIO_09 @IOS
  Scenario: Selective Disclosure
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    And a successfull message is appeared
    And user clicks continue button
    And user clicks load sample data
    And the dashboard page is displayed
    And user opens Verifier App
    And user selects specific data to share
    And user selects to be identified using EUDI Wallet
    And user views the data and unselect any of them
    And a corresponding message is displayed
    And user clicks again the data
    And user presses the share button
    And user authorizes the discolsure of the data
    Then user is authenticated successfully

  @SCENARIO_10 @IOS
  Scenario: View Dashboard
    Given welcome to EUDI page is displayed
    And user sets up a quick pin
    And user clicks next button
    And user re-enters pin
    And user clicks confirm button
    And a successfull message is appeared
    And user clicks continue button
    And user clicks load sample data
    Then the dashboard page is displayed