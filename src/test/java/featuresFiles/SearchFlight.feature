Feature: login to FlyAway website and Search for flights

Background:
Given As a user navigate to Fly Away website on browser
When user entered email address and password
And click on signup button
Then validate logout button is displayed

@smoke
Scenario: Verify searchFlight functinality
Given As a user select source and destination locations
When user clicks on submit button
Then validate bookFlight Id from UI and DB