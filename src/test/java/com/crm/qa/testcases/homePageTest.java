package com.crm.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBaseClass;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utiles.TestUtils;


// reporter Sanjana 123SS
public class homePageTest extends TestBaseClass {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtils utilPage;
	
	public homePageTest(){
		super();
	}
	
	@Test
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
		utilPage = new TestUtils();
		loginPage.login(prop.getProperty("username"), prop.getProperty("passward"));
	}
	
//	@Test(priority=1)
//	public void validateHomePageTitle()
//	{
//		String homePageTitle = homePage.validateHomePageTitle();
//		assertEquals(homePageTitle, "Cogmento CRM" , "validation failed");
//	}
	
	@Test(priority=1)
	public void ValidateContact()
	{
		
		homePage.clickContactButton();
		homePage.clickCalenderButton();
		homePage.clickCompeniesButton();
	}

}
