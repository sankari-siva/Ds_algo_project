@Graph
Feature: Testing Graph Module
Scenario: Graph Module
Given user is in the Home page after logged in
When user clicks Getting Started button in Graph module
Then  user should be directed to Graph Page
When  user clicks Graph
Then  user clicks Try Here button
And  user write valid  code in tryEditor from data "print('hello') "
 Then user click   run button 
 And   valid code  executed
 When  user send invalid code  and click run button
Then  it should display the error message
@representation
Scenario:   user is navigated to Graph page
Given user is navigated to Graph page
When user clicks graphical representation
Then  user clicks tryhere 
Then user write valid command in try editor "print('hello')"
And user click the run
Then valid code gets executed
When user send invalid command and click run
Then display error message as alert

