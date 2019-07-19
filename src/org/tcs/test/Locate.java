package org.tcs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"G:\\project_Workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	WebElement txtusername=driver.findElement(By.id("email"));
	txtusername.sendKeys("praveenreddy42@gmail.com");
	WebElement password=driver.findElement(By.id("pass"));
	password.sendKeys("1reddy12@");
	driver.quit();
}
}
