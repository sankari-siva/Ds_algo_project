package Stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import Pages.SigninPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.ExcelReader;
import utils.LoggerLoad;

public class Signin {

	SigninPage sign = new SigninPage();
	static String username;
	static String password;
	static String message;
	Boolean isEmpty = true;
	//String Excelpath = getexcelfilepath();

@Given("User clicks Signin link")
public void user_clicks_signin_link() {
	sign.click_sign_inlink();
	
//	driver.get(" https://dsportalapp.herokuapp.com/home/");
//	driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();		
}

@Given("user redirected to signin page")
public void user_redirected_to_signin_page() {
 
}

@When("User clicks Login button")
public void user_clicks_login_button() {
		sign.click_login();
		
	//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();
}

@Then("should display an error message")
public void should_display_an_error_message() {
	System.out.println("Please fill out this field");
}

@When("user enters {string} and clicks Login")
public void user_enters_and_clicks_login(String name) {
		sign.userfield_enter(name);
	 sign.click_login();
	 // driver.findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys(username);
	 
}
	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		        sign.login_page();
		        LoggerLoad.info("User is on Sigin Page");
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {

			ExcelReader reader = new ExcelReader();

			List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excelfile/Login.xlsx", sheetname);

			username = testdata.get(rownumber).get("username");

			password = testdata.get(rownumber).get("password");

			message = testdata.get(rownumber).get("expectedresult");

			LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");

			if (username != null || password != null)

				sign.doLogin(username, password);

		}
	

	@Then("click login button")
	public void click_login_button() {
		LoggerLoad.info("User clicks on login button");
		LoggerLoad.info("Expected Message - Excel Sheet :  " + message);
	sign.click_login();
		//String msg = sign.click_login();
		//LoggerLoad.info("Actual Message :  " + msg);
	//	assertEquals(msg, message);
	}


}
