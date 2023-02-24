Feature: Login Feature

  Scenario: I can log in and view my inss
    Given I am logged in as 'koen@mail.com' with password 'passkoen'
    When I am going to the profile page
    Then I can see that the inss is '123457'


  Scenario: another scenario
    Given I am logged in as 'koen@mail.com' with password 'passkoen'
    When I am going to the profile page
    Then I can see that the inss is '123457'


