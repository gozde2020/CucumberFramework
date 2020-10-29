
Feature: Job Titles Validation against DB
@JobTitleValidation


  Scenario: Job Titles Validation against DB
    Given login with valid credentials
    And verify the dashboard logo is displayed
    When navigate to job titles
    And verify the table is displayed
    When get all job titles from the table
    Then get all job titles from the db
    Then validate Job Titles from ui against db
