package Stepdefinitions;

import Pages.ArrayPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Arraysteps {
   ArrayPage ap=new ArrayPage();
@Given("user enter valid credentials for {string} and {string} and login")
public void user_enter_valid_credentials_for_and_and_login(String username, String password) {
   ap.login_array(username,password);
}
@Then("user redirected to Array Page")
public void user_redirected_to_array_page() {
   }
 @When("user clicks Arrays in python button")
public void user_clicks_arrays_in_python_button() {
 ap.click_python_array();
}

@Then("user should  directed to Arrays in python page and click TryHere button in that page")
public void user_should_directed_to_arrays_in_python_page_and_click_try_here_button_in_that_page() {
  ap.try_here_btn();
}

@When("user  user is redirected to a page having a TryEditor to a valid code in tryEditor as datainput {string} and click run button")
public void user_user_is_redirected_to_a_page_having_a_try_editor_to_a_valid_code_in_try_editor_as_datainput_and_click_run_button(String validcode) {
  ap.code_valid_executed();
}

@When("clicks Run button for Arrays on python page and the valid code is execute")
public void clicks_run_button_for_arrays_on_python_page_and_the_valid_code_is_execute() {
    ap.code_valid_executed();
}

@Then("user  write  a invalid code print =abc to check the editorbox  and clicks run button")
public void user_write_a_invalid_code_print_abc_to_check_the_editorbox_and_clicks_run_button() {
   ap.invalid_code_executed();
}

@Then("it will the  display the output as a error message")
public void it_will_the_display_the_output_as_a_error_message() {
  ap.error_msg();
}
//@Array using list

@When("user clicks the Arrays using list link")
public void user_clicks_the_arrays_using_list_link() {
    ap.array_using_list();
}
@Then("user should  directed to Arrays using list page and click TryHere button in that page")
public void user_should_directed_to_arrays_using_list_page_and_click_try_here_button_in_that_page() {
    ap.try_here_btn();
}
//@basic operation in list
@When("user clicks the basic operation in list link")
public void user_clicks_the_basic_operation_in_list_link() {
  ap.basic_opera_list();
}
@Then("user should  directed to basic operation in list page and click TryHere button in that page")
public void user_should_directed_to_basic_operation_in_list_page_and_click_try_here_button_in_that_page() {
   ap.try_here_btn();
}
//@application of array
@When("user clicks Application of Arrays in python link")
public void user_clicks_application_of_arrays_in_python_link() {
   ap.application_of_array();
}
@Then("user should  directed to Application of Arrays page and click TryHere button in that page")
public void user_should_directed_to_application_of_arrays_page_and_click_try_here_button_in_that_page() {
    ap.try_here_btn();
}
@Then("user should  directed to Application of Arrays page and click practice in that page")
public void user_should_directed_to_application_of_arrays_page_and_click_practice_in_that_page() {
     ap.practice_ques();
}
@When("user click the search the array and  a valid code send in tryEditor as datainput {string}")
public void user_click_the_search_the_array_and_a_valid_code_send_in_try_editor_as_datainput(String validcode) {
  ap.search_array();
  ap.validcode_applied(validcode);
}
@Then("user clicks the run button")
public void user_clicks_the_run_button() {
   // ap.run_result();
    ap.error_msg();
}
@Then("user clicks the submit button")
public void user_clicks_the_submit_button() {
    ap.submit();
}@When("user navigate back to practice question")
public void user_navigate_back_to_practice_question() {
   ap.revertback();
}
@Then("user click the max consecutive ones link and  a valid code send in tryEditor as datainput {string}")
public void user_click_the_max_consecutive_ones_link_and_a_valid_code_send_in_try_editor_as_datainput(String validcode) {
    ap.max_consecutive();
    ap.validcode_applied(validcode);
}




}
