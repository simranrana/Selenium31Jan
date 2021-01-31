package com.webappsecurity.zero.Pages;

import javax.swing.text.html.CSS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfPage {
	
	public TransferFundsConfPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}
		

	@FindBy(css ="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confirmationMsgBox;
	
	@FindBy(css = "#settingsBox > ul > li:nth-child(3) > a")
	private WebElement userName;
	
	@FindBy(id = "logout_link")
	private WebElement logOut;
	
	public void logout() {
		userName.click();
		logOut.click();
	}
	
	public  String cnf() {
		String msg = confirmationMsgBox.getText();
		return msg;
	
		
	
	}
	
	
}
