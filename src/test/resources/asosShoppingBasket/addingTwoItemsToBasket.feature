Feature: Adding two items to basket

  Scenario: Adding the items to the cart
  Given the user is on the homepage of www.asos.com
  When the user selects the Women or Men category
  And the user selects a subcategory of goods, for example, Shoes or Accessories
  And the user selects a type of product, for example, "Boots" or "Rings"
  And the user selects a random item from the list
  And the user selects the size (if available)
  And the user clicks on the "Add to bag" button
  Then add the second product
  And check that the cart is empty
