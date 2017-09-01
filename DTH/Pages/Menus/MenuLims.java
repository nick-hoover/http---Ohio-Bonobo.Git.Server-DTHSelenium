package DTH.Pages.Menus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author niho0716
 *
 */

public class MenuLims {

	@FindBy(xpath="//*[@id='menu']/div[2]/div[5]/div[1]") public WebElement Button_Configuration; 
	@FindBy(xpath="//*[@id='menu']/div[2]/div[5]/div[3]") public WebElement Button_Utilities;
	
	
}
