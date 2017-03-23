package com.qspiders.BlackBelt.Set8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap_Iterate {

	public static void main(String[] args) {

		HashMap hMap = new HashMap();
		
		hMap.put("1", "One");
		hMap.put("4", "Four");
		hMap.put("3", "Three");
		hMap.put("2", "Two");
		
		Collection c = hMap.values();
		
		Iterator itr = c.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
