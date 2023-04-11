package com.actitime.testscript;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class Customermodule extends Baseclass 
{
//	@Test
//	public void testCreateCustomer() 
//	{
//		Reporter.log("CreateCustomer",true);
//	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@Test
	public void RegisterCustomer() 
	{
		Reporter.log("RegisterCustomer",true);
	}
	@Test
	public void DeleteCustomer() 
	{
		Reporter.log("DeleteCustomer",true);
	}
	@Test(priority=1,invocationCount=2)
	public void EditCustomer() 
	{
		Reporter.log("EditCustomer",true);
	}
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closeBrowser",true);
	}
}

