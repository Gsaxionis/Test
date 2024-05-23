@UI @WEB
Feature: Web Scenarios

  @SCENARIO_01 @WEB
  Scenario: Verifier
    Given user opens web Verifier App
    And user selects request for the entire PID
    And user clicks next button on verifier
    Then user copies url link and decode it

  @SCENARIO_02 @WEB
  Scenario: Credential
    Given user opens Credential Offer page
    And user enters id and password
    And user removes a text
    And user enters value
    And user enters input mode
    And user enters description
    And user clicks submit
    Then user copies url link offer and decode it

  @SCENARIO_03 @WEB
  Scenario: OpenId
    Given user opens Credential OpenId page
    And user clicks login with google
    And user inserts email
    And user inserts password
    And user clicks new test plan
    And user clicks create test plan
    And user clicks run test
    And user copies openid url link
