Feature: Login User

  Scenario: Logging into the account
    Given the user is on the homepage of asos
    When the user clicks on Sign In button
    And the user enters their email address in the Email field
    And the user enters their password in the "Password" field
    And the user clicks on the "SIGN IN" button
    Then user is logged in



