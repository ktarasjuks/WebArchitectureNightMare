@registration
Feature: User Registration

  Scenario: User Registration with all mandatory fields defined
#    Given user navigates to Demo shop
#    When Top Bar - navigate to "My Account" category
#    And selects "Register" option
    Given user navigates to URL http://demoshop24.com/index.php?route=account/register
    And inputs the following information
      | First Name | Kirill |
      | Last Name | Shepitko |
      | E-Mail | kirill.shepitko@neotech.lv |
      | Telephone | 29295801 |
      | Password | ThePassword |
      | Password Confirm | ThePassword |
    Then registration succeeds