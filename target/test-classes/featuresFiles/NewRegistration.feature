Feature: Testing the functionality of New user Registration.

  @regression
  Scenario: Verify user is able to register as a New Register.
    Given As a user navigate to Fly Away website on browser
    When user enter requried details to register
    Then Validate successful registration on UI and DB
