package co.treiner.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig 
{
	
	Properties properties; 
	public ReadConfig() 
	{
		File src= new File("./Configurations/config.properties");
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			properties =new Properties();
			properties.load(fis);
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	public String getURL()
	{
		String Home_Url= properties.getProperty("Home_Url");
		return Home_Url;
	}
	public String getChromePath()
	{
		String ChromePath =properties.getProperty("ChromePath");
		return ChromePath;
	}
	public String getFirefoxPath()
	{
		String FirefoxPath =properties.getProperty("FirefoxPath");
		return FirefoxPath;
	}
	
	
}
