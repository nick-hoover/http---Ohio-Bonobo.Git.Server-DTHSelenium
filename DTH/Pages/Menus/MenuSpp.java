package DTH.Pages.Menus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by niho0716 on 15/08/2017.
 */
public class MenuSpp {

    @FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[9]/div[1]") public WebElement Button_Configuration;
    @FindBy(xpath="//*[@id=\"menu\"]/div[2]/div[9]/div[3]") public WebElement Button_OrderMaintenance;

}

