
@APIReview
Feature: Syntax HRMS API Workflow
  Description: This feature file tests Syntax HRMS API Workflow

  Background: 
    Given a JWT is generated

  
  Scenario: Creating an employee
    Given a request is prepared to create an employee
    When a POST call is made to create an Employee
    Then the status code should be 201
    And the employee created contains key "Message" and the value "Entry Created"
    And the employee_id "Employee[0].employee_id" is being stored as a global variable

    
    Scenario: get the created Employee
    Given a request is ready to get the created employee
    When a GET call is made to retrieve the created employee
    Then status code should be 200
    And the retrived EmployeeID "Employee[0].employee_id" matches the globally stored EmployeeID
    
    