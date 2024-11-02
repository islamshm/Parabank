@Smoke @Regression @Functional
Feature: Login function test
  Background:
  Given Open the browser 
    And Go to the application

  @Positive @TC_001
  Scenario: As a para bank user, login should success with valid credintials
    When Put the valid user
    And Put the valid password
    And Click on login btn
    Then login should pass and logout button should visible
    @negative @TC_002
 Scenario: As a para bank user, login should fail with invalid credintials 
    When Put the invalid user
    And Put the invalid password
    And Click on login btn
    Then login should fail and error msg contains An internal error has occurred and has been logged.

    @negative @TC_003
 Scenario: As a para bank user, login should fail with null credintials
    When Put the null user
    And Put the null password
    And Click on login btn
    Then login should fail and msg contains Please enter a username and password.