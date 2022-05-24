package demopack;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC1 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	
	
	@Test()
	public void TestB() //Login
	{
		System.out.println("testB");
		Assert.fail();
	}
	

	@Test(dependsOnMethods= {"TestB","TestC"})
	public void TestA() //Home
	{
		System.out.println("testA");
	
	}
	
	
	@Test
	public void TestC()
	{
		System.out.println("testC");
	}
	


	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}

}
