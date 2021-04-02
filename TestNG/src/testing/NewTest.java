package testing;

import org.testng.annotations.Test;
import org.testng.Assert;
public class NewTest {
  @Test
  public void testA() {	  	  
	  Assert.assertEquals("Gmail","Gmail");	  	 
  }
  
  @Test
  public void testC() {	  
	  Assert.assertEquals("Google", "Google");	  
  }
  
  @Test
  public void testB() {
	  Assert.assertEquals("Yahoo", "Yaho");
  }
}
