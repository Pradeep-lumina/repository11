package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest4 {
	
	@Test 
	  public void testA() {	  	  
		  Assert.assertEquals("Gmail","Gmail");	  	 
	  }
	  
	  @Test (dependsOnMethods="testB", alwaysRun=true)
	  public void testC() {	  
		  Assert.assertEquals("Google", "Google");	  
	  }
	  
	  @Test (dependsOnMethods="testA")
	  public void testB() {
		  Assert.assertEquals("Yahoo", "Yaho");
	  }


}
