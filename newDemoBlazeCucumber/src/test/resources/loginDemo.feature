Feature: Login to demo blaze Web
	Description:
	
	This feature file will test the login functionality of demo blaze web application with valid, invalid and blank credentials.

  Background:
    Given User is on Home Page with the url "https://www.demoblaze.com/index.html"
    And user can clik  login button

  @ValidCredentials @sriram @smoke
  Scenario: Login with valid credentials
    When User enters valid username as "admin"
    And User enters valid password as "admin"
    And User can click the Login button
    Then User should be able to see to Welcome admin message

  @invalidcredentials
  Scenario: Login with invalid credentials
    When the user enters invalid username "admin"
    And the user enters password "admin123"
    And the user clicks Log in button
    Then the user should see user does not exist pop up

  @blank_username_credential
  Scenario: Login with left out credential (username)
    When the user leave the username ""
    And the user enters valid password ""
    And the user clicks Log in button
    Then he should see a  Please fill out Username and Password. pop up
