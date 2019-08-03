package zoho.homepage.suitepack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.basetest.BaseTest;
import com.utility.ConstantClass;

import bsh.org.objectweb.asm.Constants;
import zoho.homepage.pageclass.ZohoHomepage;
import zoho.loginpage.pageclass.ZohoSignInPage;

public class ZohoHomePageTest extends BaseTest {
	
	ZohoHomepage homepage;
	ZohoSignInPage signInPage; 
	
	@BeforeMethod
	public void initialization()
	{
		launchBrowser();
		homepage=new ZohoHomepage();
		
	}
	
	@Test
	public void validateZohoHomepageTitle()
	{
		homepage.verifyHomePageTitle(ConstantClass.EXPECTED_TITLE);
	}
	
	@Test
	public void clickOnLoginBtn()
	{
		signInPage = homepage.clickOnLoginBtn();
	}
	
	@AfterMethod
	public void quit()
	{
		tearDown();
	}
}
