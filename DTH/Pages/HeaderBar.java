package DTH.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderBar {

	@FindBy(id="menuhide") 		  public WebElement Button_hideMenu;
	@FindBy(id="help") 			  public WebElement Button_help;
	@FindBy(id="addsession") 	  public WebElement Button_newSession;
	@FindBy(className="username") public WebElement username; 
	
}
