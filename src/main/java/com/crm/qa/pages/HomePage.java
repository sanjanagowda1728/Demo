package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBaseClass;

public class HomePage extends TestBaseClass{
	
	@FindBy(xpath="//i[@class='users icon']")
	WebElement contactIcon;
	
	@FindBy(xpath="//div[3]/button[@class='ui mini basic icon button']")
	WebElement addContact;
	
	@FindBy(xpath="//i[@class='calendar icon']")
	WebElement calenderIcon;
	
	@FindBy(xpath="//div[2]/button[@class='ui mini basic icon button']")
	WebElement addcalender;
	
	@FindBy(xpath="//i[@class='building icon']")
	WebElement companiesIcon;
	
	@FindBy(xpath="//div[4]/button[@class='ui mini basic icon button']")
	WebElement addcompanies;
	
//	@FindBy(name="first_name")
//	WebElement firstName;
//	
//	@FindBy(name="last_name")
//	WebElement lastName;
//	
//	@FindBy(name="company")
//	WebElement companyName;
//	
//	@FindBy(name="category")
//	WebElement category;
//	
//	@FindBy(xpath="//span[text()='Affiliate']")
//	WebElement selectCategory;
//	
//	@FindBy(xpath="//span[text()='New']")
//	WebElement selectStatus;
//	
//	@FindBy(name="status")
//	WebElement status;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
		
	}
	
	public void clickContactButton() {
		try {
			Thread.sleep(10000);
			Actions action = new Actions(driver);
			action.moveToElement(contactIcon).build().perform();
		contactIcon.click();
		addContact.click();
		}catch (Exception e) {
			System.out.println("failed while clicking the cantact button");
		}
	}
	
	public void clickCalenderButton() {
		try {
		calenderIcon.click();
		addcalender.click();
	}catch (Exception e) {
		System.out.println("failed while clicking the calender button");
	}
	}
	
	public void clickCompeniesButton() {
		companiesIcon.click();
		addcompanies.click();
	}

}
