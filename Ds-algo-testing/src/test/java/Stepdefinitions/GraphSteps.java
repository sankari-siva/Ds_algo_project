package Stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.GraphPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
public class GraphSteps {
GraphPage gp=new GraphPage();

	
@Given("user is in the Home page after logged in")
public void user_is_in_the_home_page_after_logged_in() {
			gp.user_click_to_login();
}
@When("user clicks Getting Started button in Graph module")
public void user_clicks_getting_started_button_in_graph_module() {
	gp.getstart();
}
@Then("user should be directed to Graph Page")
public void user_should_be_directed_to_graph_page() {
   }
@When("user clicks Graph")
public void user_clicks_graph() {
  gp.clickgraph();
	}
//@trybutton
@Then("user clicks Try Here button")
public void user_clicks_try_here_button() {
	gp.tryhere();
}
@Then("user write valid  code in tryEditor from data {string}")
public void user_write_valid_code_in_try_editor_from_data(String validcode) {
		gp.code_to_tryeditor(validcode);
}
@Then("user click   run button")
public void user_click_run_button() {
		gp.run_button();
}
@Then("valid code  executed")
public void valid_code_executed() {
		gp.code_execution();
}
@When("user send invalid code  and click run button")
public void user_send_invalid_code_and_click_run_button() {
		gp.invalid_code();
	}
@Then("it should display the error message")
public void it_should_display_the_error_message() {
			gp.alert_alert_error();
}

//@reprsentation
@Given("user is navigated to Graph page")
public void user_is_navigated_to_graph_page() {
		gp.navi_graph();
  }

@When("user clicks graphical representation")
public void user_clicks_graphical_representation() {
	gp.click_graphicalrepresent();
   }
//@trybutton2
@Then("user clicks tryhere")
public void user_clicks_tryhere() {
		gp.tryhere();
}
@Then("user write valid command in try editor {string}")
public void user_write_valid_command_in_try_editor(String validcode) {
		gp.code_to_tryeditor(validcode);
	}
@Then("user click the run")
public void user_click_the_run() {
		gp.run_button();
}
@Then("valid code gets executed")
public void valid_code_gets_executed() {
		gp.code_execution();
}
@When("user send invalid command and click run")
public void user_send_invalid_command_and_click_run() {
	gp.invalid_code();
	}
@Then("display error message as alert")
public void display_error_message_as_alert() {
		gp.alert_alert_error();
}
}
