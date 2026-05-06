
Feature: Login to Orange HRM with the senario outline 

	description :
	
		as a user can login with the correct credentials so that the user can  login 
		
		@validCredentials 
	Scenario:Login with the valid credentials
		
		Given user is on Home page
		When user enters valid credetials 
		|Admin|admin123|
		And user clicks login Button
		Then user should be able to login successfully and new page open
		
	
	
