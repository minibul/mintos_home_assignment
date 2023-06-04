#Feature: Stopping shopping
#
#  Scenario: Stopping shopping at any moment
#   Given the user has selected a product and inserted coins
#   When the user decides to stop shopping
#   Then all the user's actions are cancelled, the selected product is reset, the inserted coins are returned, and the user's balance becomes zero
#
#  Scenario: Power outage
#    Given the user has selected a product and inserted coins
#    When a power outage occurs
#    Then all operations of the vending machine are halted until power is restored.