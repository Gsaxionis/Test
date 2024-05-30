@manual
Feature: EUDI Wallet

 @SCENARIO_01 @manual:Failed @Bug
 Scenario: Monitoring a new low risk customer
  Given Joe is a new customer
  And Joe is considered a low risk customer
  When he is onboarded
  Then his account should be scheduled for review in 3 months time

 @Scenario_02 @manual:Failed @Bug
 Scenario: Monitoring a new
 Failure:Joe is showing as a high-risk customer
  Given Joe is a new customer
  And Joe is considered a low risk customer
  When he is onboarded
  Then his account should be scheduled for review in 3 months time

 @SCENARIO_03 @manual:Failed @Bug
 Scenario: Monitoring a
  Given Joe is a new customer
  And Joe is considered a low risk customer
  When he is onboarded
  Then his account should be scheduled for review in 3 months time

# @LOGIN_01 @manual:Passed
# Scenario: Login (positive flow) and dashboard page
#  Given splash and welcome screen is appeared
#  And user swipes welcome pages
#  And user accepts terms and conditions
#  And user sets up pin
#  And user close and restart app
#  And the login page is displayed
#  And user enters correctly their PIN
#  Then the journey page is displayed


