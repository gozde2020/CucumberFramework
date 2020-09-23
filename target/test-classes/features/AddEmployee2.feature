@addEmployee
Feature: Add Employee

  Background: 
    When login with valid credentials
    Then navigate to add employee page

  Scenario: Add employee without login details but without middle name
    And enter first and last name
    Then click on save Button
    And verify the employee is added successfully

  Scenario: Add employee with login details
    And enter first and last name
    When check login details checkbox
    Then enter login details
    Then click on save Button
    And verify the employee is added successfully

  @parameter
  Scenario: Add employee without login details but with middle name
    When enter first name as "Ahmet" middle name as "Can" and last name as "Bicer"
    Then click on save Button
    And verify that "Ahmet Can Bicer" is added successfully
#scenerio outline uses example keyword
  @examples
  Scenario Outline: Adding multiple employees without login details
    When enter employee "<First Name>", "<Middle Name>" and "<Last Name>"
    Then click on save Button
    And verify that "<First Name>", "<Middle Name>" and "<Last Name>" is successfully added
#data tables
    Examples: 
      | First Name | Middle Name | Last Name |
      | Marko      | Jrty        | Smiths    |
      | Hunt       | Arty        | Musoev    |
      | Jack       | Marty       | Wicko     |
      | John       | Fury        | Kennedys  |

  @dtWithHeader
  Scenario: Adding multiple employees at one execution
    When add multiple employees and verify they are added
      | First Name | Middle Name | Last Name | Employee ID |
      | Markos     | J           | Smiths    | asdfret     |
      | Hunter     | A           | Musoev    | vdfwr       |
      | Jackson    | M           | Wicko     | mfnfh       |
      | Johnathan  | F           | Kennedys  | opyen       |

  @excelTask
  Scenario: Adding multiple employees
    When add multiple employees from "AddEmployee" verify they are added succesfully
