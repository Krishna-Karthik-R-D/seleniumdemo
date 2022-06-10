package listner;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerTest implements ITestListener {

	public void onFinish(ITestContext context) {
		Reporter.log("test finshed",true);
	}

	public void onStart(ITestContext context) {
		Reporter.log("test Onstart",true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("test failed with percentage",true);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		TakesScreenshot shot  = (TakesScreenshot)Demo_listner.driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("./screenshot/"+"a.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("test skipped",true);
	}

	public void onTestStart(ITestResult result) {
		Reporter.log("test started",true);
	}

	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("test success",true);
	}
	
	

}
