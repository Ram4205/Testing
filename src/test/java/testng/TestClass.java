package testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTest.class)
public class TestClass 
{
	
	@Test
	public void passTest()
	{
		System.out.println("This is passed test");
		Assert.assertTrue(true);
	}

	@Test
	public void failTest()
	{
		System.out.println("this is failed test");
		Assert.assertTrue(false);
	
	}
}
