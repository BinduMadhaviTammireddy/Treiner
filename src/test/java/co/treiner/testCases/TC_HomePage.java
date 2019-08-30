package co.treiner.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import co.treiner.pageObjects.HomePage;

public class TC_HomePage extends Base
{
	@Test
	public void navigationTest()
	{	
		driver.navigate().to(Home_Url);	
		HomePage _home = new HomePage(driver);
		_home.clickSignup();
		super.screenwait();
		
		if(driver.getTitle().equals("Signup – Treiner: The easy way to compare and book soccer coaches"))
			{
				Assert.assertTrue(true);
			}
		else
			{
				Assert.assertTrue(false);
			}
		super.previousPage();
		_home.clicklogin();
		super.screenwait();
		
		if(driver.getTitle().equals("Login Page – Treiner: The easy way to compare and book soccer coaches"))
			{
				Assert.assertTrue(true);
			}
		else
			{
				Assert.assertTrue(false);
			}
		
	
	}
}
