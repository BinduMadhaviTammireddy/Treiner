package co.treiner.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import co.treiner.utilities.ReadConfig;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	
	public static WebDriver driver;
	public static Logger logger;
	public static ReadConfig readconfig= new ReadConfig();
	//public String Home_Url ="https://treiner.co/";
	public String Home_Url = readconfig.getURL();

	@Parameters("browser")
	@BeforeClass(alwaysRun=true)
	public void setup(String browser)
	{
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
			//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");

			driver= new ChromeDriver();	 
		}
		else if(browser.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
			driver= new FirefoxDriver();	
		}
		driver.get(Home_Url);
		//driver.navigate().to(Home_Url);
		logger= Logger.getLogger("treiner");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass(alwaysRun=true)

	public void end()
	{
		driver.quit();
	}
	public void screenwait()
	{
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static String getScreenshot(String screenshotPath) 
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File img =ts.getScreenshotAs(OutputType.FILE);
		//String screenshotPath="./Screenshot/xxx.png";
		File destination =new File(screenshotPath);
		try {
			FileUtils.copyFile(img,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return screenshotPath;
	}
	public void previousPage()
	{
		driver.navigate().back();
	}


	
}
