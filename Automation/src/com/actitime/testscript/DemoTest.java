package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest
{
   @Test(dependsOnMethods="createCustomer")
public void createCustomer()
{
	Reporter.log("createCustomer",true);
	
}
   @Test(dependsOnMethods="createCustomer")
public void modifiedCustomer()
{
	Reporter.log("modifiedCustomer",true);
}
   @Test(priority=2,dependsOnMethods="createCustomer")
   public void deleteCustomer()
   {
   	Reporter.log("deleteCustomer",true);
   }
  
}
