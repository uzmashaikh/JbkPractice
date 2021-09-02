package com.jbk.myapp.collections;

import java.util.Comparator;

public class NameComparator implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator s1, StudentComparator s2) {
		// TODO Auto-generated method stub
		return s1.name.compareTo(s2.name);
	}

}
