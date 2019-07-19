package org.tcs.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	System.setProperty("webdriver.chrome.driver","G:\\project_Workspace\\Selenium\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	}}
//	driver.manage().window().maximize();
//	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
//	
//	@Test
//	public void validate()
//	{
//		String title = driver.getTitle();
//		Assert.assertEquals(true, title);
//	}
//}