@all
@milk
@google
Feature: Google Search For Milk

  Scenario: Search for milk
    Given I navigate to Google page
    When I search for "Milk!"
    Then search result is displayed
    Then first result should contain word "milk"