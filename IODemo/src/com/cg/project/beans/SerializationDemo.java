package com.cg.project.beans;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

public class SerializationDemo {
	public static void doSerialization(File file) throws FileNotFoundException,IOException {
		try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))){
			Customer customer = new Customer(111,"Satish","M",new Address("Pune","India"));
			writer.writeObject(customer);
			System.out.println(file.getAbsolutePath());
		}
		
	}
	public static void doDeSerialization(File file) throws FileNotFoundException,IOException,ClassNotFoundException {
		try(ObjectInputStream reader = new ObjectInputStream(new FileInputStream(file))){
			//Customer customer = new Customer(111,"Satish","M",new Address("Pune","India"));
			Customer customer=(Customer) reader.readObject();
			System.out.println(customer);
		}
	}}
