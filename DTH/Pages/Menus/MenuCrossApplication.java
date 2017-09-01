/**
 * 
 */
package DTH.Pages.Menus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author niho0716
 *
 */
public class MenuCrossApplication {
	
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[11]/div[1]") public WebElement Button_Configuration;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[11]/div[3]") public WebElement Button_FileMaintenance;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[11]/div[5]") public WebElement Button_Services;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[11]/div[7]") public WebElement Button_Performance;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[11]/div[9]") public WebElement Button_Audit;
	@FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[11]/div[11]") public WebElement Button_Utilities; 
	

}
