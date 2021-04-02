package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void login_page() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\FITA\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		Reg1 Rpage = new Reg1(driver);
		
		driver.get("https://www.facebook.com/");
		
		Rpage.txtemailid("Testing");
		Thread.sleep(2000);
		
		Rpage.txtpwd("password");
		
	}

}
