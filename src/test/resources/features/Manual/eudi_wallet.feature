@manual
Feature: EUDI Wallet

 @SCENARIO_01 @manual:Failed
 Scenario: Monitoring a new low risk customer
  Given Joe is a new customer
  And Joe is considered a low risk customer
  When he is onboarded
  Then his account should be scheduled for review in 3 months time


 @LOGIN_01 @manual:Failed
 Scenario: Login (positive flow) and dashboard page
  Given splash and welcome screen is appeared
  And user swipes welcome pages
  And user accepts terms and conditions
  And user sets up pin
  And user close and restart app
  And the login page is displayed
  And user enters correctly their PIN
  Then the journey page is displayed