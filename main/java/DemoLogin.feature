
@tag
Feature: to test login functionality
  I want to use this template for my feature file

  @tag1
  Scenario: verify login to demo guru webpage
    Given the usee is in guru login webpage
    When the user enter valid username and password
    And click login button
    Then the user should be in manager home page
    
 