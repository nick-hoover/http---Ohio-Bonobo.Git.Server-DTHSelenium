package DTH.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author niho0716
 *
 */


public class CCP_CustSearch {
	
	@FindBy(id="PCSCUST") 	public WebElement Field_custNumber;
	@FindBy(id="PCSLAST") 	public WebElement Field_lastName;
	@FindBy(id="PCSFRST") 	public WebElement Field_firstName;
	@FindBy(id="PCSMOTHER") public WebElement Field_motherName;
	@FindBy(id="PCSEMAL") 	public WebElement Field_email;
	@FindBy(id="PCSTAXNO") 	public WebElement Field_taxNumber;
	@FindBy(id="PCSID") 	public WebElement Field_idCardNumber;
	@FindBy(id="PCSBIRTHP") public WebElement Field_placeOfBirth;
	@FindBy(id="PCSDOB") 	public WebElement dob;
	@FindBy(id="PCSTELN") 	public WebElement telephoneNumber;
	@FindBy(id="PCSSERI") 	public WebElement serialNumber;
	@FindBy(id="PCSWKOD") 	public WebElement workOrderNumber;
	@FindBy(id="PCCSTA") 	public WebElement DD_custStatus;
	@FindBy(id="PCCTYP") 	public WebElement DD_custType;
	@FindBy(id="PCSDESC") 	public WebElement Field_desc;
	@FindBy(id="PCSSTRT") 	public WebElement Field_street;
	@FindBy(id="PCSNUMB") 	public WebElement Field_streetNumber;
	@FindBy(id="PCSUNIT") 	public WebElement Field_unitNumber;
	@FindBy(id="PCSPCDE") 	public WebElement Field_postCode;
	@FindBy(id="PCSCITY") 	public WebElement Field_city;
	@FindBy(id="btn_default_search")  public WebElement Button_search;
	@FindBy(id="btn_default_history") public WebElement Button_history;
	@FindBy(id="btn_default_cancel")  public WebElement Button_cancel;
	@FindBy(xpath="//*[@id='PCC0001_WGT']/div[1]/div/a/span") public WebElement collapse;
	
	
	
	

}
