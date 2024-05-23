#@manual
#Feature: User story 1
#
#  @SCENARIO_01 @manual:Failed
#  Scenario: Launch EUDI Wallet and set up PIN
#    Given the user launches the EUDI Wallet for the first time
#    When the user sets up the PIN
#    And the 'Add document' screen appears
#    And the user should be able to add only their PID
#    And the user clicks on the National ID option
#    And the user is redirected to the issuance service
#    And the user follows the corresponding process
#    Then the PID is displayed in the EUDI Wallet dashboard
#
#  @SCENARIO_02 @manual:Success
#  Scenario: Add document again using the 'Add doc' button
#    Given the user is on the EUDI Wallet dashboard
#    When the user clicks on the 'Add doc' button
#    Then the 'Add document' screen should appear