Feature: Test the complete booking functionality

  Background: 
    Given As a user navigate to Fly Away website on browser
    When user entered email address and password
    And click on signup button
    Then validate logout button is displayed
    Given As a user select source and destination locations
    When user clicks on submit button

  @smoke
  Scenario: Test the complete booking functionality
    Given As a user click on complete booking button
    Then validate title of the complete booking
