package org.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass { 
		public static WebDriver driver;
		public static Select s;

		public static void browserlaunch() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		public static void clear(WebElement element) {
			element.clear();
		}

		public static void maximizeBrowser() {
			driver.manage().window().maximize();
		}

		public static void launchUrl(String url) {

			driver.get(url);
		}

		public static void enterText(WebElement element, String text) {
			element.sendKeys(text);
		}

		public static String getCurrentPageTitle() {
			String title1 = driver.getTitle();
			return title1;
		}

		public String getCurrentPageUrl() {
			return driver.getCurrentUrl();
		}

		public static String gettext1(WebElement element) {
			return element.getText();
		}

		public static String getAttributeValue(WebElement element, String value) {
			return element.getAttribute(value);
		}

//			radio button,check box,login
		public static void clickElement(WebElement element) {
			element.click();

		}

//			wait
		public static void applyWaitToElements() {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		public void applyWaits(WebElement element, int duration) {
			WebDriverWait wait = new WebDriverWait(driver, duration);
			wait.until(ExpectedConditions.visibilityOf(element));
		}

//			thread.sleep
		public static void sleep(long milliseconds) {
			try {
				Thread.sleep(milliseconds);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public static void closeBrowser() {
			driver.close();
		}

		public static void quitPage() {
			driver.quit();
		}

//			select
		public static void singleDropdownIndex(WebElement element, int value) {
			s = new Select(element);
			s.selectByIndex(value);

		}

		public static void singleDropDownValue(WebElement element, String value) {
			s = new Select(element);
			s.selectByValue(value);
		}

		public static void singleDropDownText1(WebElement element, String text) {
			s = new Select(element);
			s.selectByVisibleText(text);

		}

//		screenshot
		public static void screenshot(String name) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			File src = tk.getScreenshotAs(OutputType.FILE);

			File des = new File(
					"C:\\Users\\gowth\\eclipse-workspace\\photon\\AdactinDatatable\\Takescreenshot\\" + name + ".png");
			try {
				FileUtils.copyFile(src, des);
			} catch (IOException e) {
			}

		}

	}


