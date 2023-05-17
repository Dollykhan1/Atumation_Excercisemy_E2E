package smarttech.ny.elementpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import smarttech.ny.basepage.BasePage;
import smarttech.ny.generic.CommonUtil;

public class MasterPageFactory extends BasePage {
	//Initialization PageFactory
		
public MasterPageFactory(){	
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath="(//input[@name='email'])[1]")
	@CacheLookup
	private WebElement enterEmail;
	public WebElement getEnterEmail() {
		return enterEmail;
	}
	
	@FindBy(xpath="//input[@type='password']")
	@CacheLookup
	private WebElement enterPassword;
	public WebElement getEnterPassword() {
		return enterPassword;
	}
	
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	@CacheLookup
	private WebElement clickOnLoginBTN;
	public WebElement getclickOnLoginBTN() {
		return clickOnLoginBTN;
		
	}
		@FindBy(xpath = "//*[tex()='Home']")
	@CacheLookup
	private WebElement VerifyText;
	public WebElement getVerifyText() {
		return VerifyText;
		
	}
	@FindBy(xpath = "//*[text()='products']")
	@CacheLookup
	private WebElement clickOnProductMod;
	public WebElement getClickOnProductMod() {
		return clickOnProductMod;
	}
	
	public void getLogin(String userName,String Pwd) {
			getEnterEmail().sendKeys("userName");
			getEnterPassword().sendKeys("Pwd");
			
			CommonUtil.actionClick(getclickOnLoginBTN());
			
			}
	
		
	}
	

