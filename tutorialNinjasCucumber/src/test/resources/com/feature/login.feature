Feature: sriram_5/5/2026_login to the tutorialNinjas

	description: As a user I want to login to the tutorialNinjas website
	
	@loginValid
	Scenario Outline: Login to the tutorialNinjas with vaild credentials
        
        Given the user is on the homepage
        When the user clicks on the My Account dropdown
        And the user clicks on the Login option
        And the user enters the "<email>" and "<password>"
        And the user clicks on the Login button
        Then the user should be seen the My Account page
        
        Examples:
            | email              | password  |
            |2k22aids46@kiot.ac.in|sriram123@|
        
        
	
		