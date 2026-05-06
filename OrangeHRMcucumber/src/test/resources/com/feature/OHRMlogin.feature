
Feature: Login to Orange HRM with the senario outline 

	description :
	
		as a user can login with the incorrect credentials so that the user can not login and gives a error messeage
		
		@invalidCredentials 
	Scenario Outline:Login with the invalid credentials
		
		Given user is on Home page
		When user enters username as <"username"> and password as <"password">
		And user clicks login Button
		Then user should be able to see an <"error">
		
	Examples:
	
		|username |password |error |
		|Admin1   |admin1	|Invalid credentials|
		|		  |admin123 |Required|
		|Admin	  |			|Required|
	
