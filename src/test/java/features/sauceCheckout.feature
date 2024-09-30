@automation
  Feature: Checkout Process

  @task4_checkout
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
    And user fill Postal Code "12345"
    And user click on continue button
    And user finishes the checkout
    Then user see the checkout status as "Complete"

    @task4c_checkout1
    Scenario: Missing first name when checkout
      Given user navigates to "https://www.saucedemo.com/"
      When user login
        | username      | password     |
        | standard_user | secret_sauce |
      And user select product "Sauce Labs Backpack"
      And user add the product to cart
      And user open your cart page
      And user checkout the product
      And user fill Last Name "Doe"
      And user fill Postal Code "1234"
      And user click on continue button
      Then user see error message "First Name is required"

    @task4c_checkout2
    Scenario: Missing last name when checkout
      Given user navigates to "https://www.saucedemo.com/"
      When user login
        | username      | password     |
        | standard_user | secret_sauce |
      And user select product "Sauce Labs Backpack"
      And user add the product to cart
      And user open your cart page
      And user checkout the product
      And user fill First Name "John"
      And user fill Postal Code "1234"
      And user click on continue button
      Then user see error message "Last Name is required"

    @task4c_checkout3
    Scenario: Missing postal code when checkout
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
      And user click on continue button
      Then user see error message "Postal Code is required"