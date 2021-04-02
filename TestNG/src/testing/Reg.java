package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reg {
	
	WebDriver driver;
	
	By emailid = By.id("email");
	By password = By.id("pass");
	
	Reg(WebDriver d)
	{
		driver=d;
	}
	
	public void txtemailid(String email)
	{
		driver.findElement(emailid).sendKeys(email);
	}
	
	public void txtpwd(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);		}

}
