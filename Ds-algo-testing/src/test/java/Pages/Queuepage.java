package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Queuepage {
	WebDriver driver=new ChromeDriver();
	public void login_queue(String username, String password) {
		driver.get("https://dsportalapp.herokuapp.com/");
		 	WebElement getstart=driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
			getstart.click();
		 WebElement signin=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]"));
			signin.click();
	 	  WebElement usname=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
			usname.sendKeys(username);
			WebElement paswrd=driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
			paswrd.sendKeys(password);
			WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]"));
			login.click();
			 WebElement getstartqueue=driver.findElement(By.xpath("/html/body/div[3]/div[5]/div/div/a"));
				getstartqueue.click();
	}
	public void click_implementation_queue() {
		 WebElement implementqueue=driver.findElement(By.xpath("/html/body/div[2]/ul[1]/a"));
			implementqueue.click();
	}
		public void try_here_btn() {
		WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
	     tryhere.click();
			}
				public void valid_code_applied(String validcode) {
			WebElement editbox = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
			editbox.sendKeys(validcode);
			editbox.sendKeys(Keys.ENTER);
			WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
			   run.click();
		}	
				public void code_valid_is_executed() {
			 String result=driver.findElement(By.xpath("//*[@id=\"output\"]")).getText();
				System.out.println("  valid code  " +  result);
				driver.navigate().back();
				WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
			    tryhere.click();
		}
				 public void invalid_code_is_executed() {
					 WebElement editbx = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
						editbx.sendKeys("ghhtt");
						WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
						   run.click();
					}	
				 public void error_msg_displayed() {
						 Alert alert=driver.switchTo().alert();
							alert.accept();
					System.out.println(" error message : " + alert);
						}
					public void click_implementation_collection() {
						 WebElement implementcollection=driver.findElement(By.xpath("/html/body/div[2]/ul[2]/a"));
							implementcollection.click();
					}
					public void click_implementation_array() {
						 WebElement implementarray=driver.findElement(By.xpath("/html/body/div[2]/ul[3]/a"));
							implementarray.click();
					}
					public void queue_operation() {
						 WebElement queueopera=driver.findElement(By.xpath("/html/body/div[2]/ul[4]/a"));
							queueopera.click();
					}
					public void revert_back() {
						driver.navigate().back();
					}
					public void practice_ques() throws Exception {
						WebElement pracques=driver.findElement(By.xpath("//*[@id=\"content\"]/a"));
						pracques.click();
						TakesScreenshot screenshot=(TakesScreenshot) driver;
						
						File source=screenshot.getScreenshotAs(OutputType.FILE);
						File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\practice_question_queue.png");
						FileHandler.copy(source,destination);
					}
}
