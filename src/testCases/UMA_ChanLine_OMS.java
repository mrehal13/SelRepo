package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import methods.*;
import objectsPkj.UMA_ChanLine_OMS_pObj;;

public class UMA_ChanLine_OMS extends BrowserFactory
{
	public WebDriver driver = getGlobalDriver("firefox");
	BaseClass baseClass = new BaseClass();
	UMA_ChanLine_OMS_pObj pObj = new UMA_ChanLine_OMS_pObj(driver);

	@Test
	public void UMA_ChanLine_OMS_test() throws Exception
	{

		baseClass.openULR(driver, "https://uma.att.com/uma/RetrieveChannelLineup?ZIP=75080&FORMAT=IFRAME&APPID=OMS");
		Thread.sleep(3000);
		//verify text below heading
		baseClass.verifyTextEqual(pObj.Text_BelowHeading, "Enter your zip code below. This enables us to give you an accurate channel line-up.");

		//verify value in text below heading
		baseClass.verifyAttributeValue(pObj.ZIPtextbox, "75080");

		//verify text below fields	
		baseClass.verifyTextEqual(pObj.Text_BelowFields, "Use the search to filter your view or click on the column header to sort your results.                ");

		//verify text 1 in footer	
		baseClass.verifyTextContains(pObj.Text1_Footer, "1. Regional Sports Network Channels available in select markets only and vary by market. They are not available nationwide.");

		//verify text 2 in footer
		baseClass.verifyTextContains(pObj.Text2_Footer, "2. Some national channels have regional variants that may not be available to all subscribers (e.g., A&E / A&E-West).");

		//enter text in channel name text box
		baseClass.enterText(pObj.ChannelName_TextBox, "AWE");		

		//click Go button
		baseClass.click(pObj.Go_button);

		//Thread.sleep(5000);

		//verify value in result grid 

		baseClass.SwitchToFrame(driver);
		baseClass.verifyTextContains(pObj.resultgrid_1st, "AWE");
		baseClass.SwitchToDefaultFrame(driver);

	}

	

}

