package DTH.Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import DTH.Pages.Menus.MenuDocGen;
import DTH.Pages.Menus.MenuHeader;
import DTH.Pages.Menus.MenuLims;

public class CollapseDocGenMenu extends DriverSetup {

	@Test(dependsOnGroups="openDocGenMenu")
	public void collapseDocGenMennuIfExpanded() {
		MenuDocGen menuDocGen = PageFactory.initElements(driver, MenuDocGen.class);
		if (menuDocGen.Button_Configuration.isDisplayed()) {
			MenuHeader menuHeader = PageFactory.initElements(driver, MenuHeader.class);
			menuHeader.Button_docGen.click();
		}else{
		}
			
		}
		
  }
