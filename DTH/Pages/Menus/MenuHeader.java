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
public class MenuHeader {
	
	@FindBy(xpath= "//*[@id='menu']/div[2]/div[2]/div[1]")	 public WebElement Button_DaVinci;
	@FindBy(xpath= "//*[@id='menu']/div[2]/div[2]/div[4]")	 public WebElement Button_CCP;
	@FindBy(xpath="//*[@id='menu']/div[2]/div[2]/div[4]") 	 public WebElement Button_productCatalogue;
	@FindBy(xpath= "//*[@id='menu']/div[2]/div[2]/div[2]")	 public WebElement Button_docGen;
	@FindBy(xpath="//div[@id='menu']/div[2]/div[2]/div/span") 	 public WebElement Button_LIMS;
	@FindBy(xpath="//*[@id='menu']/div[2]/div[3]")		  	 public WebElement Button_scrollRight;
	@FindBy(xpath="//*[@id='menu']/div[2]/div[2]/div[4]") 	 public WebElement Button_SPP; 
	@FindBy(xpath="//*[@id='menu']/div[2]/div[2]/div[4]") 	 public WebElement Button_crossApp;
	@FindBy(xpath="//*[@id='menu']/div[2]/div[2]/div[4]") 	 public WebElement Button_developers; 
	@FindBy(xpath="//*[@id='menu']/div[1]/div[2]/a[3]/span") public WebElement Button_refresh;
	@FindBy(xpath="//*[@id='menu']/div[1]/div[2]/a[4]/span") public WebElement Button_collapse;
	@FindBy(xpath="//*[@id='menu']/div[1]/div[2]/a[4]/span") public WebElement Button_expand;
	
	
	

}
