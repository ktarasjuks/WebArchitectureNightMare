@us05-P1
@shoppingcart

Feature: Shopping cart management

  Scenario: Adding item to shopping cart
    Given navigate to demoshop24 page
    When I search for "Milk!"
    Then search result is displayed
    Then first result should contain word "milk"


  Scenario: Search for cheese
    Given I navigate to Google page
    When I search for "Cheese!"
    Then search result is displayed
    And first result should contain word "cheese"
    And I purposefully fail this scenario to get a screenshot