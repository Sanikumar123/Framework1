package zoho.homepage.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.utility.DriverFactory;

import zoho.loginpage.pageclass.ZohoSignInPage;



public class ZohoHomepage {
	
	@FindBy(xpath="//a[text()='LOGIN']")
	WebElement loginBtn;
	
	@FindBy(xpath="//input[@id='signupbtn']")
	WebElement getStartedbtn;
	
	void ZohoHomepage()
	{
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	
	public void verifyHomePageTitle(String expectedTitle)
	{
		String actualTitle = DriverFactory.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public ZohoSignInPage clickOnLoginBtn()
	{
		loginBtn.click();
		return new ZohoSignInPage();
	}

	
	
	
	
}
