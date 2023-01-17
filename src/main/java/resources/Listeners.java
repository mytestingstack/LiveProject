package resources;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import base.BasePage;

public class Listeners extends BasePage implements ITestListener {

	public Listeners() throws IOException {
		super();
	}

	public void onTestFailure(ITestResult result) {

		try {
			takeSnapShot(result.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
