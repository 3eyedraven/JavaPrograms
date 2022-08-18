package com.cg.project.collections;

import java.util.Comparator;

public class AssociateComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return o1.getBasicSalary-o2.getBasicSalary;

		return 0;
	}

}
