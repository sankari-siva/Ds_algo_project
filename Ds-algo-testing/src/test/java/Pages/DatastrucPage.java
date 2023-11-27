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

public class DatastrucPage {
	WebDriver driver=new ChromeDriver();
	public void login() {
		  driver.get("https://dsportalapp.herokuapp.com/");
 			driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys("bitbuddies");
		  driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("buddies@123");
		  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();
	}
	public void user_click_getstartlink() {
		WebElement getstart=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/a"));
	getstart.click();
	}
	public void user_click_timecomplex() {
		WebElement timecomplex=driver.findElement(By.xpath("/html/body/div[2]/ul/a"));
		timecomplex.click();
			}
	public void try_here() {
		WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
	    tryhere.click();
			}
	public void enter_vaild_code(String validcode) {
		WebElement editbox = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
		editbox.sendKeys(validcode);
		editbox.sendKeys(Keys.ENTER);
	}
	public void runbutton() {
		WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
		   run.click();
			}
	public void code_valid_executed() {
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
	public void error() {
		String alert=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	 System.out.println(" error message : " + alert);
	}
	public void user_isin_datastruct_intropage() {
		  driver.navigate().to("https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/");
	}
	public void click_practiceques() {
		WebElement practiceques=driver.findElement(By.xpath("//*[@id=\"content\"]/a"));
	    practiceques.click();
	}
	public void capture_screenshot() throws Exception {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\practicequespage.png");
		FileHandler.copy(source,destination);
	}
}
