package Stepdefinitions;

import Pages.Queuepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Queuesteps {
	Queuepage qp=new Queuepage();
	@Given("user enter valid {string} and {string} and click login button")
	public void user_enter_valid_and_and_click_login_button(String username, String password) {
	    qp.login_queue(username,password);
	}
	@Then("user redirected to Queue Page")
	public void user_redirected_to_queue_page() {
	  	}
	@When("user clicks Implementation of Queue in python button")
	public void user_clicks_implementation_of_queue_in_python_button() {
	   qp.click_implementation_queue();
	}
	@Then("user should  directed to  Implementation of Queue in python page and click TryHere button")
	public void user_should_directed_to_implementation_of_queue_in_python_page_and_click_try_here_button() {
	   qp.try_here_btn(); 
	}
	@When("user send a valid code to tryEditor as datainput {string} and click run button")
	public void user_send_a_valid_code_to_try_editor_as_datainput_and_click_run_button(String validcode) {
	  qp.valid_code_applied(validcode);
	}
	@When("the valid python code will br executed")
	public void the_valid_python_code_will_br_executed() {
	 qp.code_valid_is_executed();
	}
	@Then("user  send a invalid python code print =abc and clicks run button")
	public void user_send_a_invalid_python_code_print_abc_and_clicks_run_button() {
	   qp.invalid_code_is_executed();
	}
	@Then("it shows a display the error message")
	public void it_shows_a_display_the_error_message() {
	 qp.error_msg_displayed();
	}
	//@implementation_using_collection
	@When("user clicks Implementation using collection button")
	public void user_clicks_implementation_using_collection_button() {
	    qp.click_implementation_collection();
	}
	@Then("user should  directed to  Implementationusing collection page and click TryHere button")
	public void user_should_directed_to_implementationusing_collection_page_and_click_try_here_button() {
	   qp.try_here_btn();
	}
//@implementation_using_array
	@When("user clicks Implementation using array button")
	public void user_clicks_implementation_using_array_button() {
	    qp.click_implementation_array();
	}
	@Then("user should  directed to  Implementation using array page and click TryHere button")
	public void user_should_directed_to_implementation_using_array_page_and_click_try_here_button() {
	  qp.try_here_btn();
	}
//@Queue_Operation
	@When("user clicks  Queue Operation button")
	public void user_clicks_queue_operation_button() {
	   qp.queue_operation();
	}

	@Then("user should  directed to   Queue Operation page and click TryHere button")
	public void user_should_directed_to_queue_operation_page_and_click_try_here_button() {
	    qp.try_here_btn();
	    	}

	@When("user navigated back and click Practice Question")
	public void user_navigated_back_and_click_practice_question() throws Exception {
	    qp.revert_back();
		qp.practice_ques();
	}

	@Then("user redirected to Practice Question page")
	public void user_redirected_to_practice_question_page() {
	  
	}

}
