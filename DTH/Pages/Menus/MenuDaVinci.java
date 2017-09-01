package DTH.Pages.Menus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuDaVinci {
	
	@FindBy(xpath="//*[@id='menu']/div[2]/div[7]/div[1]") public WebElement Button_Configuration;
	@FindBy(xpath="//*[@id='menu']/div[2]/div[7]/div[3]") public WebElement Button_FileExtract;

}
