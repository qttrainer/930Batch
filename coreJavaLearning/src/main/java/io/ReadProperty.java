package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\or.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url").length());
		System.out.println(prop.getProperty("userid").length());
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\or2.properties");
	Properties write_prop = new Properties();
	write_prop.setProperty("url", "www.facebook.com");
	write_prop.store(fos, null);
	fos.close();
	}

}
