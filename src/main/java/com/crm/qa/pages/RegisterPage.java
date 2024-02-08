package com.crm.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBaseClass;

public class RegisterPage extends TestBaseClass{
	
	@FindBy(xpath="//div[@id='navbarSupportedContent']//div[2]//ul//li[1]//a//button")
	WebElement registerbutton;
	
	@FindBy(xpath="//input[@id='Form_getForm_FullName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='Form_getForm_Email']")
	WebElement bussinessEmail;
	
	@FindBy(xpath="//input[@id='Form_getForm_CompanyName']")
	WebElement companyName;
	
	@FindBy(xpath="//select[@id='Form_getForm_Country']")
	WebElement countryDropDown;
	
	@FindBy(xpath="//input[@id='Form_getForm_Contact']")
	WebElement contactNumber;
	
	@FindBy(xpath="//iframe[@title=\"reCAPTCHA\"]")
	WebElement captcha;
	
	@FindBy(xpath="//input[@id='Form_getForm_action_submitForm']")
	WebElement submitForm;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegisterButton() {
		try {
			Thread.sleep(10000);
			registerbutton.click();
			System.out.println("rigister button cliked");
			
		} catch (Exception e) {
			System.out.println("rigister button not cliked");
		}
	}
	public void RegisterForm(String frstName , String businessEmail , String cmpName , String phoneNumber) {
		firstName.sendKeys(frstName);
		bussinessEmail.sendKeys(businessEmail);
		companyName.sendKeys(cmpName);
		contactNumber.sendKeys(phoneNumber);	
		
	}
	
	public void selectDropdown(String option) {
		Select select = new Select(countryDropDown);
		select.selectByVisibleText(option);
		
	}
	
	public void clickSubmitForm() {
		captcha.click();
		submitForm.click();
	}

}
