package Stepdefinitions;

import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import Pages.StackPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackSteps {

	StackPage stpg=new StackPage();
	
@Given("The user is on Signin page of DS Algo portal")
public void the_user_is_on_signin_page_of_ds_algo_portal() {
		stpg.user_in_signin();
	}
@When("The user enter valid {string} and {string}")
public void the_user_enter_valid_and(String username, String password) {
     stpg.user_enter_valid_and(username, password);
	}
@And("The user click on login button")
public void the_user_click_on_login_button() {
			stpg.login();
}
@Given("user should clicks the Getting Started button in Stack")
public void user_should_clicks_the_getting_started_button_in_stack() throws Exception {
        			stpg.getstart();
}@Then("The user is in the Stack page after logged")
public void the_user_is_in_the_stack_page_after_logged() {
	 System.out.println("user is in stack module homepage");
}
  @When("user clicks Operations in Stack button")
public void user_clicks_operations_in_stack_button() {
			stpg.click_operation_stackbutton();
}
@Then("user should be directed to Operations in Stack Page")
public void user_should_be_directed_to_operations_in_stack_page() {
  System.out.println("Operations  stack");
}
@Given("The user clicks Try Here button")
public void the_user_clicks_try_here_button() {
			stpg.tryhere();
}
@When("user write valid python code in tryEditor from data {string}")
public void user_write_valid_python_code_in_try_editor_from_data(String validcode) {
		stpg.write_acceptcode(validcode);
}
@Then("user click  the run button")
public void user_click_the_run_button() {
			stpg.click_runbtn();
}
@And("the valid code is executed")
public void the_valid_code_is_executed() throws Exception {
		stpg.valid_code_executed();
	}
@When("user write invalid code print =abc and click rrun button")
public void user_write_invalid_code_print_abc_and_click_rrun_button() {
	 		stpg.invalid_code();
}@Then("display the error message")
public void display_the_error_message() {
	stpg.error_msg();
}


//*******implementation**********
@Given("When user clicks Register button after entering Username and password")
public void when_user_clicks_register_button_after_entering_username_and_password(DataTable dataTable) {
	stpg.user_in_signin();  
	stpg.user_login(dataTable);
}


@When("user is in stack module after logged in")
public void user_is_in_stack_module_after_logged_in() throws Exception {

		stpg.getstart();
}
@Then("user clicks Implementation button")
public void user_clicks_implementation_button() {
	stpg.user_click_implementation();
}
@Then("user should be directed to Implementation Page")
public void user_should_be_directed_to_implementation_page() {
}
//*********Application***************
@Given("The user send a  valid code as {string} and {string}")
public void the_user_send_a_valid_code_as_and(String username, String password) {
	stpg.user_in_signin();  
	stpg.user_enter_valid_and(username, password);
	stpg.login();
	
}
@When("user clicks Application button")
public void user_clicks_application_button() throws Exception {

			stpg.click_applicationbtn();

}
@Then("user should be directed to Application Page")
public void user_should_be_directed_to_application_page() {
	
}

}
