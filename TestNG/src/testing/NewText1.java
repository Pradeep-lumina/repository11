package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewText1 {
	
	@Test (priority=2)
	  public void testA() {	  	  
		  Assert.assertEquals("Gmail","Gmail");	  	 
	  }
	  
	  @Test (groups="smoke")
	  public void testC() {	  
		  Assert.assertEquals("Google", "Google");	  
	  }
	  
	  @Test (groups="smoke")
	  public void testB() {
		  Assert.assertEquals("Yahoo", "Yahoo");
	  }

}
