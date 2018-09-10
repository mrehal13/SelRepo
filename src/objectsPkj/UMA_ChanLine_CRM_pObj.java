package objectsPkj;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class UMA_ChanLine_CRM_pObj
{
	//text below Heading
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/form/div[1]")
	public WebElement Text_BelowHeading;
	
	//ZIP text box
	@FindBy(name = "ZIP")
	public WebElement ZIPtextbox;

	//text below fields
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/form/div[3]")
	public WebElement Text_BelowFields;

	
	//View by Package drop down
	@FindBy(id = "packgeList_select")
	public WebElement ViewByPackage_Dropdown;			

	//text 2 in footer
	@FindBy(xpath = "html/body/div[1]/table/tbody/tr/td/table/tbody/tr[3]/td/div")
	public WebElement Text2_Footer;

	//View By Package drop down
	@FindBy(xpath = ".//*[@id='packgeList_select']")
	public WebElement Package_List;

	//Go button for View By Package drop down
	@FindBy(xpath = "//select[@name='packgeList_select']")
	public WebElement Go_btn_package;

	//Channel Name text box
	@FindBy(xpath = "//input[@name='channelList_select']")
	public WebElement ChannelName_TextBox;
	
	//Go button for Channel Name
	@FindBy(xpath = "//img[@title='Go']")
	public WebElement Go_btn_channel;

	//1st value in result grid under Channel Name column
	@FindBy(xpath = ".//*[@id='channelGuidetBody']/tr[1]/td[2]")	
	public WebElement resultgrid_1st;

	WebDriver driver;

	public UMA_ChanLine_CRM_pObj(WebDriver driver) {

			this.driver = driver;

			PageFactory.initElements(driver, this);

		}

}

