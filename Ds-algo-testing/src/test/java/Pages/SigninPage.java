package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SigninPage {
	WebDriver driver=new ChromeDriver();
    boolean isRequired;
	
	public void click_sign_inlink() {
		driver.get(" https://dsportalapp.herokuapp.com/home/");
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();		
	}
		
	public void login_page() {
     driver.get("https://dsportalapp.herokuapp.com/login");
	}
	
	public Boolean doLogin(String username, String password) {
		WebElement usernamebtn=driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
		WebElement passwrdbtn=driver.findElement( By.xpath("//*[@id=\'id_password\']"));
		usernamebtn.clear();
		usernamebtn.sendKeys(username);
		passwrdbtn.clear();
    	passwrdbtn.sendKeys(password);
   		// To check empty fields , we need to check "required" field is on an attribute
		if (username.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", usernamebtn);
			return isRequired;
		} else if (password.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", passwrdbtn);
			return isRequired;
		}
		return isRequired;
	}

	// input fields empty -click login
//	public void login_button() {
//		WebElement loginbtn=driver.findElement(By.xpath("//*[@value='Login']"));
//		loginbtn.click();
//	}
	// login for excel sheet data
	public void click_login() {
	WebElement loginbtn=driver.findElement(By.xpath("//*[@value='Login']"));
		loginbtn.click();
	}
		//WebElement alert=driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	//	String res= driver.switchTo().alert().getText();
	//	return res;
	
	public void register_link() {
		WebElement registerbtn=driver.findElement(By.xpath("//a[@href='/register']"));
		registerbtn.click();
	}
	public String register_page() {
		String Title = driver().getTitle();
		return Title;
	}
	private WebDriver driver() {
		// TODO Auto-generated method stub
		return null;
	}
	public void signout() {
		WebElement signoutbtn=driver.findElement(By.xpath("//a[@href='/logout']"));
		signoutbtn.click();
		}
	public void getexcelfilepath() {
		driver().get("./src/test/resources/Exceldata/Login.xlsx");
	}

	public void userfield_enter(String name) {
		WebElement uname= driver.findElement(By.xpath("//*[@id=\"id_username\"]"));
				uname.sendKeys(name);
		
	
}
}
