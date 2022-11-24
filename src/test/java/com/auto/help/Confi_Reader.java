package com.auto.help;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Confi_Reader {
	public static Properties p;
	
	public Confi_Reader() throws Throwable {
		File ff = new File("C:\\Users\\tmani\\eclipse-workspace\\automation\\src\\test\\java\\com\\auto\\properties\\confi.properties");
		FileInputStream fi = new FileInputStream(ff);
		
		p= new Properties();
		p.load(fi);
	}
	
	public String getbrowser() {
		String browser = p.getProperty("browser");
       return browser;
	}
	
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getemail() {
		String email = p.getProperty("email");
		return email;
	}
	
	public String getpass() {
		String password = p.getProperty("pass");
		return password;
	}

}
