package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.basetest.BaseTest;

public class TestClass extends BaseTest {
	
	public static void main(String[] args) throws MalformedURLException {
		

       DesiredCapabilities cap = DesiredCapabilities.chrome();
       cap.setBrowserName("chrome");
       cap.setPlatform(Platform.WIN10);
       WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.5:5556/wd/hub"),cap);
		
		//System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32\\chromedriver.exe");
		
		driver.get("https://www.facebook.com");//launch facebook application.
		driver.manage().window().maximize();//maximizing browser.
	}

}
