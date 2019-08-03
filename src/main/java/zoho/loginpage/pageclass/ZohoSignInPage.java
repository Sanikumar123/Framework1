package zoho.loginpage.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.DriverFactory;

import zoho.crm.homepage.pageclass.ZohoCRMHomepage;

public class ZohoSignInPage {
	
	@FindBy(xpath="//input[@id='lid']")
	WebElement uname;
	
	@FindBy(xpath="//input[@id='pwd']")
	WebElement pwd;
	
	@FindBy(xpath="//div[@id='signin_submit']")
	WebElement signInbtn;
	
	void ZohoSignInPage()
	{
		PageFactory.initElements(DriverFactory.getDriver(),this);
	}
	
	public ZohoCRMHomepage loginToZoho(String username, String password)
	{
		uname.sendKeys(username);
		pwd.sendKeys(password);
		signInbtn.click();
		return new ZohoCRMHomepage();
	}
	

}
