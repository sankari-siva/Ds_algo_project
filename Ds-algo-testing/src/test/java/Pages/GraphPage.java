package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GraphPage {
	WebDriver driver=new ChromeDriver();
	public void user_click_to_login() {
		  driver.get("https://dsportalapp.herokuapp.com/");
		    
		driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys("bitbuddies");
		  driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("buddies@123");
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();
	}
	public void getstart() {
		driver.findElement(By.xpath("/html/body/div[3]/div[7]/div/div/a")).click();
	}
	public void clickgraph() {
		driver.findElement(By.xpath("/html/body/div[2]/ul[2]/a")).click();
	}
	//@trybutton
	public void tryhere() {
		WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
	    tryhere.click();
	}
	public void code_to_tryeditor(String validcode) {
		WebElement editbox = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
		editbox.sendKeys(validcode);
		editbox.sendKeys(Keys.ENTER);
	}
	public void run_button() {
		WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
		 run.click();
	}
	public void code_execution() {
		String result=driver.findElement(By.xpath("//*[@id=\"output\"]")).getText();
		System.out.println("  valid code  " +  result);
		driver.navigate().back();
		WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
	    tryhere.click();
	}
	public void invalid_code() {
		WebElement editbx = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
		editbx.sendKeys("ghhtt");
		WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
		   run.click();
	}
	public void alert_alert_error() {
		String alert=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		 System.out.println("The error message in the alert box: " + alert);
		}
	//@reprensentation
	public void navi_graph() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/graph/graph/");
	}
	public void click_graphicalrepresent() {
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/li[2]/a")).click();
	
	}
	}
	
	
	
	
	



