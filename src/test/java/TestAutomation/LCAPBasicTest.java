package TestAutomation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import TestAutomation.helpers.Browser;
import TestAutomation.helpers.Config;
import TestAutomation.helpers.TestBase;
import TestAutomation.pageObjects.LCAPHomePage;

public class LCAPBasicTest extends TestBase {

	@Test(dataProvider = "getTestConfig", description = "This testcase is verifying successful buy now click to Midtrans demo site")
	public void testBuyNowClick(Config testConfig) throws InterruptedException

	{
		Browser.openBrowserAndNavigateToUrl(testConfig, "https://www.pyur.com/");

		LCAPHomePage lCAPHomePage = new LCAPHomePage(testConfig);
		
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)testConfig.driver;
		js.executeScript("arguments[0].click();", testConfig.driver.findElement(By.xpath("//button[@data-testid=\"uc-accept-all-button\"]")));
		
		
	
		/*
		 * WebElement we=(WebElement)js.
		 * executeScript("return document.querySelector(\"#usercentrics-root\").shadowRoot.querySelector(\"div > div > div.sc-furwcr.gUvfuk > div > div.sc-jJoQJp.dTzACB > div > div > div.sc-bBHxTw.hgPqkm > div > button:nth-child(5)\")"
		 * );
		 * 
		 * 
		 * js.executeScript("arguments[0].click();", we);
		 */		/*
		 * lCAPHomePage.clickOnHomePage(); lCAPHomePage.dragAndDropElement();
		 * 
		 * lCAPHomePage.tempProMethod();
		 * 
		 * Browser.takeScreenshot(testConfig);
		 * 
		 */
	System.out.println("test");	
	}

	@Test(dataProvider = "getTestConfig", description = "This testcase is verifying successful buy now click to Midtrans demo site")
	public void pyur(Config testConfig)

	{
		Browser.openBrowserAndNavigateToUrl(testConfig, "https://www.pyur.com/");
		LCAPHomePage lCAPHomePage = new LCAPHomePage(testConfig);
		lCAPHomePage.temp2();
		System.out.println("test");

	}

}