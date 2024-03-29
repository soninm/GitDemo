package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
	
	@Test
	public void titleCheck() throws MalformedURLException
	{
		MutableCapabilities caps = new MutableCapabilities();
		
		WebDriver driver = new RemoteWebDriver(new URL("https://browserstack.com/wd/hub"),caps);
		driver.get("https://rahulshettyacademy.com");
		Assert.assertTrue(driver.getTitle().matches("Rahul Shetty Academy"));
		System.out.println("Git commit changes");
		System.out.println("Checking updated file in repository");
		
	}

}
