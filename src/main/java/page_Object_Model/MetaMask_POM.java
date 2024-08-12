package page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MetaMask_POM {
	
	@FindBy(xpath="//input[@id='onboarding__terms-checkbox']")
	private WebElement checkboxonboardingterms;
	
	
	@FindBy(xpath="//button[text()='Create a new wallet']")
	private WebElement btn_Create_a_new_wallet;
	
	@FindBy(xpath="//input[@id='metametrics-opt-in']")
	private WebElement checkbox_metametrics_opt_in;
	
	@FindBy(xpath="//button[text()='I agree']")
	private WebElement btn_IAgree;
	
	@FindBy(xpath="(//div[@class='form-field__heading']/following-sibling::input)[1]")
	private WebElement txt_NewPassowrd;
	
	@FindBy(xpath="(//div[@class='form-field__heading']/following-sibling::input)[2]")
	private WebElement txt_ConfirmPassowrd;
	
	@FindBy(xpath="//input[@class='check-box far fa-square']")
	private WebElement checkbox_IUndeerstand_MetaMask;
	
	@FindBy(xpath="//button[text()='Create a new wallet']")
	private WebElement btn_CreateA_New_Wallet;
	
	
	@FindBy(xpath="//button[text()='Remind me later (not recommended)']")
	private WebElement btn_remind_Me_Later;
	
	@FindBy(xpath="//input[@class='check-box skip-srp-backup-popover__checkbox far fa-square']")
	private WebElement checkbox_Account_Security;
	
	@FindBy(xpath="//button[text()='Skip']")
	private WebElement btn_Skip_Account_Security;
	
	
	@FindBy(xpath="//button[text()='Got it']")
	private WebElement btn_Got_It;
	
	
	@FindBy(xpath="//button[text()='Next']")
	private WebElement btn_Next;
	
	@FindBy(xpath="//button[text()='Done']")
	private WebElement btn_Done;
	

	@FindBy(xpath="//button[text()='Enable']")
	private WebElement btn_Enable;
	
	@FindBy(xpath="//button[contains(@class,'mm-box app-header__logo-container app-header')]")
	private WebElement txt_Account;
	
	
	
	


	


	public WebElement getBtn_Create_a_new_wallet() {
		return btn_Create_a_new_wallet;
	}


	public WebElement getCheckbox_metametrics_opt_in() {
		return checkbox_metametrics_opt_in;
	}


	public WebElement getBtn_IAgree() {
		return btn_IAgree;
	}


	public WebElement getTxt_NewPassowrd() {
		return txt_NewPassowrd;
	}


	public WebElement getTxt_ConfirmPassowrd() {
		return txt_ConfirmPassowrd;
	}


	public WebElement getCheckbox_IUndeerstand_MetaMask() {
		return checkbox_IUndeerstand_MetaMask;
	}


	public WebElement getBtn_CreateA_New_Wallet() {
		return btn_CreateA_New_Wallet;
	}


	public WebElement getBtn_remind_Me_Later() {
		return btn_remind_Me_Later;
	}


	public WebElement getCheckbox_Account_Security() {
		return checkbox_Account_Security;
	}


	public WebElement getBtn_Skip_Account_Security() {
		return btn_Skip_Account_Security;
	}


	public WebElement getBtn_Got_It() {
		return btn_Got_It;
	}


	public WebElement getBtn_Next() {
		return btn_Next;
	}


	public WebElement getBtn_Done() {
		return btn_Done;
	}


	public WebElement getBtn_Enable() {
		return btn_Enable;
	}


	public WebElement getTxt_Account() {
		return txt_Account;
	}


	public WebElement getCheckboxonboardingterms() {
		return checkboxonboardingterms;
	}
	

}
