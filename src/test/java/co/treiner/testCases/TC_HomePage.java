package co.treiner.testCases;

import org.testng.annotations.Test;
import org.testng.Assert;

import co.treiner.pageObjects.HomePage;

public class TC_HomePage extends Base
{
	@Test
	public void navigationTest()
	{	
		//driver.navigate().to(Home_Url);	
		HomePage _home = new HomePage(driver);
		_home.clickSignup();
		super.screenwait();
		
		if(driver.getTitle().equals("Signup – Treiner: The easy way to compare and book soccer coaches"))
			{
			logger.info("tittle matches the expected title");
				Assert.assertTrue(true);
			}
		else
			{
			logger.error("tittle does not match the expected.");
			Assert.assertTrue(false);
				
			}
		super.previousPage();
		_home.clicklogin();
		super.screenwait();
		
		if(driver.getTitle().equals("Login Page – Treiner: The easy way to compare and book soccer coaches"))
			{
			logger.info("tittle matches the expected title");
			Assert.assertTrue(true);
			}
		else
			{
			logger.error("tittle does not match the expected.");
			Assert.assertTrue(false);
			
			}
		
	
	}
}
