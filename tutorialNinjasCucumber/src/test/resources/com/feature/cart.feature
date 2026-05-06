Feature: add the items to the cart

description: As a user, I want to be able to add items to my shopping cart so that I can purchase them later.
  
  Scenario: add the items to the cart
    Given user is on the Account page
    When user searche "<item>" in a search box 
    And the user clicks on the "<item>" from the search results
    And the user clicks on the "Add to Cart" button
    Then the "<item>" should be see in the cart
    