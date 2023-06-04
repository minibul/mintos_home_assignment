#Feature: Purchase of product
#
#  Scenario: Purchase of product with sufficient inserted coins
#    Given the user has selected a product and inserted enough coins
#    When the user purchases the product
#    Then the product is successfully purchased, and the user's balance decreases by the price of the product
#
#  Scenario: Attempt to buy more than one product at once
#    Given the user has selected a product and inserted sufficient coins for more than one item of the product
#    When the user attempts to buy more than one item of the selected product at once
#    Then an error message is displayed, and only one item of the product is purchased.
#
#  Scenario: Attempt to purchase a product with insufficient inserted coins
#    Given the user has selected a product and inserted an insufficient number of coins
#    When the user purchases the product
#    Then an error message is displayed, and the product is not purchased