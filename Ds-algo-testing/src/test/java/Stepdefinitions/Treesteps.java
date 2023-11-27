package Stepdefinitions;

import Pages.Treepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Treesteps {
Treepage tp=new Treepage();
//Overview
@Given("user enter valid {string} and {string} and login")
public void user_enter_valid_and_and_login(String username, String password) {
   tp.login_tree(username, password);
}
@Then("user redirected to Tree Page")
public void user_redirected_to_tree_page() {
}
@When("user clicks overview of tree button")
public void user_clicks_overview_of_tree_button() {
   tp.click_overview_tree();
}

@Then("user should  directed to overview of tree page and click TryHere button")
public void user_should_directed_to_overview_of_tree_page_and_click_try_here_button() {
   tp.try_here_btn();
}
@When("user send a valid code in tryEditor as datainput {string} and click run button")
public void user_send_a_valid_code_in_try_editor_as_datainput_and_click_run_button(String validcode) {
   tp.validcode_applied(validcode);
}
@When("the valid code will execute")
public void the_valid_code_will_execute() {
  tp.code_valid_executed();
}
@Then("user  send a invalid code print =abc and clicks run button")
public void user_send_a_invalid_code_print_abc_and_clicks_run_button() {
  tp.invalid_code_executed();
}
@Then("it will the  display the error message")
public void it_will_the_display_the_error_message() {
    tp.error_msg();
}
//@terminology
@When("user clicks terminologies button")
public void user_clicks_terminologies_button() {
   tp.terminologies();
}
@Then("user should  directed to treminologies page and click TryHere button")
public void user_should_directed_to_treminologies_page_and_click_try_here_button() {
   tp.try_here_btn();
}
//@types of tree
@When("user clicks Types of trees  button")
public void user_clicks_types_of_trees_button() {
  tp.types_of_trees();
}
@Then("user should  directed to types of trees page and click TryHere button")
public void user_should_directed_to_types_of_trees_page_and_click_try_here_button() {
  tp.try_here_btn();
}
//@tree travsersal
@When("user clicks Tree Traversal button")
public void user_clicks_tree_traversal_button() {
   tp.tree_traversal();
}
@Then("user should  directed to Tree Traversal page and click TryHere button")
public void user_should_directed_to_tree_traversal_page_and_click_try_here_button() {
   tp.try_here_btn();
}
//@tree illustration
@When("user clicksTraversal illustrationbutton")
public void user_clicks_traversal_illustrationbutton() {
   tp.tree_illustartion();
}
@Then("user should  directed to Traversal illustration page and click TryHere button")
public void user_should_directed_to_traversal_illustration_page_and_click_try_here_button() {
  tp.try_here_btn();
}
//@binary trees
@When("user clicks Binary Trees button")
public void user_clicks_binary_trees_button() {
    tp.binary_trees();
}
@Then("user should  directed to Binary Trees page and click TryHere button")
public void user_should_directed_to_binary_trees_page_and_click_try_here_button() {
   tp.try_here_btn();
}
//@types of binary tree
@When("user clicks types of binary trees button")
public void user_clicks_types_of_binary_trees_button() {
   tp.types_binary_tree();
}
@Then("user should  directed to types of binary trees page and click TryHere button")
public void user_should_directed_to_types_of_binary_trees_page_and_click_try_here_button() {
  tp.try_here_btn();
}
//@implement_python
@When("user clicks implementation python button")
public void user_clicks_implementation_python_button() {
    tp.implematation_python();
}
@Then("user should  directed to implementation python page and click TryHere button")
public void user_should_directed_to_implementation_python_page_and_click_try_here_button() {
tp.try_here_btn();
}
//@binary_tree_travesal
@When("user clicks binary tree traversal button")
public void user_clicks_binary_tree_traversal_button() {
    tp.binary_tree_traversal();
}
@Then("user should  directed to binary tree traversal page and click TryHere button")
public void user_should_directed_to_binary_tree_traversal_page_and_click_try_here_button() {
 tp.try_here_btn();
}

//@implementation binary 
@When("user clicks implementation binary button")
public void user_clicks_implementation_binary_button() {
  tp.implematation_binary();
}
@Then("user should  directed to implementation binary page and click TryHere button")
public void user_should_directed_to_implementation_binary_page_and_click_try_here_button() {
  tp.try_here_btn();
}
//@application binary
@When("user clicks Application binary button")
public void user_clicks_application_binary_button() {
    tp.apllication_binary();
}

@Then("user should  directed to Application binary page and click TryHere button")
public void user_should_directed_to_application_binary_page_and_click_try_here_button() {
   tp.try_here_btn();
}
//@binary search trees
@When("user clicks binary search trees button")
public void user_clicks_binary_search_trees_button() {
  tp.search_binary();
}

@Then("user should  directed tobinary search trees page and click TryHere button")
public void user_should_directed_tobinary_search_trees_page_and_click_try_here_button() {
   tp.try_here_btn();
}
//@implementation of BST
@When("user clicks Implemantation of BST button")
public void user_clicks_implemantation_of_bst_button() {
 tp.implematation_BST();
}

@Then("user should  directed to Implemantation of BST page and click TryHere button")
public void user_should_directed_to_implemantation_of_bst_page_and_click_try_here_button() {
    tp.try_here_btn();
    }

@When("user navigated back to implementation of BST and click practice question")
public void user_navigated_back_to_implementation_of_bst_and_click_practice_question() {
 tp.practice_ques();
}
@Then("user redirected to practice question page")
public void user_redirected_to_practice_question_page() {
    
}



}
