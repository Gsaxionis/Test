@manual
@manual:Failed

Scenario Outline: Launch EUDI Wallet and set up PIN
   Given the user launches the EUDI Wallet for the first time
   When the user sets up the PIN
   Then the 'Add document' screen should appear
   And the user should be able to add only their PID

 Scenario: Add National ID
   Given the user is on the 'Add document' screen
   When the user clicks on the 'National ID' option
   Then the user should be redirected to the issuance service
   And follows the corresponding process

 Scenario: Confirm issuance of PID
   Given the user is using the issuance service
   When the user previews the PID and confirms its issuance
   Then the PID should be displayed in the EUDI Wallet dashboard

 Scenario: Add document again using the 'Add doc' button
   Given the user is on the EUDI Wallet dashboard
   When the user clicks on the 'Add doc' button
   Then the 'Add document' screen should appear

 Scenario: Re-add National ID
   Given the user is on the 'Add document' screen again
   When the user clicks on the 'National ID' option
   Then the user should be redirected to the issuance service again
   And follows the corresponding process

 Scenario: Confirm re-issuance of PID
   Given the user is using the issuance service again
   When the user previews the PID and confirms its issuance again
   Then the PID should be displayed again in the EUDI Wallet dashboard