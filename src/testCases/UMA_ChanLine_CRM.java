package testCases;

import methods.BaseClass;
import methods.BrowserFactory;
import objectsPkj.UMA_ChanLine_CRM_pObj;
import reports.GenExtentReports;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UMA_ChanLine_CRM extends BrowserFactory{

	public WebDriver driver = getGlobalDriver("firefox");
	BaseClass baseClass = new BaseClass();
	UMA_ChanLine_CRM_pObj pObj = new UMA_ChanLine_CRM_pObj(driver);
	GenExtentReports reprt = new GenExtentReports();
	
	@BeforeTest
	public void init(){
		baseClass.openULR(driver, "https://uma.att.com/uma/RetrieveChannelLineup?ZIP=47302&FORMAT=IFRAME&APPID=CRM");
		driver.manage().window().maximize();
	}
	
	@Test
	public void VerifyTextBelowHeading(){
		//verify text below heading
		baseClass.verifyTextEqual(pObj.Text_BelowHeading, "Enter your zip code below. This enables us to give you an accurate channel line-up.");
	}

	@Test
	public void VerifyZIPCodeInTextBox(){
		//verify value in text below heading
		baseClass.verifyAttributeValue(pObj.ZIPtextbox, "47302");
	}
	
	@Test
	public void VerifyTextBelowFields(){
		//verify text below fields	
		baseClass.verifyTextEqual(pObj.Text_BelowFields, "Use the dropdown to filter your view or click on the column header to sort your results.                ");
	}
	
	@Test
	public void VerifySearchFunctionality(){
		//enter text in channel name text box
		baseClass.enterText(pObj.ChannelName_TextBox, "AWE");		
		//click Go button
		baseClass.click(pObj.Go_btn_channel);
		//Thread.sleep(5000);
		//verify value in result grid 
		baseClass.SwitchToFrame(driver);
		baseClass.verifyTextContains(pObj.resultgrid_1st, "AWE");
		baseClass.SwitchToDefaultFrame(driver);
		baseClass.ListSelect(pObj.Package_List, "200ALL");
		baseClass.click(pObj.Go_btn_package);
		baseClass.SwitchToFrame(driver);
		baseClass.verifyTextContains(pObj.resultgrid_1st, "A&E");
		baseClass.SwitchToDefaultFrame(driver);
	}
	
	@AfterTest
	public void Down()
	{
		driver.quit();
	}

}

