@Regression
Feature: Create new tour
  Background: Kevin needs to open the homepage
    Given needs to open the homepage
@Scenario1
  Scenario: Kevin, as a test analyst, Login with wrong password
    When Enter bad password credentials
      |user|pass|
      |demo|badpass|
    Then click on the login button, verify the messageInvalid Login Credentials The Email field must contain a valid email address.
  @Scenario2
  Scenario: Kevin, as a test analyst, Create a new tour
    When Create a new tour
      |user|pass|tourName|priceAdult|location|offertittle|offerdescription|
      |admin@phptravels.com|demoadmin|kevin test tour|5000|china|Tour Nuevo1|s      |
    Then Verify new tour Tour Nuevo1