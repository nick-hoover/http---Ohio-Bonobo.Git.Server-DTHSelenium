package DTH.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DTH.Pages.Menus.MenuHeader;
import DTH.Pages.Menus.MenuLims;

public class CollapseLimsMenu extends DriverSetup  {
  
	@Test(dependsOnGroups="openLimsMenu")
	public void collapseLimsMennuIfExpanded() {
		MenuLims menuLims = PageFactory.initElements(driver, MenuLims.class);
		if (menuLims.Button_Configuration.isDisplayed()) {
			MenuHeader menuHeader = PageFactory.initElements(driver, MenuHeader.class);
			menuHeader.Button_LIMS.click();
		}else{
		}
			
		}
		
  }

