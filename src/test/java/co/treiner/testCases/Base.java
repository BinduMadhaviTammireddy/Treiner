package co.treiner.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import co.treiner.utilities.ReadConfig;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	
	public static WebDriver driver;
	public static Logger logger;
	public static ReadConfig readconfig= new ReadConfig();
	//public String Home_Url ="https://treiner.co/";
	public String Home_Url = readconfig.getURL();

	
	@BeforeClass(alwaysRun=true)
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		driver= new ChromeDriver();
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
	public void previousPage()
	{
		driver.navigate().back();
	}
	
}
