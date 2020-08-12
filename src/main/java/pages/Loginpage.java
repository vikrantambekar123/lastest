package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class Loginpage extends Baseclass 
{
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	public Loginpage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void title()
	{	
		System.out.println("Title is :-"+driver.getTitle());
	}
	
	public void logincredentials()
	{
		username.sendKeys("vikrant5233");
		password.sendKeys("5233");
	}
	
	public void teardown()
	{
		driver.close();
	}
	
	
}
