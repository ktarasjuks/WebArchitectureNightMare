@us05-P1
@shoppingCart

Feature: Shopping cart management

  Scenario: Adding item to shopping cart
    Given user navigates to Demo shop
    And Main Page - is displayed
    When users add product to shopping cart
    When user navigates to Shopping Cart page
    Then Shopping Cart Page - is displayed
    And validates the price with product price

