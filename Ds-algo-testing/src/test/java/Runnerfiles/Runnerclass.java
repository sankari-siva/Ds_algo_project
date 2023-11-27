package Runnerfiles;


	//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
//	import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	//@RunWith(Cucumber.class)
	@CucumberOptions(
			features="src/test/resources/Featurefiles", glue={"Stepdefinitions"},
					monochrome = true, 
          	plugin= {"pretty","html:target/Reports.html"} )

          			
	public class Runnerclass extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel = false)
		public Object[][] scenarios() {

			return super.scenarios();
		}
	}


