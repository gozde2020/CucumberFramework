package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected static WebDriver driver;

	
	public static void setUp() {

		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

		switch (ConfigsReader.getPropValue("browser").toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			throw new RuntimeException("Browser is not supported");
		}

		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getPropValue("ApplicationUrl"));
		PageInitilizer.initializePageObjects();
		
		
	}

	
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}