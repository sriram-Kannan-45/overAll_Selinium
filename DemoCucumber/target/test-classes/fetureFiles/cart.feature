Feature : Add to cart and place order

	Scenario: Add the product to the Cart
	
	Given user in a home page 
	When user click the CATEGORIES menu 
	And user choose the Phones menu 
	And user click the "Samsung galaxy s6"
	And user click the Add to cart button 
    Then user should see the alert message Product added
    
    Scenario: Place the order
        
    Given user in the Cart page
    When user click the Place Order button  
    And user fill the form with name "name", country "india", city "salem", credit card "1234 5678 9012 3456", month "12" and year "2025"
    And user can click Purchase button
    Then user should see the message Thank you for your purchase!.
            
