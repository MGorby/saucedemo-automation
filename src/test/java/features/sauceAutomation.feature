@automation
  Feature: Product Checkout

  @task_4
  Scenario: Checkout a product
    Given user navigates to "https://www.saucedemo.com/"
    When user login
    | username      | password     |
    | standard_user | secret_sauce |
    And user select product "Sauce Labs Backpack"
    And user add the product to cart
    And user open your cart page
    And user checkout the product
    And user fill First Name "John"
    And user fill Last Name "Doe"
    And user fill Postal Code "1234"
    And user click on continue button
    And user finishes the checkout
    Then user checkout status is "Complete"