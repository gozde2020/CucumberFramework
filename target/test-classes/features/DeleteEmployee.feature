@deleteEmployee
Feature: Delete Employee

  Background: 
    When login with valid credentials
    Then navigate to employee list page

  @deleteById
  Scenario Outline: Delete Employee by id
    And enter "<ID>" number
    Then click on search button
    When verify the "<First Name>" , "<Middle Name>"
    Then click on the check button
    And click delete button

    Examples: 
      | ID   | First Name | Middle Name |
      
      | 7952 | Hunter      | ABC        |
    
