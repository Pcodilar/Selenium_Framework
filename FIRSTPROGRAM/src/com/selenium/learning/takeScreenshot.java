package com.selenium.learning;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class takeScreenshot {
	
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver", "/home/codilar/seleniumSetup/chromedriver");
	
    WebDriver driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      
      driver.get("http://google.com/");
      
      
      File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       
		FileUtils.copyFile(src,new File("/home/codilar/screenshot.png"));

}
}
//driver.manage().deleteCookieNamed("sessionkey");// click on any link n verify login page
