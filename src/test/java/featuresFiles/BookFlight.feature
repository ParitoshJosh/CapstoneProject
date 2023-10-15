Feature: Test the functionality of Book Flight

  Background: 
    Given As a user navigate to Fly Away website on browser
    When user entered email address and password
    And click on signup button
    Then validate logout button is displayed
    Given As a user select source and destination locations
    When user clicks on submit button

  @smoke
  Scenario: Verify user is able to book Flight
    Then valiate title of the book flight
