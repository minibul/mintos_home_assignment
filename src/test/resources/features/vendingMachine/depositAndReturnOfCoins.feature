#Feature: deposit and return of coins
#
#  Scenario: Inserting coins of valid denominations
#    Given the vending machine accepts coins of 5ȼ, 10ȼ, 20ȼ, 50ȼ, 1€ and 2€ denominations
#    When the user inserts a coin of any of these denominations
#    Then the coin is accepted and the user's balance increases by the value of the inserted coin
#
#  Scenario: Attempt to insert coins of invalid denominations
#    Given the vending machine accepts coins of 5ȼ, 10ȼ, 20ȼ, 50ȼ, 1€ and 2€ denominations
#    When the user attempts to insert a coin of any other denomination
#    Then the coin is not accepted and the user's balance does not increase
#
#  Scenario: Inserting multiple coins
#    Given the vending machine accepts coins of 5ȼ, 10ȼ, 20ȼ, 50ȼ, 1€ and 2€ denominations
#    When the user inserts multiple coins of these denominations
#    Then all the coins are accepted and the user's balance increases by the total value of the inserted coins
#
#  Scenario: Attempt to insert a coin with the wrong side up
#    Given the vending machine accepts coins of 5ȼ, 10ȼ, 20ȼ, 50ȼ, 1€ and 2€ denominations
#    When the user attempts to insert a coin with the wrong side up
#    Then the coin is not accepted and the user's balance does not increase
#
#  Scenario: Attempt to insert two coins simultaneously*
#    Given the vending machine accepts coins of 5ȼ, 10ȼ, 20ȼ, 50ȼ, 1€ and 2€ denominations*
#    When the user attempts to insert two coins simultaneously*
#    Then the coins are not accepted and the user's balance does not increase*
#
#  Scenario: Attempt to insert a coin of an unacceptable size or shape
#    Given the vending machine accepts coins of 5ȼ, 10ȼ, 20ȼ, 50ȼ, 1€ and 2€ denominations
#    When the user attempts to insert a coin of an unacceptable size or shape
#    Then the coin is not accepted and the user's balance does not increase
#
#  Scenario: Return of inserted coins
#    Given the user has inserted coins into the vending machine
#    When the user selects the return coins option
#    Then all inserted coins are returned to the user and the user's balance becomes zero