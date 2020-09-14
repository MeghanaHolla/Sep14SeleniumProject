package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	
	@FindBy(id="tf_fromAccountId")
	private WebElement fromAcc;
	
	@FindBy(id="tf_toAccountId")
	private WebElement toAcc;
	
	@FindBy(id="tf_amount")
	private WebElement amt;
	
	@FindBy(id="tf_description")
	private WebElement desc;
	
	@FindBy(id="btn_submit")
	private WebElement contineBtn;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void fundTransfer(String amount, String description) {
		Select fAcc = new Select(fromAcc);
		fAcc.selectByIndex(2);
		
		Select tAcc = new Select(toAcc);
		tAcc.selectByIndex(3);
		
		amt.sendKeys(amount);
		desc.sendKeys(description);
		contineBtn.click();
	}
	

}
