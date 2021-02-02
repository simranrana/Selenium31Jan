package com.webappsecurity.zero.TestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountSummary;
import com.webappsecurity.zero.Pages.LogIn;
import com.webappsecurity.zero.Pages.TransferFunds;
import com.webappsecurity.zero.Pages.TransferFundsConfPage;
import com.webappsecurity.zero.Pages.TransferFundsVerifyPage;

import utils.GenericMethods;



public class verifyFundTransferTest extends Base {

	@Test
	public void verifyFundTransfer() throws IOException {
		//Changes made
		LogIn lP = new LogIn(driver);
		AccountSummary aSmry = new AccountSummary(driver);
		TransferFunds tFunds = new TransferFunds(driver);
		TransferFundsVerifyPage trnfVerify = new TransferFundsVerifyPage(driver);
		TransferFundsConfPage trFundCnf = new TransferFundsConfPage(driver);
		String[][] data = GenericMethods.getData("G:\\Selenium_19_6\\GIT\\GITJan31\\Frameworks\\TestData\\TestDataSheet.xlsx", "Sheet1");
		
		for(int i = 1; i<data.length; i++) {
		lP.applicationLogin(data[i][0], data[i][1]);
		aSmry.clickTransferFunds();
		tFunds.doFundTrf(data[i][2], data[i][3]);
		trnfVerify.verify(); 
		String actualMsg = trFundCnf.cnf();
		String expectedMsg = data[i][4]; 
		Assert.assertEquals(actualMsg, expectedMsg); 
		trFundCnf.logout();
		driver.get("http://zero.webappsecurity.com/login.html");
		}
	}
	
}
