@us05-P1
@shoppingCart
@issue=6
@demoshop
Feature: Checkout

  Scenario: Adding item to shopping cart
    Given user navigates to Demo shop
    When users add product to shopping cart
    When user navigates to Shopping Cart page
    Then Shopping Cart Page - is displayed
    And validates the price with product price
    And check out button is is displayed

  Scenario Outline: Shopping Cart is displayed at all pages
    Given user navigates to Demo shop
    When Menu Bar - is displayed
    Then Menu Bar - Shopping Cart is displayed

    Then Menu Bar - navigate to "<category>" category
    Then Product Page - is displayed
    Then Menu Bar - Shopping Cart is displayed

    Then Menu Bar - navigate to "<dropdownCategory>" dropdown category and "<dropdownElement>" category

    Then Product Page - is displayed
    Then Menu Bar - Shopping Cart is displayed


    Examples:
      | category | dropdownCategory    | dropdownElement              |
      | Software | Laptops & Notebooks | Show All Laptops & Notebooks |
      | Tablets  | Desktops            | Show All Desktops            |
      | Cameras  | Components          | Show All Components          |