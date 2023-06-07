package com.brillio.android;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
public class DemoApp2 {

	public static void main(String[] args)throws MalformedURLException{
		DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability("platformName", "android");
	    cap.setCapability("platformVersion", "9.0");
	    cap.setCapability("deviceName", "Google Pixel 3");
	    cap.setCapability("app", "bs://e9f53b80f2861bc843a277263e740a0116a68037");

	    HashMap<String, String> bstackDetails = new HashMap<String, String>();
	    bstackDetails.put("projectName", "BrillioAppiumSessionProject");
	    bstackDetails.put("buildName", "BrillioAppiumSessionBuild");
	    bstackDetails.put("sessionName", "BrillioAppiumSession");
	    bstackDetails.put("userName", "saylimore_WNeXHv");
	    bstackDetails.put("accessKey", "UxBFACRdmYVnaUBzpZ1y");

	    cap.setCapability("bstack:options", bstackDetails);

	    AppiumDriver driver = new AppiumDriver(new URL("http://hub.browserstack.com/wd/hub"), cap);

	    System.out.println(driver.getPageSource());

	    driver.quit();
	}
}
