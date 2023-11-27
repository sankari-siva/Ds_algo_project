package Pages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.datatable.DataTable;

public class StackPage {
	WebDriver driver=new ChromeDriver();
	
	public void user_in_signin() {
		driver.get("https://dsportalapp.herokuapp.com/");
	 	WebElement getstart=driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
		getstart.click();
	WebElement signin=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]"));
		signin.click();
	}
		public void user_enter_valid_and(String username, String password){
		WebElement usname=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
		usname.sendKeys(username);
		WebElement paswrd=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
		paswrd.sendKeys(password);
			}
		public void login() {
			WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]"));
			login.click();
		}
		public void getstart() throws Exception {
			 WebElement getstartStack=driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/a"));
				getstartStack.click();
				TakesScreenshot screenshot=(TakesScreenshot) driver;
				File source=screenshot.getScreenshotAs(OutputType.FILE);
				File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\user_loggedin_stackpage.png");
				FileHandler.copy(source,destination);
		}
		public void click_operation_stackbutton() {
			WebElement Opera=driver.findElement(By.xpath("/html/body/div[2]/ul[1]/a"));
			Opera.click();
		}
		public void tryhere() {
			WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
		     tryhere.click();
		}
		public void write_acceptcode(String validcode) {
			WebElement editbox = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
			editbox.sendKeys(validcode);
			editbox.sendKeys(Keys.ENTER);
					}
		public void  click_runbtn() {
			WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
			   run.click();
					}
		public void valid_code_executed() {
			String result=driver.findElement(By.xpath("//*[@id=\"output\"]")).getText();
			System.out.println("  valid code  " +  result);
			driver.navigate().back();
			WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
		    tryhere.click();
		}
		public void invalid_code()  {
			WebElement editbx = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
			editbx.sendKeys("ghhtt");
			WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
			   run.click();
			
			   
		}
		public void error_msg()  {
			Alert alert=driver.switchTo().alert();
				alert.accept();
		 System.out.println(" error message : " + alert);
		}
		public void user_login(DataTable dataTable)
		{
			List<List<String>> credentials=dataTable.cells();
			   WebElement username1=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
			username1.sendKeys(credentials.get(0).get(0));
			WebElement passwrd1=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
		    passwrd1.sendKeys(credentials.get(0).get(1));
		    WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]"));
			login.click();
		}
		public void user_click_implementation () {
			WebElement implement=driver.findElement(By.xpath("/html/body/div[2]/ul[2]/a"));
			   implement.click();
			}
		
		public void click_applicationbtn() {
			WebElement application=driver.findElement(By.xpath("/html/body/div[2]/ul[3]/a"));
			 application.click();
		}
		
}

