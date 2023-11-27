package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pages.Linkedlistpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Linkedliststep {
	Linkedlistpage llp=new Linkedlistpage();
//	@Intro_Linkedlist
@Given("The user enter valid {string} and {string} and login")
public void the_user_enter_valid_and_and_login(String username, String password) {
   llp.login(username, password);
}
@Then("The user redirected to Linked List  Page")
public void the_user_redirected_to_linked_list_page() {
  }
@When("The user clicks Introduction button")
public void the_user_clicks_introduction_button() {
 llp.click_introduction_link();
}
@Then("The user should be directed to Introduction of Linked List Page and clicks TryHere button")
public void the_user_should_be_directed_to_introduction_of_linked_list_page_and_clicks_try_here_button() {
   llp.try_here_btn();
}
@When("user write valid python code in tryEditor from data {string} and click run button")
public void user_write_valid_python_code_in_try_editor_from_data_and_click_run_button(String validcode) {
  llp.validcode_applied(validcode);
}

@When("the valid code is executed1")
public void the_valid_code_is_executed1() {
llp.code_valid_executed();
}

@Then("user  write invalid code print =abc and click run button")
public void user_write_invalid_code_print_abc_and_click_run_button() {
    llp.invalid_code_executed();
}
@Then("it should the  display the error message")
public void it_should_the_display_the_error_message() {
	 llp.error_msg();
}
//@create_linklist

@Given("user enter valid credentials {string} and {string} and clicks  a linked list link")
public void user_enter_valid_credentials_and_and_clicks_a_linked_list_link(String username, String password) {
   llp.login(username,password);
	   llp.creting_linklist();
	}
@Given("user clicks creating a linked list link")
public void user_clicks_creating_a_linked_list_link() {
      llp.creting_linklist();
}
@When("user should be directed to Creating Linked List and click Try Here button")
public void user_should_be_directed_to_creating_linked_list_and_click_try_here_button() {
  llp.try_here_btn();
}
@When("user write valid code in tryEditor from data {string} and click run")
	public void user_write_valid_code_in_try_editor_from_data_and_click_run(String validcode) {
   llp.validcode_applied(validcode);
}
@When("valid code is executed1")
public void valid_code_is_executed1() {
	   llp.code_valid_executed();
}
@Then("user send invalid code print =abc and click run button")
public void user_send_invalid_code_print_abc_and_click_run_button() {
  llp.invalid_code_executed();
}
	

//@traversal_link
	@Given("user enter valid credentials {string} and {string} and clicks traversal link")
public void user_enter_valid_credentials_and_and_clicks_traversal_link(String username, String password) {
 llp.login(username, password);
  llp.traversal_link();
}
@When("user should be directed to traversal Link and click Try Here button")
public void user_should_be_directed_to_traversal_link_and_click_try_here_button() {
    llp.try_here_btn();
}
@Given("user enter valid credentials {string} and {string} and clicks insertion link")
public void user_enter_valid_credentials_and_and_clicks_insertion_link(String username, String password) {
 llp.login(username, password);
}
@When("user should be directed to insertion Link and click Try Here button")
public void user_should_be_directed_to_insertion_link_and_click_try_here_button() {
    llp.insertion_link();
    llp.try_here_btn();
}
@Given("user enter valid credentials {string} and {string} and clicks deletion link")
public void user_enter_valid_credentials_and_and_clicks_deletion_link(String username, String password) {
	llp.login(username, password);
}

@When("user should be directed to deletion Link and click Try Here button")
public void user_should_be_directed_to_deletion_link_and_click_try_here_button() {
    llp.deletion_link();
    llp.try_here_btn();
}
//@practice_page
	@Given("user enter valid credentials {string} and {string} and clicks practice link")
public void user_enter_valid_credentials_and_and_clicks_practice_link(String username, String password) {
    llp.login(username, password);
  llp.deletion_link();
 llp.practice_link();
	}@When("user should be directed to Practice page")
public void user_should_be_directed_to_practice_page() throws Exception {
  llp.deletion_link();
  llp.practice_link();
  llp.practice_page_screenshot();
}
}
