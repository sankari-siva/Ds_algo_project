package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Treepage {
	
		WebDriver driver=new ChromeDriver();
		public void login_tree(String username, String password) {
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
				 WebElement getstarttree=driver.findElement(By.xpath("/html/body/div[3]/div[6]/div/div/a"));
					getstarttree.click();
		}
	public void click_overview_tree() {
		 WebElement overviewof=driver.findElement(By.xpath("/html/body/div[2]/ul[1]/a"));
			overviewof.click();
	}
	public void get_url()
	{
		String get_url=driver().getCurrentUrl();
		System.out.println("Url of tryeditor page"+ get_url );
	}
	private WebDriver driver() {
		// TODO Auto-generated method stub
		return null;
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
	public void terminologies() {
		WebElement terminology=driver.findElement(By.xpath("/html/body/div[2]/ul[2]/a"));
		terminology.click();
	}
	public void types_of_trees() {
		WebElement typesoftrees=driver.findElement(By.xpath("/html/body/div[2]/ul[3]/a"));
		   typesoftrees.click();
		
	}
	public void tree_traversal() {
		WebElement treetraversal=driver.findElement(By.xpath("/html/body/div[2]/ul[4]/a"));
		  treetraversal.click();
	}
	public void tree_illustartion() {
		WebElement treeillus=driver.findElement(By.xpath("/html/body/div[2]/ul[5]/a"));
		 treeillus.click();
	}
	public void binary_trees() {
		WebElement binarytree=driver.findElement(By.xpath("/html/body/div[2]/ul[6]/a"));
		  binarytree.click();
	}
	public void types_binary_tree() {
		WebElement typesofbinary=driver.findElement(By.xpath("/html/body/div[2]/ul[7]/a"));
		  typesofbinary.click();
	}
	public void implematation_binary() {
		WebElement implebinary=driver.findElement(By.xpath("/html/body/div[2]/ul[10]/a"));
		  implebinary.click();
	}
	public void apllication_binary() {
		WebElement applibinary=driver.findElement(By.xpath("/html/body/div[2]/ul[11]/a"));
		 applibinary.click();
	}
	public void search_binary() {
		WebElement searchbinary=driver.findElement(By.xpath("/html/body/div[2]/ul[12]/a"));
		 searchbinary.click();
	}
	public void implematation_BST() {
		WebElement bts=driver.findElement(By.xpath("/html/body/div[2]/ul[13]/a"));
		  bts.click();
	}public void implematation_python() {
		WebElement implepython=driver.findElement(By.xpath("/html/body/div[2]/ul[13]/a"));
		  implepython.click();
	}public void binary_tree_traversal() {
		WebElement binarytreetraversal=driver.findElement(By.xpath("/html/body/div[2]/ul[13]/a"));
		  binarytreetraversal.click();
	}
	public void practice_ques() {
		driver.navigate().back();
		WebElement practice=driver.findElement(By.xpath("//*[@id=\"content\"]/a"));
		practice.click();
		WebElement signout=driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]"));
		signout.click();
					}
}
