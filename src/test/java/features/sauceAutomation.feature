@automation
  Feature: Sauce Automation

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

    @task4c_login1
    Scenario: Successful login with valid credentials
      Given user navigates to "https://www.saucedemo.com/"
      When user login
        | username      | password     |
        | standard_user | secret_sauce |
      Then user is successfully logged in
      And user should redirect to page "/inventory"

    @task4c_login2
    Scenario: Login attempt with Incorrect Username
      Given user navigates to "https://www.saucedemo.com/"
      When user login
        | username       | password     |
        | wrong_username | secret_sauce |
      Then user see error message "Username and password do not match any user in this service"

    @task4c_login3
    Scenario: Login attempt an empty username
      Given user navigates to "https://www.saucedemo.com/"
      When user fill password "secret_sauce"
      And user click login button
      Then user see error message "Username is required"

    @task4c_login4
    Scenario: Login attempt an empty password
      Given user navigates to "https://www.saucedemo.com/"
      When user fill username "standard_user"
      And user click login button
      Then user see error message "Password is required"