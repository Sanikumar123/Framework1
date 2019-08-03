package zoho.signinpage.suitepack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.basetest.BaseTest;

import zoho.crm.homepage.pageclass.ZohoCRMHomepage;
import zoho.homepage.pageclass.ZohoHomepage;
import zoho.loginpage.pageclass.ZohoSignInPage;

public class ZohoSignInPageTest extends BaseTest {
	
	ZohoHomepage homepage;
	ZohoSignInPage signInPage;
	ZohoCRMHomepage crmhomepage;
	
	@BeforeMethod
	public void intialization()
	{
		launchBrowser();
		homepage=new ZohoHomepage();
		signInPage = homepage.clickOnLoginBtn();
		
	}
	
	@Test
	public void validateSignInFunctionality()
	{
		crmhomepage = signInPage.loginToZoho(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
	}
	
	
	@AfterMethod
	public void quit()
	{
		tearDown();
	}

}
