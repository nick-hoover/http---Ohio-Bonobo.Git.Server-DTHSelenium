/**
 * 
 */
package DTH.Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DTH.Pages.DTHURL;
import DTH.Pages.LoginDetails;




/**
 * @author niho0716
 *
 */

public class LoadPage extends DriverSetup {

		
	@Test()
		public void loadPage(){
			driver = new FirefoxDriver();
			driver.manage().window().maximize(); 
			driver.get(DTHURL.PAGE_URL);
				
	}	


	@Test(groups={"loadPage"}, dependsOnMethods="loadPage") 
		public void confirmPageLoads(){
			WebDriverWait wait = new WebDriverWait(driver, 60);
			LoginDetails loginDetails = PageFactory.initElements(driver,LoginDetails.class);
			wait.until(ExpectedConditions.visibilityOf(loginDetails.Field_pass));
	      
	

	
	}			            
}
