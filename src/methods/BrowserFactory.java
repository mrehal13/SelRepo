package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	 public static WebDriver driver;

	 public WebDriver getGlobalDriver(String browserType)
	 {
		 System.setProperty("webdriver.gecko.driver", "//Users//mandeeprehal//eclipse-workspace//CDexpire//jars//geckodriver");
		 
		 if(browserType == "firefox")
		 {
			 driver = new FirefoxDriver();
		 }
		 else if(browserType == "chrome")
		 {
			
		 }
		 else if(browserType == "iexplorer")
		 {
			 
		 }
		 return driver;
	 }
}
