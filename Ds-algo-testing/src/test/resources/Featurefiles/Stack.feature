
@Stack
Feature: Testing Stack Module
Scenario: Stack Module
@operationStack
Scenario: The user is logged in to DS Algo portal 
    Given The user is on Signin page of DS Algo portal
    When The user enter valid "bitbuddies" and "buddies@123"
    And The user click on login button
    Given      user should clicks the Getting Started button in Stack
      Then   The user is in the Stack page after logged 
     When   user clicks Operations in Stack button 
    Then   user should be directed to Operations in Stack Page
      Given The user clicks Try Here button
     When  user write valid python code in tryEditor from data "print('hello')"
    Then user click  the run button
    And  the valid code is executed
     When  user write invalid code print =abc and click rrun button
           Then  display the error message
      @Implementation
      Scenario: user is navigated to stack page
      Given  When user clicks Register button after entering Username and password 
|bitbuddies | buddies@123 |
     When user is in stack module after logged in
      Then user clicks Implementation button
       Then  user should be directed to Implementation Page
       Given The user clicks Try Here button
     When  user write valid python code in tryEditor from data "print('hello')"
    Then user click  the run button
    And  the valid code is executed
     When  user write invalid code print =abc and click rrun button
           Then  display the error message
    @Applications
    Scenario: user is navigated to stack page
    Given The user send a  valid code as "bitbuddies" and "buddies@123"
      Given user is in stack module after logged in
      When user clicks Application button
       Then  user should be directed to Application Page
       Given The user clicks Try Here button
     When  user write valid python code in tryEditor from data "print('hello')"
    Then user click  the run button
    And  the valid code is executed
     When  user write invalid code print =abc and click rrun button
           Then  display the error message

  
