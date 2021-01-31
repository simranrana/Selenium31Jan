package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TransferFunds {
	
	public TransferFunds(WebDriver driver) {
		// TODO Auto-generated constructor stub
			PageFactory.initElements(driver, this);
		}
		

	@FindBy(id="tf_fromAccountId")
	private WebElement frmAcc;
	
	@FindBy(id="tf_toAccountId")
	private WebElement toAcc;

	@FindBy(name="amount")
	private WebElement amt ;
	

	@FindBy(id="tf_description")
	private WebElement desc;

	@FindBy(id="btn_submit")
	private WebElement contBttn;

	public void doFundTrf(String amount, String description) {
	Select ddFrom = new Select(frmAcc);
	ddFrom.selectByIndex(2);
	
	Select ddTo = new Select(toAcc);
	ddTo.selectByIndex(3);
	
	amt.sendKeys(amount);
	desc.sendKeys("Savings to Loan Account");
		
	contBttn.click();
}

}
