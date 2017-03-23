package com.qspiders.BlackBelt.Set8;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_max {

	public static void main(String[] args) 
	{
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(new Integer("327482"));
		arrayList.add(new Integer("13408"));
		arrayList.add(new Integer("802348"));
		arrayList.add(new Integer("345308"));
		arrayList.add(new Integer("509324"));
		
		Object obj = Collections.max(arrayList);
		
		System.out.println("Maximum Element of Java ArrayList is: " + obj);


	}

}
