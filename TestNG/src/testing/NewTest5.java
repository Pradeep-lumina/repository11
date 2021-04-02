package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest5 {
	
	@Test
	  public void testA() {	  	  
		  Assert.assertEquals("Gmail","Gmail");	  	 
	  }
	  
	  @Test(enabled=false)
	  public void testC() {	  
		  Assert.assertEquals("Google", "Google");	  
	  }
	  
	  @Test
	  public void testB() {
		  Assert.assertEquals("Yahoo", "Yaho");
	  }

}
