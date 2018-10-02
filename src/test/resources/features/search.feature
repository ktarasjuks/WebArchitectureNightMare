@demoshop
@priority=1
@issue=4
Feature: Search
  Background:
    Given user navigates to Demo shop
    Then Menu Bar - is displayed


  Scenario Outline: Search bar is displayed at all pages

    Then Menu Bar - Search Bar is displayed

    Then Menu Bar - navigate to "<category>" category
    Then Product Page - is displayed
    Then Menu Bar - Search Bar is displayed

    Then Menu Bar - navigate to "<dropdownCategory>" dropdown category and "<dropdownElement>" category

    Then Product Page - is displayed
    Then Menu Bar - Search Bar is displayed

    Examples:
      | category | dropdownCategory    | dropdownElement              |
      | Software | Laptops & Notebooks | Show All Laptops & Notebooks |
      | Tablets  | Desktops            | Show All Desktops            |
      | Cameras  | Components          | Show All Components          |

    Scenario: Search products

      When Menu Bar - search for "phone"
      Then Search Page - is displayed
      And Search Page - all results should contain "phone" word









