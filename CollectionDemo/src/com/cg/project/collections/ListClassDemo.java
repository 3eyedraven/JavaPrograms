package com.cg.project.collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListClassDemo {

	public static void arrayListClassDemo() {
		 ArrayList<String> strList=new ArrayList<>();
		 //insert
		  
		 strList.add("Satish");
		 strList.add("Kumar");
		 strList.add("Nilesh");
		 strList.add("Rakesh");
		 strList.add("Ayush");
		 strList.add("Satish");
		 strList.add("Mayur");
		 
		 ArrayList<Associate> associates=new ArrayList();
		 associates.add(new Associate(112,"Ayush","Patil",17980));
		 associates.add(new Associate(112,"Mayur","Patil",17940));
		 associates.add(new Associate(112,"Nilesh","Patil",17180));
		 
		 
		  
		 System.out.println(strList);
		  
		 //search
		  
		 String nameToBeSearch="Ayush";
		 System.out.println(strList.contains(nameToBeSearch));
		 
		 //remove
		 
		 String nameToRemove="Kumar";
		 System.out.println(strList.remove(nameToRemove));
		 
		 //sort
		 Collections.sort(associates);
		 for (Associate associate : associates)
		 {
			 System.out.println(associate);
		 }
		 System.out.println("========================");
		 Collections.sort (associates, new AssociateComparator());
		 for (Associate associate : associates)
		 {
			 System.out.println(associate);
		 }
		 
		 //iterate

	}
	public static void linkedListClassDemo() {
		LinkedList<String> strList=new LinkedList<>();
		LinkedList<Associate> associates=new LinkedList();
		associates.add(new Associate(112,"AyushZ","PatilZ",17980));
		associates.add(new Associate(112,"MayurZ","PatilZ",17940));
		associates.add(new Associate(112,"NileshZ","PatilZ",17180));
		
	}
}
