package com.cg.project.collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class MapClassesDemo {
	public static void hashTableClassWork() {
		Hashtable<Integer, Associate> associates = new Hashtable<>();
		associates.put(112,new Associate(112,"Ayush","Patil",17980));
		associates.put(114,new Associate(112,"Ayush2","Patil2",17984));
		associates.put(115,new Associate(112,"Ayush3","Patil3",17940));
		associates.put(118,new Associate(112,"Ayush4","Patil4",17480));
		associates.put(119,new Associate(112,"Ayush5","Patil5",14980));
		Associate associate = associates.get(112);
		associates.remove(112);
		Set<Integer> keys=associates.keySet();
		for (Integer key : keys)
		{
			System.out.println(associates.get(keys));
		}
		ArrayList<Associate> associateList=new ArrayList<>(associates.values());
		
	}

}
