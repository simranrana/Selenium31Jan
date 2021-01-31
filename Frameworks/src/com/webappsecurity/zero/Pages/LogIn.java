package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	public LogIn(WebDriver driver) {
	// TODO Auto-generated constructor stub

		PageFactory.initElements(driver, this);

	}
	

	@FindBy(id="user_login")
	private WebElement uName;
	@FindBy(id="user_password")
	private WebElement uPass;
	@FindBy(name="submit")
	private WebElement uSignIn;
	@FindBy(css = "#login_form > div.alert.alert-error")
	private WebElement invalUser;
	
	public void applicationLogin(String loginName, String logPassword){
		
		uName.sendKeys(loginName);
		uPass.sendKeys(logPassword);
		uSignIn.click();
	}
	
	public String invalUserMsg() {
		String errMsg = invalUser.getText();
		return errMsg;
		
		
	}
	
	
}
