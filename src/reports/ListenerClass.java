package reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenerClass extends TestListenerAdapter{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("test case START and details are: " + result.getName());	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case PASS and details are: " + result.getName());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
		System.out.println("test case FAIL and details are: " + result.getName());	
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("test case SKIPPED and details are: " + result.getName());	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {

		
	}

	@Override
	public void onFinish(ITestContext context) {

		
	}

	
}
