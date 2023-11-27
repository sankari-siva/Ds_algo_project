@Queue
Feature: Testing Queue page
    
@implementation_of_Queue
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and click login button
    Then  user redirected to Queue Page
    When  user clicks Implementation of Queue in python button
    Then  user should  directed to  Implementation of Queue in python page and click TryHere button
    When  user send a valid code to tryEditor as datainput "print('hello')" and click run button
    And  the valid python code will br executed
    Then user  send a invalid python code print =abc and clicks run button
    And it shows a display the error message
        
@implementation_using_collection
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and click login button
    Then  user redirected to Queue Page
    When  user clicks Implementation using collection button
    Then  user should  directed to  Implementationusing collection page and click TryHere button
    When  user send a valid code to tryEditor as datainput "print('hello')" and click run button
    And  the valid python code will br executed
    Then user  send a invalid python code print =abc and clicks run button
    And it shows a display the error message
        
@implementation_using_array
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and click login button
    Then  user redirected to Queue Page
    When  user clicks Implementation using array button
    Then  user should  directed to  Implementation using array page and click TryHere button
    When  user send a valid code to tryEditor as datainput "print('hello')" and click run button
    And  the valid python code will br executed
    Then user  send a invalid python code print =abc and clicks run button
    And it shows a display the error message
        
@Queue_Operation
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and click login button
    Then  user redirected to Queue Page
    When  user clicks  Queue Operation button
    Then  user should  directed to   Queue Operation page and click TryHere button
    When  user send a valid code to tryEditor as datainput "print('hello')" and click run button
    And  the valid python code will br executed
    Then user  send a invalid python code print =abc and clicks run button
    And it shows a display the error message
    When user navigated back and click Practice Question
    Then user redirected to Practice Question page 