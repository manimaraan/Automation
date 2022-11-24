package com.auto.properties;

import com.auto.help.Confi_Reader;

public class File_Read_manger {
	
	private File_Read_manger() {
		
	}
	
	
	public static File_Read_manger Inst() {
		File_Read_manger helper = new File_Read_manger();
		return helper;
	}
	
   public Confi_Reader Instance() throws Throwable {
	
	   Confi_Reader reader = new Confi_Reader();
	   return reader;

}

}
