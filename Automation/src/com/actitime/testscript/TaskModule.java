package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass;

public class TaskModule extends Baseclass
{
	@Test
	public void CreateTask()
	{
		Reporter.log("CreateTask",true);
	}
}
