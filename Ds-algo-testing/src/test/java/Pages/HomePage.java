package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HomePage {
	WebDriver driver=new ChromeDriver();
	public void open_dsalgo_portal() {
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	public void get_start_click() {
		WebElement getstart=driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
		getstart.click();
	}
	public void sign_in_click_link() throws Exception {
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
			WebElement signin=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]"));
			signin.click();
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File source=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\signin_page.png");
			FileHandler.copy(source,destination);
}
			public void drop_down_click(String menu) throws Exception {
				driver.get("https://dsportalapp.herokuapp.com/");
				driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
			WebElement dpdw1=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/a"));
		    	dpdw1.click();
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File source=screenshot.getScreenshotAs(OutputType.FILE);
				File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\drop_down_options.png");
				FileHandler.copy(source,destination);
				switch (menu) {
		 		case "Arrays":
		 			WebElement array=driver.findElement(By.xpath("//div[@class='dropdown-menu show']"));
		 			array.click();
		 			break;
		 		case "Linkedlist":
		 			WebElement linklist=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[2]"));
		 			linklist.click();
		 		
		 			break;
		 		case "Stack":
		 			WebElement stack=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[3]"));
		 			stack.click();
		 			
		 			break;
		 		case "Queue":
		 			WebElement queue=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[4]"));
		 			queue.click();
		 			
				break;
		 		case "Tree":
		 			WebElement tree=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[5]"));
		 			tree.click();
		 			
		 			break;
		 		case "Graph":
		 			WebElement graph=driver.findElement(By.xpath("//*[@id='navbarCollapse']//a[6]"));
		 			graph.click();
		 		
		 			break;
				}
		 		return;
			}
			public void any_get_start() {
				driver.get("https://dsportalapp.herokuapp.com/");
				driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button")).click();
				WebElement anygetstart=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/a"));
				anygetstart.click();
			}
				public void screen_shot_not_logged_in() throws Exception {
					TakesScreenshot screenshot=(TakesScreenshot) driver;
					File source=screenshot.getScreenshotAs(OutputType.FILE);
						File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\not_loggedin.png");
						FileHandler.copy(source,destination);
				}
				public void register_click_to_register_form() {
					driver.get("https://dsportalapp.herokuapp.com/");
					WebElement getstart=driver.findElement(By.xpath("/html/body/div[1]/div/div/a/button"));
					getstart.click();
					WebElement register=driver.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/a[2]"));
					  register.click();
				}
				public void screen_shot_of_register_form() throws Exception {
					TakesScreenshot screenshot=(TakesScreenshot) driver;
					File source=screenshot.getScreenshotAs(OutputType.FILE);
						File destination=new File("C:\\Users\\15146\\eclipse-workspace\\Dsalgo\\Screenshots\\registerform.png");
						FileHandler.copy(source,destination);
				}
}
//