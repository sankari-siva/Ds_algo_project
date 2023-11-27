@linkedlist
Feature: Testing LinkedList page

  #Background: The user run the code in tryEditor with valid input for Introduction page
    #Given The user is in a try here page having  tryEditor with a Run button to test
    #When The user Enters valid python code in tryEditor from data "print('hello world')" 
    #And user click on Run button
    #Then The user should be presented with the Run 
    #When The user Enter invalid python code in tryEditor from sheet "'abc' = 1" 
    #And user click on a Run button
    #Then The user get the error message
    
@Intro_Linkedlist
   Scenario: The user is logged in to DS Algo portal
    Given The user enter valid "bitbuddies" and "buddies@123" and login
    Then The user redirected to Linked List  Page
    When The user clicks Introduction button
    Then The user should be directed to Introduction of Linked List Page and clicks TryHere button
    When  user write valid python code in tryEditor from data "print('hello')" and click run button
    And  the valid code is executed1
    Then user  write invalid code print =abc and click run button
    And it should the  display the error message
    
 @create_linklist
Scenario: user is in linkedlist page after logged in 
Given user enter valid credentials "bitbuddies" and "buddies@123" and clicks  a linked list link
When user should be directed to Creating Linked List and click Try Here button 
When  user write valid code in tryEditor from data "print('hello')" and click run 
    And valid code is executed1
    Then user send invalid code print =abc and click run button
   And it should the  display the error message
    
   @Transversal
  Scenario: user is in linkedlist page after login
  Given user enter valid credentials "bitbuddies" and "buddies@123" and clicks traversal link
When user should be directed to traversal Link and click Try Here button 
When  user write valid code in tryEditor from data "print('hello')" and click run 
    And valid code is executed1
    Then user send invalid code print =abc and click run button
    And it should the  display the error message
    
    @Insertion_button
    Scenario: user is in linkedlist page after login
  Given user enter valid credentials "bitbuddies" and "buddies@123" and clicks insertion link
When user should be directed to insertion Link and click Try Here button 
When  user write valid code in tryEditor from data "print('hello')" and click run 
    And valid code is executed1
    Then user send invalid code print =abc and click run button
    And it should the  display the error message
    
    @deletion_link
     Scenario: user is in linkedlist page after login
  Given user enter valid credentials "bitbuddies" and "buddies@123" and clicks deletion link
When user should be directed to deletion Link and click Try Here button 
When  user write valid code in tryEditor from data "print('hello')" and click run 
 And valid code is executed1
 Then user send invalid code print =abc and click run button
And it should the  display the error message
  @practice_link
  Scenario:  user validating "Practice Questions" page
  Given user enter valid credentials "bitbuddies" and "buddies@123" and clicks deletion link
When user should be directed to Practice page

