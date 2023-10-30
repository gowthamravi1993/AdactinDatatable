package org.adactinstepdefinition;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.logging.LogManager;

import org.apache.commons.compress.archivers.zip.ZipArchiveEntry.CommentSource;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends AdactinBaseClass {
	
	@Before
	public void browser() {
		browserlaunch();
		maximizeBrowser();
		applyWaitToElements();
	}

	
	


	
	@After
	public void afterScenareio(Scenario scenario) {

		String scenarioName = scenario.getName();
		screenshot(scenarioName);
		closeBrowser();
		
	}
	/*
	 * @After() public static void screenshot(Scenario scenario) throws
	 * InterruptedException{ Thread.sleep(3000);
	 * 
	 * String name = scenario.getName();
	 * 
	 * 
	 * TakesScreenshot tk= (TakesScreenshot) driver; File
	 * src=tk.getScreenshotAs(OutputType.FILE); // File des = new File(
	 * "C:\\Users\\gowth\\eclipse-workspace\\photon\\AdactinDatatable\\Takescreenshot\\"+name+"
	 * .png"); File des=new File(
	 * "C:\\Users\\gowth\\eclipse-workspace\\photon\\AdactinDatatable\\takescreenshot\\"+name+"
	 * .png");
	 * 
	 * 
	 * try { FileUtils.copyFile(src, des); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * 
	 * closeBrowser();
	 * 
	 * }
	 */
	
	
	
	
//	
//	public void takeScraenshotOnFailure(Scenario scenario) {
//
//		if (scenario.isFailed()) {
//
//		TakesScreenshot ts = (TakesScreenshot) driver;
//
//		byte[] src = ts.getScreenshotAs(Qut.BYTES);
//		scenario.attach(src, "image/png", "screenshot");
//		}
//
//		}
	
//	public static byte[] getByteScreenshot() throws IOException 
//	{
//	    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	    byte[] fileContent = FileUtils.readFileToByteArray(src);
//	    return fileContent;
//	}

		
	}


