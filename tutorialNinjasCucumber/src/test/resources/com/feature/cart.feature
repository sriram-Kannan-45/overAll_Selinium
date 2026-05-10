Feature: add the items to the cart

  Description:
  As a user, I want to be able to add items to my shopping cart
  so that I can purchase them later.
@cart
  Scenario: add the items to the cart

    Given user is on the Account page

    Then user searches for the items and adds to the cart and verifies the items in the cart
      | itemNameSearch | itemNameCart |
      | mac            | iMac         |
      | mac            | MacBook      |
      | mac            | MacBook Air  |