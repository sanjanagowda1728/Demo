package com.crm.qa.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBaseClass;

public class LoginPage extends TestBaseClass {
	
	@FindBy(xpath="//span[text()='Log In']")
	WebElement signupbutton;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbutton;
	
	//initialize the page object
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
		
	}
	
	public void login(String un, String pwd) {
		try {
			Thread.sleep(10000);
			
			signupbutton.isDisplayed();
			signupbutton.click();
			
		Thread.sleep(10000);
		email.click();
		email.sendKeys(un);
		Thread.sleep(5000);
		password.click();
		password.sendKeys(pwd);
		loginbutton.click();
		}
		catch (Exception e) {
			System.out.println("login failed");
		}
		
		//return new HomePage();
	}
	

}
