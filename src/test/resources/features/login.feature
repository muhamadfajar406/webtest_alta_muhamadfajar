Feature: Login feature in demoqa.com
  As a user go to BooksStore
  I want to take book
  So that I can see list my BooksStore

  Scenario: Login Success
    Given I am on the Login page
    When I enter my username and Password correctly
    When I click 'Login' button
    Then I am taken to the dashboard


  Scenario: Login failed
    Given I am on the Login page
    When I enter blank username and Password correctly
    When I click 'Login' button
    Then I am stay in the page Login

  Scenario: Login failed2
    Given I am on the Login page
    When I enter  username and Password blank correctly
    When I click 'Login' button
    Then I am stay in the page Login

  Scenario: Login failed3
    Given I am on the Login page
    When I enter  username blank and Password blank correctly
    When I click 'Login' button
    Then I am stay in the page Login




