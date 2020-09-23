package com.hrms.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hrms.testbase.BaseClass;
import com.hrms.testbase.PageInitilizer;

public class CommonMethods extends PageInitilizer{
	
	/*
	 * 
	 * methods that sends text to any 
	 * @param element
	 * @param text
	 * 
	 */
	public static void sendText(WebElement element,String text ) {
		
		
		element.clear();
		element.sendKeys(text);
	}

	
	/*
	 *  Method return Object of JavaScript Executor type
	 * 
	 * @return js object
	 * 
	 * 
	 * 
	 */
	
	public static JavascriptExecutor getJSExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}
	/*
	 * methods performs click using JavasCRIP EXECUTOR
	 * 
	 * @param pixel
	 * 
	 */
	
	public static void jsClick(WebElement element) {
		getJSExecutor().executeScript("arguments[0].click();", element);
	}
	
	/*
	 * methods scroll up  using JavasCRIP EXECUTOR
	 * 
	 * @param pixel
	 * 
	 */
	public static void scrollUp (int pixel) {
		getJSExecutor().executeScript("window.scrollBy(0,-"+pixel+")");
		
	}
	/*
	 * methods scroll down  using JavasCRIP EXECUTOR
	 * 
	 * @param pixel
	 * 
	 */
	
	public static void scrollDown (int pixel) {
		getJSExecutor().executeScript("window.scrollBy(0,"+pixel+")");
		
	}
	
	/*
	 * methods object of explicit wait 
	 * 
	 * @param pixel
	 * 
	 */
	
	public static WebDriverWait getWaitObject() {
		
		return new  WebDriverWait(driver,Constants.EXPLICIT_WAIT_TIME);
		
	}
	
	public static void waitForClickability (WebElement element) {
		getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public static void click(WebElement element) {
		waitForClickability(element);
		
		element.click();
	}
	
	public static void waitForVisibility (WebElement element) {
			getWaitObject().until(ExpectedConditions.visibilityOf(element));
		}
		
		

	/**
	 * Method that will take a screenshot and store with name in specified location with .png extension
	 * @param fileName
	 */
	public static byte[] takeScreenshot(String fileName) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
		File src = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(Constants.SCREENSHOT_FILEPATH + fileName +getTimeStamp()+ ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bytes;
	}
	
	public static String getTimeStamp() {
		
		Date date = new Date();
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
		return sdf.format(date);
		
	}
	
	/*
	 * This method will click on checkbox or radio button by the 
	 * given web elements and value
	 * 
	 * @param radiocheckboxes
	 * @param value
	 * 
	 */
	
	public static void clickRadioOrCheckBox(List<WebElement>radioOrCheckBoxes, String value) {
		
		String actualValue;
		for(WebElement radioOrCheckbox:radioOrCheckBoxes) {
			actualValue = radioOrCheckbox.getAttribute("value").trim(); //trim is for "   male   " clean up
			if(radioOrCheckbox.isEnabled() && actualValue.equals(value)) {
				jsClick(radioOrCheckbox);//regular click'te visibility var
				break;
			}
		}
	}
	
	/*
	 * this method will select an option from the dropdown by 
	 * the given web element and visible text value 
	 * 
	 * @param dd
	 * @param visibleTextOrValue
	 * 
	 */
	
	public static void selectDDValue(WebElement dd, String visibleTextOrValue) {
		Select select = new Select(dd);
		List<WebElement> options = select.getOptions();
		for(WebElement option : options) {
			if(option.getText().equals(visibleTextOrValue)) {
				select.selectByVisibleText(visibleTextOrValue);
				break;
			}
		}
		
	}
	
	/**
	 * this method will select an option from the dropdown by the given webelement
	 * and index
	 * 
	 * @param dd
	 * @param visibleTextOrValue
	 */
	public static void selectDDValue(WebElement dd, int index) {
		try {
		Select select = new Select(dd);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		if(size>index) {
			select.selectByIndex(index);
		}
		}catch(UnexpectedTagNameException e) {
			e.printStackTrace();
		}
		
		}
		
		/**
		 * this method will switch to a frame by the given frame weblement
		 * @param iFrame
		 */
		public static void switchToFrame(WebElement iFrame) {
			try {
				driver.switchTo().frame(iFrame);
			} catch (NoSuchFrameException e) {
				e.printStackTrace();
			}
			
		}
		
		/**
		 * this method will switch to a frame by the given frame index
		 * @param frameIndex
		 */
		public static void switchToFrame(int frameIndex) {
			try {
				driver.switchTo().frame(frameIndex);
			} catch (NoSuchFrameException e) {
				e.printStackTrace();
			}
			
		}
		
		/**
		 * this method will switch to a frame by the given frame nameOrId
		 * @param nameOrId
		 */
		public static void switchToFrame(String nameOrId) {
			try {
				driver.switchTo().frame(nameOrId);
			} catch (NoSuchFrameException e) {
				e.printStackTrace();
			}
			
		}
		
		/**
		 * this method will switch to a child window
		 */
		public static void switchToChildWindow() {
			String mainWindow = driver.getWindowHandle();
			Set<String> allWindows = driver.getWindowHandles();
			for (String window : allWindows) {
				if(!window.equals(mainWindow)) {
					driver.switchTo().window(window);
					break;
				}
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

