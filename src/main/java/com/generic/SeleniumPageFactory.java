package com.generic;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPageFactory {
	
	public SeleniumPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//login 
	@FindBy(xpath = "//*[@name='username']")
	private WebElement user;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbtn;
	@FindBy(xpath = "//*[text()='Log Out']")
	private WebElement logoutbtn;
	@FindBy(xpath ="//*[text()='An internal error has occured and has been logged'" )
	private WebElement errorMsgWithInvalidCredential;
	@FindBy(xpath = "//*[text()='Please enter a username and password.']")
	private WebElement errorMsgWithNullCredential;
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	public WebElement getErrorMsgWithInvalidCredential() {
		return errorMsgWithInvalidCredential;
	}
	public WebElement getErrorMsgWithNullCredential() {
		return errorMsgWithNullCredential;
	}
	
	
	
}
