package com.cg.project.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.cg.project.beans.SerializationDemo;
import com.cg.project.readwritework.ReadWriteWork;

public class MainClass {
	
	public static void main(String[] args) {
		try {
			//File file= new File("D:\\dataFile.txt");
			//if(!file.exists())
			//{
			//	file.createNewFile();
			//}
			//System.out.println(file.canWrite());
			//System.out.println(file.canExecute());
			//System.out.println(file.getName());
			//System.out.println(file.getAbsolutePath());
			//System.out.println(file.getPath());
			//System.out.println(file.length());//
	//}
		//catch (IOException e)
		//{
			//e.printStackTrace();
		//}
		/*File fileFrom = new File(".//resources//project.properties");
		try {
			ReadWriteWork.propertiesWork(fileFrom);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		File file = new File("D:\\customerdata.txt");
		SerializationDemo.doSerialization(file);
		SerializationDemo.doDeSerialization(file);
		}
		catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}
	


