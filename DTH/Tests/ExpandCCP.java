package DTH.Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import DTH.Pages.PopupOverlay;
import DTH.Pages.Menus.MenuCcp;
import DTH.Pages.Menus.MenuHeader;

public class ExpandCCP extends DriverSetup {
	
	@Test(dependsOnGroups="positiveLogin")
	public void CcpButtonPresent() {
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//MenuHeader menuHeader = PageFactory.initElements(driver, MenuHeader.class);
		//menuHeader.Button_CCP.click();
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/div[3]/span")).click();
		
		driver.findElement(By.xpath("//*[contains(@class,'modbutton') and contains (@title, 'Sales Partner Portal')]")).click();
	
	}
		/*boolean invisible = wait.until(ExpectedConditions.invisibilityOf(menuHeader.Button_CCP));
		
		boolean isCcpButtonDisplayed =  menuHeader.Button_CCP.isDisplayed();
		do {menuHeader.Button_scrollRight.click();	
		} while (invisible == false); 
		}
		
		
		MenuHeader menuHeader = PageFactory.initElements(driver, MenuHeader.class);
		boolean isCcpButtonDisplayed =  menuHeader.Button_CCP.isDisplayed();
			
		int i = 1;
		while (isCcpButtonDisplayed == false && i  < 10){
			menuHeader.Button_scrollRight.click();
			
			i++; 
		}
				
		assert menuHeader.Button_CCP.isDisplayed(); 
				
	}	
	*/
	
	@Test(dependsOnMethods="CcpButtonPresent")
	public void WaitForOverlayToDisappear(){
		PopupOverlay popupOverlay = PageFactory.initElements(driver, PopupOverlay.class);
		new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOf(popupOverlay.overlay));	
	}
	
	@Test(groups={"openCcpMenu"}, dependsOnMethods="WaitForOverlayToDisappear")
	public void ClickCCPButton(){
		MenuHeader menuHeader = PageFactory.initElements(driver, MenuHeader.class);
		menuHeader.Button_CCP.click();
		
	
	}
	
	@Test(dependsOnMethods="ClickCCPButton")
	public void verifyMenuIsExpanded(){
		MenuCcp menuCcp = PageFactory.initElements(driver, MenuCcp.class);
		assert menuCcp.Button_Configuration.isDisplayed() || menuCcp.Button_Authorities.isDisplayed() || menuCcp.Button_CustomerServices.isDisplayed();
	}
}
