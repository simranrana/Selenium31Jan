package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsVerifyPage {
	
	public TransferFundsVerifyPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}
		
	
	@FindBy(id = "btn_submit")
	private WebElement sbmtVerify;
	
	public void verify() {
		sbmtVerify.click();
		
	}

}
