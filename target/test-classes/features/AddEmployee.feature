Feature: Add Employee Functionality

@regression
Scenario: Add employee with login details
#Given go to HRMS login page 
When login with valid credentials
Then navigate to add employee page
When add new employee with login details
Then verify add employee succesfully
#And quit browser

@regression
Scenario: Add employee without login details
#Given go to HRMS login page 
When login with valid credentials
Then navigate to add employee page
When add new employee without login details
Then verify add employee succesfully
#And quit browser

