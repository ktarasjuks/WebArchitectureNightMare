@priority=1
@search
Feature: Search

  Scenario: Nav Bar
    Given user navigates to Demo shop
    Then Top Bar - is displayed
    Then Top Bar - Search Bar is displayed
    Then Top Bar - navigate to "Software" category
    Then Product Page - is displayed
    Then Product Page - "Software" category is displayed


