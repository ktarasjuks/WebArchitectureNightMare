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




#  Scenario: Search for cheese
#    Given I navigate to Google page
#    When I search for "Cheese!"
#    Then search result is displayed
#    And first result should contain word "cheese"
#    And I purposefully fail this scenario to get a screenshot