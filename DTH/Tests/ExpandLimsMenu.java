package DTH.Tests;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import DTH.Pages.PopupOverlay;
import DTH.Pages.Menus.MenuHeader;
import DTH.Pages.Menus.MenuLims;

public class ExpandLimsMenu extends DriverSetup{
	
	
	@Test(dependsOnGroups="positiveLogin")
	public void LimsButtonPresent() {
		MenuHeader menuHeader = PageFactory.initElements(driver, MenuHeader.class);
		boolean isLimsButtonDisplayed =  menuHeader.Button_LIMS.isDisplayed();
		
		int i = 1;
		while (isLimsButtonDisplayed == false && i < 10 ){
			menuHeader.Button_scrollRight.click();
			i++;
		}
		assert menuHeader.Button_LIMS.isDisplayed(); 
	}	
		
	@Test(dependsOnMethods="LimsButtonPresent")
	public void WaitForOverlayToDisappear(){
		PopupOverlay popupOverlay = PageFactory.initElements(driver, PopupOverlay.class);
		new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOf(popupOverlay.overlay));	
	}
	
	@Test(groups={"openLimsMenu"}, dependsOnMethods="WaitForOverlayToDisappear")
	public void ClickLimsButton(){
		MenuHeader menuHeader = PageFactory.initElements(driver, MenuHeader.class);
		menuHeader.Button_LIMS.click();		
	}
	
	@Test(dependsOnMethods="ClickLimsButton")
	public void verifyMenuIsExpanded(){
		MenuLims menuLims = PageFactory.initElements(driver, MenuLims.class);
		assert menuLims.Button_Configuration.isDisplayed() || menuLims.Button_Utilities.isDisplayed();
	}
}
  

