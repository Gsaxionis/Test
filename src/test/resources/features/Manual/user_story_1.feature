@manual
Feature: User story 1

  @SCENARIO_02 @manual:Success
  Scenario: Add document again using the 'Add doc' button
    Given the user is on the EUDI Wallet dashboard
    When the user clicks on the 'Add doc' button
    Then the 'Add document' screen should appear