package DTH.Tests;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import DTH.Pages.PopupOverlay;
import DTH.Pages.Menus.MenuDocGen;
import DTH.Pages.Menus.MenuHeader;

public class ExpandDocGenMenu extends DriverSetup{

	@Test(dependsOnGroups="positiveLogin")
	public void DocGenButtonPresent() {
		MenuHeader menuHeader = PageFactory.initElements(driver, MenuHeader.class);
		boolean isDocGenButtonDisplayed =  menuHeader.Button_docGen.isDisplayed();
		
		int i = 1;
		while (isDocGenButtonDisplayed == false && i  < 10){
			menuHeader.Button_scrollRight.click();
			
			i++; 
		}
				
		assert menuHeader.Button_docGen.isDisplayed(); 
				
	}	
		
	@Test(dependsOnMethods="DocGenButtonPresent")
	public void WaitForOverlayToDisappear(){
		PopupOverlay popupOverlay = PageFactory.initElements(driver, PopupOverlay.class);
		new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOf(popupOverlay.overlay));	
	}
	
	@Test(groups={"openDocGenMenu"}, dependsOnMethods="WaitForOverlayToDisappear")
	public void ClickDocGenButton(){
		MenuHeader menuHeader = PageFactory.initElements(driver, MenuHeader.class);
		menuHeader.Button_docGen.click();
		
	
	}
	
	@Test(dependsOnMethods="ClickDocGenButton")
	public void verifyMenuIsExpanded(){
		MenuDocGen menuDocGen = PageFactory.initElements(driver, MenuDocGen.class);
		assert menuDocGen.Button_Configuration.isDisplayed() || menuDocGen.Button_DocumentGenerator.isDisplayed(); 
	}
}