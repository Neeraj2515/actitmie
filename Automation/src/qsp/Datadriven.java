package qsp;

import java.io.IOException;

import com.actitime.generics.Filelib;

public class Datadriven {

	public static void main(String[] args) throws IOException {
		Filelib f=new Filelib();
		String url = f.getpropertyvalue("URL");
		System.out.println(url);
		String un = f.getpropertyvalue("USERNAME");
		System.out.println(un);
		String pw = f.getpropertyvalue("PASSWORD");
		System.out.println(pw);
		 String value = f.getExcelDataValue("CreateCustomer", 1, 2);
		 System.out.println(value);
		  f.setExcelsheet("user", 2, 0, "https://www.youtube.com/");
	  String data1 = f.getExcelsheet("user", 2, 0);
	  System.out.println(data1);
		
	}           
}






















