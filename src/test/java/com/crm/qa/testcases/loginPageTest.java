package com.crm.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.crm.qa.base.TestBaseClass;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class loginPageTest extends TestBaseClass {
	
	LoginPage loginPage;
	HomePage homePage;
	
	public loginPageTest(){
		super();
	}
	
	@Test
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
//	@Test(priority=1)
//	public void loginPageTitleTest(){
//		String title = loginPage.validateLoginPageTitle();
//		System.out.println("title is " + title);
//		Assert.assertEquals(title, "free crm publisher log");
//	}
//	
	@Test(priority=1)
	public void loginTest(){
	
		try {
	
		Thread.sleep(10000);
		 loginPage.login(prop.getProperty("username"), prop.getProperty("passward"));
	}catch (Exception e) {
		System.out.println("failed in login");
	}
	}
	
	
	
//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//	}

}
