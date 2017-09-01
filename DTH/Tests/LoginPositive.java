/**
 * 
 */
package DTH.Tests;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import DTH.Pages.DepartmentAndSkillPopup;
import DTH.Pages.LoginDetails;
import DTH.Pages.Variables;
import DTH.Tests.LoadPage;


/**
 * @author niho0716
 *
 */


public class LoginPositive extends DriverSetup{

	
	
	@Test(dependsOnGroups={"loadPage"})
	public void enterValidUsername(){
		LoginDetails loginDetails = PageFactory.initElements(driver,LoginDetails.class);
		loginDetails.Field_user.sendKeys(Variables.username_valid);				
	}
	
	@Test(dependsOnMethods="enterValidUsername")
	public void enterValidPassword(){
		LoginDetails loginDetails = PageFactory.initElements(driver,LoginDetails.class);
		loginDetails.Field_pass.sendKeys(Variables.password_valid);		
	}
	
	@Test(dependsOnMethods="enterValidPassword")
	public void generateEnvironment(){
		LoginDetails loginDetails = PageFactory.initElements(driver,LoginDetails.class);
		loginDetails.Button_login.click();		
	}

	@Test(dependsOnMethods="generateEnvironment")
	public void verifyEnvironmentDropdown(){
		LoginDetails loginDetails = PageFactory.initElements(driver,LoginDetails.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(loginDetails.DD_selectEnv));
	}
	
	@Test(dependsOnMethods="verifyEnvironmentDropdown")
	public void selectEnvironment() {
		LoginDetails loginDetails = PageFactory.initElements(driver,LoginDetails.class);
		Select env = new Select(loginDetails.DD_selectEnv);
		env.selectByVisibleText(Variables.environment);
	}

	@Test(dependsOnMethods="selectEnvironment")
	public void clickLogin(){
		LoginDetails loginDetails = PageFactory.initElements(driver,LoginDetails.class);
		loginDetails.Button_login.click();
	}
	
	@Test(dependsOnMethods="clickLogin")
	public void verifyDeptAndSkill(){
		DepartmentAndSkillPopup dasp = PageFactory.initElements(driver, DepartmentAndSkillPopup.class);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(dasp.Button_select));	
	}
	
	@Test(groups={"positiveLogin"}, dependsOnMethods="verifyDeptAndSkill")
	public void closeDeptAndSkill(){
		DepartmentAndSkillPopup dasp = PageFactory.initElements(driver, DepartmentAndSkillPopup.class);
		dasp.Button_select.click();
	}
	
}

