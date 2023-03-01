Feature: Login Feature

  Scenario: I can log in and view my inss
    Given I am logged in as 'koen@mail.com' with password 'passkoen'
    When I am going to the profile page
    Then I can see that the inss is '123457'


  Scenario: another scenario
    Given I am on the register page
    When I register a random account
    Then I can log in with these same credentials
    And all my credentials are correctly displayed on the profile page


