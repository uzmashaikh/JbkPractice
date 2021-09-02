package com.jbk.myapp.collections;

import java.util.Comparator;

public class RollNoComparator implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator s1, StudentComparator s2) {
		// TODO Auto-generated method stub
		if(s1.rollno==s2.rollno)
			return 0;
		else if(s1.rollno==s2.rollno)
			return 1;
		else 
			return -1;
	}

}
