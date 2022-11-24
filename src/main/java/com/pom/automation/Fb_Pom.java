package com.pom.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_Pom {
	static WebDriver driver;
	
	public Fb_Pom(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emai;
	
	@FindBy(id="pass")
	private WebElement passs;
	
	@FindBy(name="login") 
	private WebElement log;

	public WebElement getEmai() {
		return emai;
	}

	public WebElement getPasss() {
		return passs;
	}

	public WebElement getLog() {
		return log;
	}

}
