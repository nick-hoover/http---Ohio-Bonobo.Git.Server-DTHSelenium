package DTH.Pages.Menus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by niho0716 on 15/08/2017.
 */
public class MenuCcp {

    @FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[10]/div[1]") public WebElement Button_Configuration;
    @FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[10]/div[3]") public WebElement Button_Authorities;
    @FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[10]/div[5]") public WebElement Button_CustomerServices;

}
