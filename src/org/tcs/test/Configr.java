package org.tcs.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Configr {
@Test
public void getUrl() throws Exception {
	File loc =new File("G:\\project_Workspace\\Selenium\\Configuration\\config.property");
	FileInputStream str=new FileInputStream(loc);
	Properties por=new Properties();
	por.load(str);
	String s = por.getProperty("ChromeDriver");
	System.out.println(s);
}
}
