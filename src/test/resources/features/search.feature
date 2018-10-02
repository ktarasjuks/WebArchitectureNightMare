@priority=1
@search
Feature: Search

  Scenario: Nav Bar
    Given user navigates to Demo shop
    Then Menu Bar - is displayed
    Then Menu Bar - Search Bar is displayed
    Then Menu Bar - navigate to "Software" category

    Then Product Page - is displayed
    Then Product Page - "Software" category is displayed

    Then Menu Bar - navigate to "Laptops & Notebooks" dropdown category and "Show All Laptops & Notebooks" category


    Then Product Page - is displayed
    Then Product Page - "Laptops & Notebooks" category is displayed


