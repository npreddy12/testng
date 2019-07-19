package org.tcs.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"G:\\project_Workspace\\Selenium\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

//driver.get("http://demo.guru99.com/test/web-table-element.php");
//List<WebElement> w=driver.findElements(By.xpath("tr"));
//for(int i=0;i<=w.size();i++) {
//	WebElement w1=w.get(i);
//	List<WebElement> tdata = driver.findElements(By.xpath("td"));
//	for(int j=0;j<=tdata.size();j++) {
//		WebElement w2 = tdata.get(j);
//		System.out.println(w2.getText());
//	}
//	driver.quit();
driver.get("http://demo.guru99.com/test/radio.html");
WebElement radio = driver.findElement(By.xpath("//input[@id=\"vfb-7-2\"]"));
radio.click();
String s=radio.getText();
System.out.println(s);
WebElement checkbox = driver.findElement(By.xpath("//input[@type=\"checkbox\" and @id=\"vfb-6-0\"]"));
checkbox.click();
System.out.println(checkbox.getText());


//driver.quit();
}
}
