#Feature: Selecting a product
#
#  Scenario: Selecting a product
#    Given the vending machine has an array of available products
#    When the user selects a product
#    Then the product becomes selected for purchase
#
#  Scenario: Attempt to select an unavailable product
#    Given the selected product is not available in the vending machine
#    When the user selects the product
#    Then an error message is displayed, and the product cannot be selected.
#
#  Scenario: Changing the selected product
#    Given the user has already selected a product
#    When the user selects another product
#    Then the previously selected product is deselected and the new product becomes selected for purchase

