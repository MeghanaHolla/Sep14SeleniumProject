package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmation {
	
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement transMsg;
	
	@FindBy(css="#settingsBox > ul > li:nth-child(3) > a")
	private WebElement uName;
	
	@FindBy(id="logout_link")
	private WebElement logout;
	
	public TransferFundsConfirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String getMsg() {
		String transactionSuccMsg = transMsg.getText();
		return transactionSuccMsg;
	}

	public void logoutfromApplication() {
		uName.click();
		logout.click();
	}
}
