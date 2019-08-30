package co.treiner.testCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public String Home_Url ="https://treiner.co/";
	public static WebDriver driver;
	
	@BeforeClass(alwaysRun=true)
	public void setup()
	{
		System.out.println("+++++!++++++");
		//System.setProperty("webdriver.chrome.driver", "/Users/bindumadhavitammireddy/sel_testing/bindu.testing.selenium/Drivers/chromedriver");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver");
		
		System.out.println("8yiugj");
		driver= new ChromeDriver();
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
