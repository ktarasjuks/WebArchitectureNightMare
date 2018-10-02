@demoshop
@priority=1
@registration
@issue=1
Feature: User Registration

  Scenario: User Registration with all mandatory fields defined
#    Given user navigates to URL http://demoshop24.com/index.php?route=account/register
    Given user navigates to Demo shop
    When clicks Top Bar main option "My Account"
    And selects "Register" option
    And inputs the following information
      | First Name | Kirill |
      | Last Name | Shepitko |
      | E-Mail | kirill.shepitko2@neotech.lv |
      | Telephone | 29295801 |
      | Password | ThePassword |
      | Password Confirm | ThePassword |
    And clicks Agree to Policy
    And clicks Continue
    Then registration succeeds