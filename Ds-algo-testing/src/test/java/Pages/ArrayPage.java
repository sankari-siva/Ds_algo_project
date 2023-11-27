package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayPage {
	WebDriver driver=new ChromeDriver();
	public void login_array(String username, String password) {
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
			 WebElement getstartarray=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/a"));
				getstartarray.click();
	}
	public void redirect_to_array()
	{
	  driver.navigate().to("https://dsportalapp.herokuapp.com/array/");
	}
	public void click_python_array() {
		WebElement arrypy=driver.findElement(By.xpath("/html/body/div[2]/ul[1]/a"));
		arrypy.click();
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
	public void array_using_list() {
		WebElement arraylist=driver.findElement(By.xpath("/html/body/div[2]/ul[2]/a"));
	    arraylist.click();
	}
	public void basic_opera_list() {
		WebElement basicopera=driver.findElement(By.xpath("/html/body/div[2]/ul[3]/a"));
	    basicopera.click();
	}
 public void application_of_array() {
	 WebElement applicationarray=driver.findElement(By.xpath("/html/body/div[2]/ul[4]/a"));
	    applicationarray.click();
	}
 public void practice_ques() {
	 WebElement practiceques=driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/a"));
	    practiceques.click();
}
 public void search_array() {
	 WebElement search=driver.findElement(By.xpath("/html/body/div[2]/a"));
	 search.click();
 }
// public String run_result()
//{
//	WebElement runresult=driver.findElement(By.xpath("/html/body/div/div[2]/form/button"));
////	 runresult.click();
//	 runresult.getText();
//	String output = null;
//	return output;
//}
private By driver() {
	// TODO Auto-generated method stub
	return null;
}
public void submit() {
	WebElement submit=driver.findElement(By.xpath("/html/body/div/div[2]/form/input[2]"));
	 submit.click();
}

public void max_consecutive() {
	WebElement max=driver.findElement(By.xpath("/html/body/div[3]/a"));
			max.click();
}
public void revertback() {
	driver.navigate().back();
	}
 }
