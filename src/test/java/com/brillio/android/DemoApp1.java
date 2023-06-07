package com.brillio.android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DemoApp1 {

	public static void main(String[] args)throws MalformedURLException{
		DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability("platformName", "android");
	    cap.setCapability("deviceName", "Phone1");
	    cap.setCapability("appium:app", "C:\\Users\\sayli.patil\\Appium Training\\khan-academy-7-3-2.apk");
	
	    AppiumDriver driver = new AppiumDriver(new URL("http://localhost:4723/wd/hub"), cap);
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text()='Dismiss']")).click();
	
	}

}
