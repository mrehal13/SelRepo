package methods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.google.common.base.Verify;

public class BaseClass
{
	public void openULR(WebDriver mDriver, String URL_to_Open)
	{
		mDriver.get(URL_to_Open);
	}

	public void verifyTextEqual(WebElement actualTextXpath, String expectedText)
	{
		Assert.assertEquals(actualTextXpath.getText(), expectedText);
	}

	public void verifyTextContains(WebElement xpathID, String expected)
	{
		String fieldActual = xpathID.getText();
		Assert.assertTrue(fieldActual.contains(expected));
	}

	public void ListSelect(WebElement xpathID, String value)
	{
		Select dropdown = new Select(xpathID);
		dropdown.selectByValue(value);
	}

	

	public void enterText(WebElement xpathID, String textToEnter)

	{

		xpathID.sendKeys(textToEnter);

	}

	

	public void verifyAttributeValue(WebElement xpathID, String expectedValue)

	{

		String attValuetext = xpathID.getAttribute("value");

		Assert.assertEquals(attValuetext, expectedValue);

	}

	

	

	

	public void click(WebElement xpathID)

	{

		xpathID.click();

	}

		

	public void verifyHREFLink(WebElement xpathID, String expectedLink)

	{

		String hrefValue = xpathID.getAttribute("href");

		Assert.assertEquals(hrefValue, expectedLink);		

	}



	public void SwitchToFrame(WebDriver mDriver)

	{

		if (mDriver.findElement(By.tagName("iframe")).getTagName()!=null )

		{ 

			List<WebElement> iframes=mDriver.findElements(By.tagName("iframe"));

			//System.out.println("no of frames found " + iframes.size());

			

			for(int i=0; i<iframes.size(); i++)

			{

				if(iframes.get(i).isDisplayed())

				{

					String FrameName = iframes.get(i).getAttribute("name");

					if(iframes.get(i).getAttribute("name").equals(""))

					{

						FrameName = iframes.get(i).getAttribute("id");

					}

					mDriver.switchTo().frame(FrameName);

					break;		

				}

			}

		}

		else{

			System.out.println("no size/iframe found");

		}

	}



	public void SwitchToDefaultFrame(WebDriver mDriver)

	{

		mDriver.switchTo().defaultContent();

	}

	

	public void wait5Sec() throws Throwable

	{

		Thread.sleep(5000);

	}

}

