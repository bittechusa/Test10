package com.bit.ui.automation;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	FirefoxDriver driver;
	@Before
	public void start()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.bluefly.com");
		
	}
	@After
	public void end()
	{
		driver.quit();
	}

}
