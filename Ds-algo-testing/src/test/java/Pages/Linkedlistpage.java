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

public class Linkedlistpage {
	WebDriver driver=new ChromeDriver();
public void login	(String username, String password) {
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
		 WebElement getstartlinklist=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/a"));
			getstartlinklist.click();
 }
 public void click_introduction_link() {
	 WebElement introlink=driver.findElement(By.xpath("/html/body/div[2]/ul[1]/a"));
		introlink.click();
}
 public void try_here_btn() {
	 WebElement tryhere=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a"));
     tryhere.click();
}
 public void validcode_applied(String validcode) {
	 WebElement editbox = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
		editbox.sendKeys(validcode);
		editbox.sendKeys(Keys.ENTER);
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
 public void invalid_code_executed() {
	 WebElement editbx = driver.findElement(By.xpath("/html/body/div/div/form/div/div/div[1]/textarea"));
		editbx.sendKeys("ghhtt");
		WebElement run=driver.findElement(By.xpath("/html/body/div/div/form/button"));
		   run.click();
	}
public void error_msg() {
	 Alert alert=driver.switchTo().alert();
		alert.accept();
System.out.println(" error message : " + alert);
	}
public void creting_linklist() {
	WebElement createlinklist=driver.findElement(By.xpath("/html/body/div[2]/ul[2]/a"));
    createlinklist.click();
}
public void traversal_link() {
	WebElement traversallink=driver.findElement(By.xpath("/html/body/div[2]/ul[5]/a"));
    traversallink.click();
	}
public void insertion_link() {
	WebElement insertionlink=driver.findElement(By.xpath("/html/body/div[2]/ul[6]/a"));
   insertionlink.click();
}
public void deletion_link() {
	WebElement deletionlink=driver.findElement(By.xpath("/html/body/div[2]/ul[7]/a"));
	  deletionlink.click();
	}
public void practice_link() {
	
	WebElement practicelink=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/a"));
	  practicelink.click();
}
private WebDriver driver() {
	// TODO Auto-generated method stub
	return null;
}
public void practice_page_screenshot() throws Exception {
	  TakesScreenshot screenshot=(TakesScreenshot) driver;
			File source=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\practice_ques_page.png");
			FileHandler.copy(source,destination);
}
}
