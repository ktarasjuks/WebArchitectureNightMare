@demoshop
@us06-P1
@checkout
@issue=5

Feature:  cart management

  Scenario Outline: Shopping Cart is displayed at all pages
    Given user navigates to Demo shop
    When Menu Bar - is displayed
    Then Top Bar button "Shopping Cart" is clickable
    Then Top Bar button "Checkout" is clickable

    Then Menu Bar - navigate to "<category>" category
    Then Product Page - is displayed
    Then Top Bar button "Shopping Cart" is clickable
    Then Top Bar button "Checkout" is clickable

    Then Menu Bar - navigate to "<dropdownCategory>" dropdown category and "<dropdownElement>" category

    Then Top Bar button "Shopping Cart" is clickable
    Then Top Bar button "Checkout" is clickable
    Then Menu Bar - Shopping Cart is displayed


    Examples:
      | category | dropdownCategory    | dropdownElement              |
      | Software | Laptops & Notebooks | Show All Laptops & Notebooks |
      | Tablets  | Desktops            | Show All Desktops            |
      | Cameras  | Components          | Show All Components          |