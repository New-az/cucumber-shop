Feature: Buy products
  As a customer
  I want to buy products

  Background:
    Given a product Bread with price 20.50 and quantity 10 exists
    And a product Jam with price 80.00 and quantity 10 exists

  Scenario: Buy one product
    When I buy Bread with quantity 2
    Then total of Bread should be 41.00 and 8
