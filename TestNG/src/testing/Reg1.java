package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Reg1 {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(how=How.ID, using="pass")
	WebElement pwd;
	
	Reg1(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void txtemailid(String email)
	{
		emailid.sendKeys(email);
	}
	
	public void txtpwd(String password)
	{
		pwd.sendKeys(password);
	}
	
	
	

}
