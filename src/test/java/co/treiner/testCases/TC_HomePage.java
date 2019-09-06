package co.treiner.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;


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
				AssertJUnit.assertTrue(true);
				
				logger.info("tittle matches the expected title");
			}
		else
			{
				AssertJUnit.assertTrue(false);
				logger.error("tittle does not match the expected.");
			}
		super.previousPage();
		_home.clicklogin();
		super.screenwait();
		
		if(driver.getTitle().equals("Login Page – Treiner: The easy way to compare and book soccer coaches"))
			{
				AssertJUnit.assertTrue(true);
			}
		else
			{
				AssertJUnit.assertTrue(false);
			}
		
	
	}
}
