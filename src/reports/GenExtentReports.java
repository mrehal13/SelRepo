package reports;

import java.io.File;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenExtentReports {

	ExtentReports extRep;
	ExtentTest extTest;
	
	@BeforeTest
	public void startTest()
	{
		extRep = new ExtentReports(System.getProperty("user.dir" + "/testing-output/myreport1.html"), true);
		extRep.addSystemInfo("Host Name", "Mandeep Rehal");
		extRep.addSystemInfo("Environment", "Automation Testing fr UMA app");
		extRep.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));
	}
	
	@AfterMethod
	public void endReport(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			extTest.log(LogStatus.FAIL, result.getThrowable());
		}
		extRep.endTest(extTest);
	}
	
	@AfterTest
	public void endTest()
	{
		extRep.flush();
		//extRep.endTest(extTest);
		extRep.close();
	}
}
