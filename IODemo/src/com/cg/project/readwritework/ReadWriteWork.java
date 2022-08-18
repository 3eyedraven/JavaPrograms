package com.cg.project.readwritework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ReadWriteWork {
	/*public static void byteStreamReadWrite(File fileFrom, File fileTo) throws IOException {
		try(BufferedInputStream src = new BufferedInputStream(new FileInputStream(fileFrom))){
			try (BufferedOutputStream dest = new BufferedOutputStream(new FileOutputStream(fileTo))){
				byte[] dataBuffer = new byte[(int)fileFrom.length()];
				src.read(dataBuffer);
				dest.write(dataBuffer);	
			}
		}
		System.out.println("File Transfer to: "+fileTo.getAbsolutePath());
	}
	
	public static void characterStreamReadWrite(File fileFrom, File fileTo) throws IOException {
		try(BufferedReader src = new BufferedReader(new FileReader(fileFrom))){
			try (BufferedWriter dest = new BufferedWriter(new FileWriter(fileTo))){
				String data="";
				while((data=src.readLine())!=null)
					dest.write(data);
				//byte[] dataBuffer = new byte[(int)fileFrom.length()];
				//src.read(dataBuffer);
				//dest.write(dataBuffer);	
			}
		}
		System.out.println("File Transfer to: "+fileTo.getAbsolutePath());
	}*/
	
	
	public static void propertiesWork(File fileFrom) throws FileNotFoundException,IOException {
		Properties projectProperties= new Properties();
		projectProperties.load(new FileInputStream(fileFrom));
		String key1=projectProperties.getProperty("key1");
		String key2=projectProperties.getProperty("key2");
		String key3=projectProperties.getProperty("key3");
		String key4=projectProperties.getProperty("key4");
		
		System.out.println(key1+" "+key2+" "+key3+" "+key4);
		
	}
}
