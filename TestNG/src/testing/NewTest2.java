package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	public WebDriver driver = null;
	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (groups="smoke")
	public void login() {
		
		driver.get("https://gmail.com");
		
	}

	@Test (groups={"sanity","smoke"})
	public void search()
	{
		driver.get("https://facebook.com");
	}
	
	@Test (dependsOnMethods="search")
	public void advancedsearch() {
		System.out.println("Advanced search successful");
	}
	
	@Test (dependsOnMethods="advancedsearch")
	public void logout() {
		System.out.println("Logout successful");
	}
}
