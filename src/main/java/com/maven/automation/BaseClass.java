package com.maven.automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	public static void passValue(WebElement ele,String email) {
		ele.sendKeys(email);
	}
	
	public static void ClickElement(WebElement ele) {
		ele.click();
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	
	
	public static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Dri_Ver\\chromedriver.exe");
		 driver=new ChromeDriver();
			
		}
		else {
			System.out.println("Enter the correct browser name:");
		}
		return driver;
	}
	
	public static void screenshot(String a) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\tmani\\eclipse-workspace\\Own_project\\Glory\\"+a+".png");
		FileUtils.copyFile(Source, destination);
	}
	
	public static void action(String actionName, WebElement element) {
		Actions a =new Actions(driver);
		if (actionName.equalsIgnoreCase("Clickon")) {
			a.click(element).build().perform();
		}
			else if (actionName.equalsIgnoreCase("Doubleclick")) {
				a.doubleClick(element).build().perform();
				
			}
			else if (actionName.equalsIgnoreCase("Moveto")) {
				a.moveToElement(element).build().perform();
			}
		}
	public static void window(String element) {
		driver.manage().window().maximize();
	}
	
	public static void close() {
		driver.close();
	}
	public static void drop(WebElement w,String type,String s,int i ) {
		Select ss =new Select(w);
		if (type.equals("value")) {
			ss.selectByValue(s);
			
		}
		else if (type.equals("text")) {
			ss.selectByVisibleText(s);
			
		}
		else {
			ss.selectByIndex(i);
		}
		
		
	}
	public static void quit() {
		driver.quit();
	}
	
	public static void javascript(String type,WebElement w,String s) {
		JavascriptExecutor j =(JavascriptExecutor)driver;
		if (type.equals("scrolltoview")) {
			j.executeScript("arguments[0].scrollintoView();",w);
			
		}
		else if (type.equals("scroll")) {
			j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			
		}
	}
	
	public static void wait(String s , int i) throws InterruptedException {
		if (s.equals("sleep")) {
			Thread.sleep(i);
			
		}
		else if (s.equals("implicit")) {
			driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
			
		}
	}
	
}
