package com.cg.beans;


public class MainClass {

	public static void main(String[] args) {
		Employee emp1=new Employee(47,"frank","castle",20200);
		
		Employee emp2=new Employee(47,"frank","castle",20200);
		// TODO Auto-generated method stub
		Object obj=emp2;
		if(emp1.equals(emp2))
			System.out.println("equal");
		else System.out.println("not equal");
		if (obj.equals(emp1))
			System.out.println("equal");
		else System.out.println("not equal");
	}

}
