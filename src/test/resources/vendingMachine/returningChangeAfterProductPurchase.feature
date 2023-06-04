#Feature: Returning change after product purchase
#
#  Scenario: Purchase of product using the exact amount
#    Given the user has selected a product with a price of X
#    And the user has inserted coins amounting to X
#    When the user purchases the product
#    Then the product is successfully purchased and no change is returned as the inserted coins equal the product price
#
#  Scenario: Purchase of product using an amount exceeding the product price
#    Given the user has selected a product with a price of X
#    And the user has inserted coins amounting to Y, where Y > X
#    When the user purchases the product
#    Then the product is successfully purchased and the user is returned change amounting to Y - X
#
#  Scenario: Returning change in the form of different denomination coins
#    Given the user has selected a product with a price of X
#    And the user has inserted coins amounting to Y, where Y > X
#    And the vending machine has coins of different denominations for returning change
#    When the user purchases the product
#    Then the product is successfully purchased and the user is returned change in the form of different denomination coins
#
#  Scenario: Returning change in the form of same denomination coins
#    Given the user has selected a product with a price of X
#    And the user has inserted coins amounting to Y, where Y > X
#    And the vending machine has only coins of the same denomination for returning change
#    When the user purchases the product
#    Then the product is successfully purchased and the user is returned change in the form of same denomination coins