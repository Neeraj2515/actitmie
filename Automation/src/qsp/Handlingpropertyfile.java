package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Handlingpropertyfile {
	public static void main(String[] args) throws IOException {
    FileInputStream fis=new FileInputStream("./data/Commandata.property");
    Properties p=new Properties();
    p.load(fis);
    String url=p.getProperty("URL");
    String un=p.getProperty("USERNAME");
    String pw=p.getProperty("PASSWORD");
    System.out.println(url);
	System.out.println(un);
    System.out.println(pw);
    

	}

}
