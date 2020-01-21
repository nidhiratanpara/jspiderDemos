package com.demo.propertys;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {
public static void main(String[] args) {
	
	
	Properties prop=new Properties();
	FileReader fr=null;
	
	try {
		fr=new FileReader("config/data.property");
		prop.load(fr);
		String username=prop.getProperty("user");
		String password=prop.getProperty("pwd");
		System.out.println(username+" "+password);
		String gender=prop.getProperty("gen","key not found");
		System.out.println(gender);
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally {
		if(fr!=null)
		{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
}
