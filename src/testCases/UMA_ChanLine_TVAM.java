package testCases;

import methods.BaseClass;
import objectsPkj.UMA_ChanLine_TVAM_pObj;
import methods.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class UMA_ChanLine_TVAM extends BrowserFactory{

	public WebDriver driver = getGlobalDriver("firefox");
	BaseClass baseClass = new BaseClass();
	UMA_ChanLine_TVAM_pObj pObj = new UMA_ChanLine_TVAM_pObj(driver);	

	@Test
	public void UMA_ChanLine_CRM_test()
	{

		baseClass.openULR(driver, "https://uma.att.com/uma/RetrieveChannelLineup?ZIP=92130&FORMAT=XML&APPID=TVAM&CHANNELNO=1634");

		//verify Package 1 ID
		baseClass.verifyTextEqual(pObj.Package_1_ID, "U300LA");

		//verify Package 1 Name
		baseClass.verifyTextEqual(pObj.Package_1_Name, "U300 Latino");

		//verify Package 1 Name
		baseClass.verifyTextEqual(pObj.Package_1_Category, "Basic");

		//verify Package 1 Name
		baseClass.verifyTextEqual(pObj.Package_1_MarketingText, "U300 Latino has over 480 channels. One HD-ready DVR is included.");

		//verify Package 1 Name
		baseClass.verifyTextEqual(pObj.Package_1_StartingPrice, "119");

		//verify Package 1 Name
		baseClass.verifyTextEqual(pObj.Package_1_HDrequired, "Y");

		//verify Package 1 Name
		baseClass.verifyTextEqual(pObj.Package_1_ProductCatalogItemIdentifier, "U300LA");

		//verify Package 1 Name
		baseClass.verifyTextEqual(pObj.Package_1_ProductCatalogComponentCode, "VideoBasic");

		//verify Package 1 Name
		baseClass.verifyTextEqual(pObj.Package_1_ProductCatalogComponentAttribute, "U300LA");

		//verify Package 1 Name
		baseClass.verifyTextEqual(pObj.Package_1_TechnologySurchargeIndicator, "None");		
	}

	@AfterTest
	public void Down()
	{
		driver.quit();
	}
	

}

