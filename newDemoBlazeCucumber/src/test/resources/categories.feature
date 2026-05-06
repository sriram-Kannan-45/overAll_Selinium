Feature: Category navigation on Demoblaze

  Description:
    This feature verifies that the user can navigate between product categories
    such as Phones, Laptops, and Monitors on the Demoblaze homepage
    and view the relevant products.

  Background:
    Given User is on the Demoblaze Products store 

	@CategoryTest
  Scenario: User views Phones category
    When User clicks on Phones
    Then User should see Samsung galaxy s6

  Scenario: User views Laptops category
    When User clicks on Laptops
    Then User should see Sony vaio i5

  Scenario: User views Monitors category
    When User clicks on Monitors
    Then User should see Apple monitor 24