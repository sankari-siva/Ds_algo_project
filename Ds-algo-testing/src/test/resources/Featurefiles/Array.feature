
@Array
Feature: Testing Array page
    
@Array_in_python
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid credentials for "bitbuddies" and "buddies@123" and login
    Then  user redirected to Array Page
    When  user clicks Arrays in python button
    Then  user should  directed to Arrays in python page and click TryHere button in that page
    When  user  user is redirected to a page having a TryEditor to a valid code in tryEditor as datainput "print('hello')" and click run button
    And  clicks Run button for Arrays on python page and the valid code is execute
    Then user  write  a invalid code print =abc to check the editorbox  and clicks run button
    And it will the  display the output as a error message
    
@Array_using_list
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid credentials for "bitbuddies" and "buddies@123" and login
    Then  user redirected to Array Page
    When  user clicks the Arrays using list link
    Then  user should  directed to Arrays using list page and click TryHere button in that page
    When  user  user is redirected to a page having a TryEditor to a valid code in tryEditor as datainput "print('hello')" and click run button
    And  clicks Run button for Arrays on python page and the valid code is execute
    Then user  write  a invalid code print =abc to check the editorbox  and clicks run button
    And it will the  display the output as a error message
    @basic_oper_in_list
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid credentials for "bitbuddies" and "buddies@123" and login
    Then  user redirected to Array Page
    When  user clicks the basic operation in list link
    Then  user should  directed to basic operation in list page and click TryHere button in that page
    When  user  user is redirected to a page having a TryEditor to a valid code in tryEditor as datainput "print('hello')" and click run button
    And  clicks Run button for Arrays on python page and the valid code is execute
    Then user  write  a invalid code print =abc to check the editorbox  and clicks run button
    And it will the  display the output as a error message
    @Application_of_array
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid credentials for "bitbuddies" and "buddies@123" and login
    Then  user redirected to Array Page
    When  user clicks Application of Arrays in python link
    Then  user should  directed to Application of Arrays page and click TryHere button in that page
    When  user  user is redirected to a page having a TryEditor to a valid code in tryEditor as datainput "print('hello')" and click run button
    And  clicks Run button for Arrays on python page and the valid code is execute
    Then user  write  a invalid code print =abc to check the editorbox  and clicks run button
    And it will the  display the output as a error message
    @practice_question
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid credentials for "bitbuddies" and "buddies@123" and login
    Then  user redirected to Array Page
    When  user clicks Application of Arrays in python link
    Then  user should  directed to Application of Arrays page and click practice in that page
    When user click the search the array and  a valid code send in tryEditor as datainput "print('hello')" 
    Then user clicks the run button
    And user clicks the submit button
    #//@practice_2
    When user navigate back to practice question
    Then  user click the max consecutive ones link and  a valid code send in tryEditor as datainput "print('hello')" 
    Then user clicks the run button
    And user clicks the submit button
    
    
    
    
    
    
    
    
    
    