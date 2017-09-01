/**
 * 
 */
package DTH.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author niho0716
 *
 */
public class LoginDetails {
			
	@FindBy(name="user") public WebElement Field_user;
	@FindBy(name= "pwd") public WebElement Field_pass;
	@FindBy(name = "login") public WebElement Button_login;
	@FindBy(name = "env") public WebElement DD_selectEnv;
	
	
	
	

}
