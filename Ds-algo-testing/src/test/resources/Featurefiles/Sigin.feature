
@signin
Feature: signin feature
Scenario: Signin feature
Given User clicks Signin link
And user redirected to signin page
When User clicks Login button
Then should display an error message 
When user enters "bitbuddies" and clicks Login 
Then should display an error message

  @TS_signin_01
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<Sheetname>" and
    <RowNumber>

    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and <RowNumber>
    Then click login button

    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |
