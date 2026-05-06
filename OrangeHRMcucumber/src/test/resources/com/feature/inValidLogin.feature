
Feature: Login with invalid credentials  

	description :
	
		as a user can login with the incorrect credentials so that the user can not login and gives a error messeage
		
		@invalidCredentials2 
	Scenario Outline: Login with the invalid credentials
		
		Given user is on Home page
		Then user enters invlaid credentials and login will be unsuccessfull with 
		|username |password |error |
		|Admin1   |admin1	|Invalid credentials|
		|Admina   |admin22  |Invalid credentials|
		
	
	
		
