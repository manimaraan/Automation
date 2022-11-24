package com.auto.step;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.auto.properties.File_Read_manger;
import com.auto.runner.Run;
import com.maven.automation.BaseClass;
import com.pom.automation.Fb_Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step  extends BaseClass{
	
	public static WebDriver driver =Run.driver;
	
	public static Fb_Pom f =new Fb_Pom(driver);
	
	@Given("user can launch the url")
	public void user_can_launch_the_url()throws Throwable {
		
		String url = File_Read_manger.Inst().Instance().geturl();
		geturl(url);

	}
	@When("user can enter the email id in the text box")
	public void user_can_enter_the_email_id_in_the_text_box()throws Throwable {
	 String email = File_Read_manger.Inst().Instance().getemail();
	 passValue(f.getEmai(), email);
	}
	@When("user can enter the password in the text box")
	public void user_can_enter_the_password_in_the_text_box()throws Throwable {
		String pass = File_Read_manger.Inst().Instance().getpass();
		passValue(f.getPasss(), pass);
	   	}
	@Then("user can enter the login button it navigate to next page")
	public void user_can_enter_the_login_button_it_navigate_to_next_page() throws Throwable{
	   ClickElement(f.getLog());
	}




}
