@Tree
Feature: Testing Tree page
    
@Overview_of_Tree
   Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks overview of tree button
    Then  user should  directed to overview of tree page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
    @Terminologies 
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks terminologies button
    Then  user should  directed to treminologies page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
      @Types_of_trees
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks Types of trees  button
    Then  user should  directed to types of trees page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
     @Tree_Traversal
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks Tree Traversal button
    Then  user should  directed to Tree Traversal page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
     @Traversal_illustration
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicksTraversal illustrationbutton
    Then  user should  directed to Traversal illustration page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
     @Binary_Trees
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks Binary Trees button
    Then  user should  directed to Binary Trees page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
     @types_of_binary_trees
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks types of binary trees button
    Then  user should  directed to types of binary trees page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
     @implementation_python
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks implementation python button
    Then  user should  directed to implementation python page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
    @binary_tree_traversal
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks binary tree traversal button
    Then  user should  directed to binary tree traversal page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
    @implementation_binary
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks implementation binary button
    Then  user should  directed to implementation binary page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
     @Application_binary
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks Application binary button
    Then  user should  directed to Application binary page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
     @binary_search_trees
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks binary search trees button
    Then  user should  directed tobinary search trees page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message
      @Implemantation_of_BST
      Scenario: user is logged in to DS Algo portal
    Given  user enter valid "bitbuddies" and "buddies@123" and login
    Then  user redirected to Tree Page
    When  user clicks Implemantation of BST button
    Then  user should  directed to Implemantation of BST page and click TryHere button
    When  user send a valid code in tryEditor as datainput "print('hello')" and click run button
    And  the valid code will execute
    Then user  send a invalid code print =abc and clicks run button
    And it will the  display the error message    
    When user navigated back to implementation of BST and click practice question
    Then user redirected to practice question page
    