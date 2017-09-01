/**
 * 
 */
package DTH.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author niho0716
 *
 */
public class DepartmentAndSkillPopup {
	
	@FindBy (id="btn_default_select") public WebElement Button_select;
	@FindBy (id="btn_default_cancel") public WebElement Button_cancel;
	@FindBy (id ="USERCUR") public WebElement DD_currentDepartment;
	@FindBy (id ="USERSKILL") public WebElement DD_currentSkill;
	@FindBy (id ="HELP") public WebElement Button_help;
	@FindBy (className = "ui-icon ui-icon-closethick") public WebElement Button_close;
	
	WebDriver driver;
}
