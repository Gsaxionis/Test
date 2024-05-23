@manual
@manual-result:passed
@manual-last-tested:sprint-15


Feature: EUDI Wallet - 1st test case

Scenario: Monitoring a new low risk customer
 Given Joe is a new customer
 And Joe is considered a low risk customer
 When he is onboarded
 Then his account should be scheduled for review in 3 months time
