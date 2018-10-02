@us06-P1
@checkout

Feature: Shopping cart management

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