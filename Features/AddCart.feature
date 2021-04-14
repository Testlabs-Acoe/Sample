
Feature: Adding item to cart

  @Addcart
  Scenario Outline: Adding to cart
    Given I click on searchbox
    When I enter "<searchitem>"
    And I click on searchbtn
    And select item from list
    And add it to cart
    And click on Proceed to buy
    Then I verify the page
      
    Examples: 
      | searchitem| 
      | choclates |
