@registration
Feature: User Registration

  Scenario: User Registration with all mandatory fields defined
    Given user navigates to Demo shop
    When clicks "My account" in Top Bar
    And selects "Register" option
    And inputs the following information
      | First Name | Kirill |
      | Last Name | Shepitko |
      | E-Mail | kirill.shepitko@neotech.lv |
      | Telephone | 29295801 |
      | Password | ThePassword |
      | Password Confirm | ThePassword |
    Then registration succeeds