package com.crm.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBaseClass;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.RegisterPage;
import com.crm.qa.utiles.TestUtils;

public class registerPageTest extends TestBaseClass{
	
	RegisterPage register;
	TestUtils utilPage;
	
	String sheetName = "registerForm";
	
	public registerPageTest(){
		super();
	}
	
	@Test
	public void setUp(){
		try {
			Thread.sleep(5000);
			initialization();
			register = new RegisterPage();
			utilPage = new TestUtils();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void validateRegisterButton()
	{
		register.clickRegisterButton();
		System.out.println("rigister button cliked");
		
	}
	
//	@DataProvider
//	public Object[][] getOgangetestData(){
//		Object data[][] = TestUtils.getTestData(sheetName);
//		return data;
//	}
//	
	
	@Test(priority=2)
	public void validateRegisterForm()
	{
		register.RegisterForm("Sanjana", "sanjana_gururaj@covalence.com", "CDS", "7996810416");
		
		
	}
	
	@Test(priority=3)
	
	public void validateCountryDropdown()
	{
		register.selectDropdown("India");
		System.out.println("selectDropdown cliked");
		
	}
	
	@Test(priority=4)
	public void validateSubmitForm() {
		register.clickSubmitForm();
		System.out.println("submit button cliked");
		
	}

}
