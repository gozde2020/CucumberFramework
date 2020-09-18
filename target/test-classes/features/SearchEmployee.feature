@searchEmployee
Feature: Search Employee

  Background: 
    When login with valid credentials
    Then navigate to employee list page

  @byId
  Scenario Outline: Search data by id
    And enter "<ID>" number
    Then click on search button
    And verify the "<First Name>" , "<Middle Name>"

    Examples: 
      | ID   | First Name | Middle Name |
      | 7747 | Gamze      | Sara        |
      | 7688 | Mathew     | Jones       |
      | 7860 | Dilber     | Hala        |
      | 7861 | sahika     | turkkan     |
      | 7764 | Marko      | J           |

  @byName
  Scenario Outline: Search data by name
    And enter "<First Name>"
    Then click on search button
    And verify the "<First Name>" , "<Middle Name>"

    Examples: 
      | First Name | Middle Name |
      | Gamze      | Sara        |
      | Mathew     | Jones       |
      | Dilber     | Hala        |
      | sahika     | turkkan     |
      | Marko      | J           |
